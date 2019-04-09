package com.hotel.platform.common.httpclient.base;

import java.util.Map;
import java.util.function.Function;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.nio.client.methods.HttpAsyncMethods;
import org.apache.http.nio.protocol.BasicAsyncResponseConsumer;
import org.apache.http.nio.protocol.HttpAsyncRequestProducer;
import org.slf4j.Logger;

import com.alibaba.fastjson.JSON;
import com.hotel.platform.common.httpclient.HttpConstant;
import com.hotel.platform.common.httpclient.HttpRequest;
import com.hotel.platform.common.httpclient.HttpResponse;
import com.hotel.platform.common.httpclient.commpent.HttpAsyncClientComponent;
import com.hotel.platform.common.log.LogFactory;
import com.hotel.platform.common.utils.NumberUtil;
import com.hotel.platform.common.utils.StringUtil;


public class AsyncHttpClient {
    private static LogFactory.Log LOGGER = LogFactory.getInstance().getLogger(AsyncHttpClient.class);


    /**
     * 处理请求
     *
     * @param httpRequest
     * @param baseDataProcess
     * @param requestBuilder
     * @param convert
     * @param futureCallback
     * @return
     */
    public static <T, V> HttpResponseFuture<V> processRequest(RequestBuilder requestBuilder, HttpRequest<T> httpRequest,
            BaseDataProcess<T> baseDataProcess, Function<HttpResponse, V> convert, FutureCallback<V> futureCallback) {
        CloseableHttpAsyncClient asyncHttpClient;
        HttpResponseFuture<V> responseFuture = null;
        long start = System.currentTimeMillis();
        try {
            setRequestConfig(requestBuilder, httpRequest.getControlParams());
            setRequestHeader(requestBuilder, httpRequest.getHeaders());
            setRequestURI(requestBuilder, httpRequest.getWebServiceURL());

            baseDataProcess.setRequestContent(requestBuilder, httpRequest.getRequestBody());
            asyncHttpClient = createAsyncHttpClient(httpRequest.getControlParams());

            HttpUriRequest uriRequest = requestBuilder.build();
            HttpAsyncRequestProducer producer = HttpAsyncMethods.create(uriRequest);
            BasicAsyncResponseConsumer consumer = new BasicAsyncResponseConsumer();
            responseFuture = new HttpResponseFuture<>(convert, futureCallback, uriRequest);
            HttpRequestCallBack<T, V> requestCallBack =
                    new HttpRequestCallBack<>(baseDataProcess, httpRequest, start, responseFuture);
            asyncHttpClient.execute(producer, consumer, requestCallBack);
        } catch (Exception e) {
            LOGGER.logError("processRequest", e, httpRequest.getTag());
        }
        return responseFuture;
    }

    /**
     * 设置请求url
     *
     * @param requestBuilder
     * @param webServiceURL
     */
    private static void setRequestURI(RequestBuilder requestBuilder, String webServiceURL) {
        requestBuilder.setUri(webServiceURL);
    }

    /**
     * 设置请求头
     *
     * @param requestBuilder
     * @param requestHeaders
     */
    private static void setRequestHeader(RequestBuilder requestBuilder, Map<String, String> requestHeaders) {
        if (requestHeaders != null) {
            for (String name : requestHeaders.keySet()) {
                requestBuilder.addHeader(name, requestHeaders.get(name));
            }
        }
    }

    /**
     * 设置请求参数
     *
     * @param requestBuilder
     * @param controlParams
     */
    private static void setRequestConfig(RequestBuilder requestBuilder, Map<String, String> controlParams) {
        RequestConfig.Builder builder = RequestConfig.custom();
        if (controlParams != null && controlParams.get(HttpConstant.CONNECTION_TIMEOUT) != null) {
            if (!StringUtil.isNullOrEmpty(controlParams.get(HttpConstant.SOCKET_TIMEOUT))) {
                builder.setSocketTimeout(NumberUtil.parseInteger(controlParams.get(HttpConstant.SOCKET_TIMEOUT)));
            }
            if (!StringUtil.isNullOrEmpty(controlParams.get(HttpConstant.CONNECTION_TIMEOUT))) {
                builder.setConnectTimeout(NumberUtil.parseInteger(controlParams.get(HttpConstant.CONNECTION_TIMEOUT)));
            }
            if (!StringUtil.isNullOrEmpty(controlParams.get(HttpConstant.CONNECTION_REQUEST_TIMEOUT))) {
                builder.setConnectionRequestTimeout(
                        NumberUtil.parseInteger(controlParams.get(HttpConstant.CONNECTION_REQUEST_TIMEOUT)));
            }
        }
        requestBuilder.setConfig(builder.build());
    }

    /**
     * 获取http client
     *
     * @param controlParams
     * @return
     */
    private static CloseableHttpAsyncClient createAsyncHttpClient(Map<String, String> controlParams) {
        CloseableHttpAsyncClient asyncHttpClient;
        if (controlParams == null || controlParams.isEmpty()) {
            asyncHttpClient = HttpAsyncClientComponent.getInstance().createAsyncHttpClient();
        } else {
            asyncHttpClient = HttpAsyncClientComponent.getInstance().createAsyncHttpClient(
                    controlParams.get(HttpConstant.SSL_PATH), controlParams.get(HttpConstant.SSL_PASSWORD),
                    controlParams.get(HttpConstant.SSL_TYPE), controlParams.get(HttpConstant.PROXY_URL),
                    NumberUtil.parseInteger(controlParams.get(HttpConstant.PROXY_PORT)),
                    controlParams.get(HttpConstant.PROXY_USER), controlParams.get(HttpConstant.PROXY_PASSWORD),
                    NumberUtil.parseBoolean(controlParams.get(HttpConstant.IS_HTTP_URL)));
        }
        return asyncHttpClient;
    }
}
