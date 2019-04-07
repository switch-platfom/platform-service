package com.hotel.platform.common.httpclient;

import java.util.Map;


/**
 * Created by wmo on 2018/7/18.
 */
public class HttpRequest<T> {
    private String webServiceURL;
    private Map<String, String> headers;
    private Map<String, String> controlParams;
    private T requestBody;
    private Map<String, String> tag;

    public String getWebServiceURL() {
        return webServiceURL;
    }

    public void setWebServiceURL(String webServiceURL) {
        this.webServiceURL = webServiceURL;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, String> getControlParams() {
        return controlParams;
    }

    public void setControlParams(Map<String, String> controlParams) {
        this.controlParams = controlParams;
    }

    public T getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(T requestBody) {
        this.requestBody = requestBody;
    }

    public Map<String, String> getTag() {
        return tag;
    }

    public void setTag(Map<String, String> tag) {
        this.tag = tag;
    }
}
