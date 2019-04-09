package com.hotel.platform.business.core.sender;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.joda.time.DateTime;

import com.alibaba.fastjson.JSON;
import com.hotel.platform.business.core.context.BaseContext;
import com.hotel.platform.business.core.exceptions.BizException;
import com.hotel.platform.common.httpclient.AsyncHttpClientUtil;
import com.hotel.platform.common.httpclient.HttpConstant;
import com.hotel.platform.common.httpclient.HttpRequest;
import com.hotel.platform.common.httpclient.HttpResponse;
import com.hotel.platform.common.httpclient.base.HttpResponseFuture;
import com.hotel.platform.common.log.LogFactory;
import com.hotel.platform.common.model.WebResponse;
import com.hotel.platform.common.utils.StringUtil;

/**
 * @Author wmo
 * @CreateDate 2019/3/22 17:28
 * @Version 1.0
 * @Description
 */
public abstract class AbstractRestAdapterSender<RQ, RS, CONTEXT extends BaseContext>
        implements BaseAdapterSender<RQ, RS, CONTEXT> {
    private final static LogFactory.Log LOGGER = LogFactory.getInstance().getLogger(AbstractRestAdapterSender.class);

    /**
     * 获取握手超时时间
     * 
     * @return
     */
    public abstract int getConnectionTimeOut();

    /**
     * 获取传输超时时间
     * 
     * @return
     */
    public abstract int getSocketTimeout();

    /**
     * 获取连接池获取超时时间
     * 
     * @return
     */
    public abstract int getRequestConnectionTimeout();

    /**
     * 获取content-type
     * 
     * @return
     */
    public abstract String getContentType();

    /**
     * 获取soap action
     * 
     * @return
     */
    public abstract String getSoapAction();

    /**
     * 获取请求
     * 
     * @param request
     * @param context
     * @return
     */
    public abstract String getRequest(RQ request, CONTEXT context);

    /**
     * 获取response
     * 
     * @param response
     * @param context
     * @return
     */
    public abstract RS getResponse(RQ request, String response, CONTEXT context);

    /**
     * 发送标准的Rest接口
     *
     * @param request
     * @param context
     * @return
     */
    protected RS sendRestRequest(RQ request, CONTEXT context) {
        String servicesUrl = context.getServiceUrl();
        if (StringUtil.isNullOrEmpty(servicesUrl)) {
            throw new BizException("集团链接未配置");
        }
        String requestContent = getRequest(request, context);
        if (StringUtil.isNullOrEmpty(requestContent)) {
            throw new BizException("序列化请求失败");
        }
        RS response = null;
        Map<String, String> header = new HashMap<>();
        header.put("Content-Type", getContentType());
        header.put("Accept-Encoding", "gzip, deflate");
        String soapAction = getSoapAction();
        if (!StringUtil.isNullOrEmpty(soapAction)) {
            header.put("SOAPAction", soapAction);
        }

        Map<String, String> controlParams = new HashMap<>();
        controlParams.put(HttpConstant.CONNECTION_TIMEOUT, String.valueOf(getConnectionTimeOut()));
        controlParams.put(HttpConstant.SOCKET_TIMEOUT, String.valueOf(getSocketTimeout()));
        controlParams.put(HttpConstant.CONNECTION_REQUEST_TIMEOUT, String.valueOf(getRequestConnectionTimeout()));
        controlParams.put(HttpConstant.IS_HTTP_URL, String.valueOf(servicesUrl.startsWith("https")));

        HttpRequest<String> httpRequest = new HttpRequest<String>() {
            {
                setRequestBody(requestContent);
                setTag(context.getLogTag());
                setControlParams(controlParams);
                setHeaders(header);
                setWebServiceURL(servicesUrl);
            }
        };

        Function<HttpResponse, WebResponse> convert = (httpResponse -> {
            WebResponse webResponseAgent = new WebResponse();
            webResponseAgent.setCost(httpResponse.getCost());
            webResponseAgent.setResponseBody(httpResponse.getResponseString());
            webResponseAgent.setHttpResCode(httpResponse.getHttpCode());
            webResponseAgent.setResponseException(httpResponse.getResponseException());
            webResponseAgent.setResponseTime(DateTime.now().toDate());
            return webResponseAgent;
        });

        HttpResponseFuture<WebResponse> future = AsyncHttpClientUtil.postString(httpRequest, convert, null);
        try {
            WebResponse webResponse = future.get(getConnectionTimeOut(), TimeUnit.MILLISECONDS);
            if (webResponse != null && webResponse.getHttpResCode().equals(200)) {
                response = getResponse(request, webResponse.getResponseBody(), context);
            } else if (webResponse != null && webResponse.getResponseException() != null) {
                LOGGER.logError("向适配器发送请求失败", webResponse.getResponseException(),context.getLogTag());
            } else {
                LOGGER.logError("向适配器发送请求失败",context.getLogTag());
            }
        } catch (Exception e) {
            throw new BizException("接口调用失败", context.getLogTag());
        }
        return response;
    }
}
