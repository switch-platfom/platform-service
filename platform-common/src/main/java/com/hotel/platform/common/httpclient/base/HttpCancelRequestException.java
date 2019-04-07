package com.hotel.platform.common.httpclient.base;

import java.util.Map;

/**
 * @Author wmo
 * @CreateDate 2018/11/19 10:29
 * @Version 1.0
 * @Description
 */
public class HttpCancelRequestException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public HttpCancelRequestException() {
        super();
    }

    public HttpCancelRequestException(String message, Map<String, String> tag) {
        this.message = message;
        this.tag = tag;
    }

    private String message;
    private Map<String, String> tag;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, String> getTag() {
        return tag;
    }

    public void setTag(Map<String, String> tag) {
        this.tag = tag;
    }
}
