package com.hotel.platform.common.httpclient;

import java.util.concurrent.ConcurrentMap;

import org.apache.http.Header;

public class HttpResponse {

    private String responseString;
    private int httpCode;
    private Header[] responseHeaders;
    private Throwable responseException;
    private byte[] responseBytes;
    private ConcurrentMap<String, String> tag;
    private long cost;

    public String getResponseString() {
        return responseString;
    }

    public void setResponseString(String responseBody) {
        this.responseString = responseBody;
    }

    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }

    public Header[] getResponseHeaders() {
        return responseHeaders;
    }

    public void setResponseHeaders(Header[] responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    public Throwable getResponseException() {
        return responseException;
    }

    public void setResponseException(Throwable responseException) {
        this.responseException = responseException;
    }

    public byte[] getResponseBytes() {
        return responseBytes;
    }

    public void setResponseBytes(byte[] responseBytes) {
        this.responseBytes = responseBytes;
    }

    public ConcurrentMap<String, String> getTag() {
        return tag;
    }

    public void setTag(ConcurrentMap<String, String> tag) {
        this.tag = tag;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }
}
