package com.hotel.platform.common.httpclient.commpent;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.security.KeyStore;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLContext;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.impl.nio.conn.PoolingNHttpClientConnectionManager;
import org.apache.http.impl.nio.reactor.DefaultConnectingIOReactor;
import org.apache.http.impl.nio.reactor.IOReactorConfig;
import org.apache.http.nio.conn.NoopIOSessionStrategy;
import org.apache.http.nio.conn.SchemeIOSessionStrategy;
import org.apache.http.nio.conn.ssl.SSLIOSessionStrategy;
import org.apache.http.nio.reactor.ConnectingIOReactor;
import org.apache.http.nio.reactor.IOReactorException;
import org.apache.http.ssl.SSLContexts;
import org.slf4j.Logger;

import com.hotel.platform.common.utils.LogUtil;
import com.hotel.platform.common.utils.StringUtil;

public final class HttpAsyncClientComponent {
    private static Logger LOGGER = LogUtil.getLogger(HttpAsyncClientComponent.class);
    private static final String[] TLS_PROTOCOLS = new String[] {"TLSv1", "TLSv1.1", "TLSv1.2", "SSLv3"};

    private static final Object CREATE_CONNECTION_LOCK = new Object();
    private static final String SSL_FILE_SUFFIX = "pfx";
    private static final String SSL_FILE_TYPE = "PKCS12";
    private static final int MAX_CONNECTION = 1000;
    private static final int MAX_DEFAULT_ROUTE = 20;

    private Map<String, CloseableHttpAsyncClient> httpClientMap;
    private List<PoolingNHttpClientConnectionManager> connectionManagerList;

    private HttpAsyncClientComponent() {
        httpClientMap = new ConcurrentHashMap<>();
        connectionManagerList = new Vector<>();
        Thread rcThread =
                Executors.defaultThreadFactory().newThread(new IdleConnectionMonitorThread(connectionManagerList));
        rcThread.setDaemon(true);
        rcThread.setName("release-expired-async-connection-io");
        rcThread.start();
    }

    public static HttpAsyncClientComponent getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private static class InstanceHolder {
        private static final HttpAsyncClientComponent INSTANCE = new HttpAsyncClientComponent();
    }

    /**
     * 获取asyncHttp链接
     * 
     * @return
     */
    public CloseableHttpAsyncClient createAsyncHttpClient() {
        return this.createAsyncHttpClient(null, null, null, null, null, null, null, false);
    }

    /**
     * 获取asyncHttp链接
     * 
     * @param sslPath
     * @param sslPwd
     * @param sslType
     * @param proxyURL
     * @param proxyPort
     * @param proxyUser
     * @param proxyPwd
     * @param isHttpsUrl
     * @return
     */
    public CloseableHttpAsyncClient createAsyncHttpClient(String sslPath, String sslPwd, String sslType,
            String proxyURL, Integer proxyPort, String proxyUser, String proxyPwd, boolean isHttpsUrl) {
        CloseableHttpAsyncClient asyncHttpClient = null;
        try {
            String key = String.format("%s_%s_%s_%s_%s_%s_%s",
                    StringUtil.isNullOrEmpty(sslPath) ? "0" : URLEncoder.encode(sslPath, "UTF-8"),
                    StringUtil.isNullOrEmpty(sslPwd) ? "0" : sslPwd, StringUtil.isNullOrEmpty(sslType) ? "0" : sslType,
                    StringUtil.isNullOrEmpty(proxyURL) ? "0" : proxyURL,
                    proxyPort == null ? "0" : String.valueOf(proxyPort),
                    StringUtil.isNullOrEmpty(proxyUser) ? "0" : proxyUser,
                    StringUtil.isNullOrEmpty(proxyPwd) ? "0" : proxyPwd);
            if (httpClientMap.containsKey(key)) {
                asyncHttpClient = httpClientMap.get(key);
            }
            if (asyncHttpClient == null) {
                synchronized (CREATE_CONNECTION_LOCK) {
                    if (!httpClientMap.containsKey(key)) {
                        asyncHttpClient = getCloseableHttpAsyncClient(sslPath, sslPwd, proxyURL, proxyPort, proxyUser,
                                proxyPwd, isHttpsUrl);
                        httpClientMap.put(key, asyncHttpClient);
                    } else {
                        asyncHttpClient = httpClientMap.get(key);
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error("create httpclient exception", e);
        }
        return asyncHttpClient;
    }

    /**
     * 获取异步httpclient
     *
     * @param sslPath
     * @param sslPwd
     * @param proxyURL
     * @param proxyPort
     * @param proxyUser
     * @param proxyPwd
     * @param isHttpsUrl
     * @return
     */
    private CloseableHttpAsyncClient getCloseableHttpAsyncClient(String sslPath, String sslPwd, String proxyURL,
            Integer proxyPort, String proxyUser, String proxyPwd, boolean isHttpsUrl) {
        SSLIOSessionStrategy sslIoSessionStrategy = getSslIoSessionStrategy(sslPath, sslPwd, isHttpsUrl);

        Registry<SchemeIOSessionStrategy> socketFactoryRegistry =
                getConnectionSocketFactoryRegistry(sslIoSessionStrategy);

        // 配置io线程
        IOReactorConfig ioReactorConfig = IOReactorConfig.custom()
                .setIoThreadCount(Runtime.getRuntime().availableProcessors()).setSoKeepAlive(true).build();
        // 设置连接池大小
        ConnectingIOReactor ioReactor = null;
        try {
            ioReactor = new DefaultConnectingIOReactor(ioReactorConfig);
        } catch (IOReactorException e) {
            LOGGER.error("create io reactor", e);
        }

        PoolingNHttpClientConnectionManager connManager =
                new PoolingNHttpClientConnectionManager(ioReactor, socketFactoryRegistry);
        connManager.setMaxTotal(MAX_CONNECTION);
        connManager.setDefaultMaxPerRoute(MAX_DEFAULT_ROUTE);
        connectionManagerList.add(connManager);

        HttpAsyncClientBuilder httpAsyncClient = HttpAsyncClients.custom().setConnectionManager(connManager);

        if (!StringUtil.isNullOrEmpty(proxyURL) && proxyPort != null) {
            httpAsyncClient.setProxy(new HttpHost(proxyURL, proxyPort));
        }
        if (!StringUtil.isNullOrEmpty(proxyUser) || !StringUtil.isNullOrEmpty(proxyPwd)) {
            UsernamePasswordCredentials credentials = new UsernamePasswordCredentials(proxyUser, proxyPwd);
            CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
            credentialsProvider.setCredentials(AuthScope.ANY, credentials);
            httpAsyncClient.setDefaultCredentialsProvider(credentialsProvider);
        }

        CloseableHttpAsyncClient asyncHttpClient = httpAsyncClient.build();
        asyncHttpClient.start();
        return asyncHttpClient;
    }

    /**
     * 
     * @param sslIoSessionStrategy
     * @return
     */
    private Registry<SchemeIOSessionStrategy> getConnectionSocketFactoryRegistry(
            SSLIOSessionStrategy sslIoSessionStrategy) {
        Registry<SchemeIOSessionStrategy> socketFactoryRegistry;
        socketFactoryRegistry = RegistryBuilder.<SchemeIOSessionStrategy>create()
                .register("http", NoopIOSessionStrategy.INSTANCE).register("https", sslIoSessionStrategy).build();
        return socketFactoryRegistry;
    }

    /**
     * 
     * @param sslPath
     * @param sslPwd
     * @param isHttpsUrl
     * @return
     */
    private SSLIOSessionStrategy getSslIoSessionStrategy(String sslPath, String sslPwd, boolean isHttpsUrl) {
        SSLIOSessionStrategy sslIoSessionStrategy = null;
        SSLContext sslcontext;
        FileInputStream srStore = null;
        try {
            if (isHttpsUrl) {
                if (!StringUtil.isNullOrEmpty(sslPath) && !StringUtil.isNullOrEmpty(sslPwd)) {
                    KeyStore keyStore;
                    if (sslPath.contains(SSL_FILE_SUFFIX)) {
                        keyStore = KeyStore.getInstance(SSL_FILE_TYPE);
                    } else {
                        keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                    }
                    srStore = new FileInputStream(sslPath);
                    keyStore.load(srStore, sslPwd.toCharArray());
                    sslcontext = SSLContexts.custom().loadTrustMaterial(null, (TrustStrategy) (chain, authType) -> true)
                            .loadKeyMaterial(keyStore, sslPwd.toCharArray()).build();
                } else {
                    sslcontext = SSLContexts.custom().loadTrustMaterial(null, (TrustStrategy) (chain, authType) -> true)
                            .build();
                }
                sslIoSessionStrategy =
                        new SSLIOSessionStrategy(sslcontext, TLS_PROTOCOLS, null, (s, sslSession) -> true);
            } else {
                sslcontext = SSLContexts.createSystemDefault();
                sslIoSessionStrategy = new SSLIOSessionStrategy(sslcontext);
            }
        } catch (Exception e) {
            LOGGER.error("getSslIoSessionStrategy", e);
        } finally {
            if (srStore != null) {
                try {
                    srStore.close();
                } catch (IOException e) {
                    LOGGER.error("getSslIoSessionStrategy", e);
                }
            }
        }
        return sslIoSessionStrategy;
    }

    public static class IdleConnectionMonitorThread extends Thread {

        private final List<PoolingNHttpClientConnectionManager> connMgrList;
        private volatile boolean shutdown;

        IdleConnectionMonitorThread(List<PoolingNHttpClientConnectionManager> connMgrList) {
            super();
            this.connMgrList = connMgrList;
        }

        @Override
        public void run() {
            try {
                while (!shutdown) {
                    synchronized (this) {
                        wait(5000);
                        for (PoolingNHttpClientConnectionManager connMar : connMgrList) {
                            // 清除所有过期的链接
                            connMar.closeExpiredConnections();
                            // 清除存活一段时间后的连接
                            connMar.closeIdleConnections(60, TimeUnit.SECONDS);
                            LOGGER.info(String.format(
                                    "connection release,async http connection release,max:%s,pending:%s,available:%s,lease:%s",
                                    connMar.getTotalStats().getMax(), connMar.getTotalStats().getPending(),
                                    connMar.getTotalStats().getAvailable(), connMar.getTotalStats().getLeased()));
                        }
                    }
                }
            } catch (InterruptedException ex) {
                // terminate
            }
        }

        public void shutdown() {
            shutdown = true;
            synchronized (this) {
                notifyAll();
            }
        }
    }
}
