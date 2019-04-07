package com.hotel.platform.common.httpclient.base;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.RequestBuilder;

import com.hotel.platform.common.httpclient.HttpResponse;


/**
 * Created by wmo on 2018/7/18.
 */
public interface BaseDataProcess<T> {
    /**
     * 设置请求体
     *
     * @param requestBuilder
     * @param requestContent
     * @throws UnsupportedEncodingException
     */
    void setRequestContent(RequestBuilder requestBuilder, T requestContent) throws UnsupportedEncodingException;

    /**
     * 设置响应
     *
     * @param response
     * @param entity
     * @throws IOException
     */
    void setResponseContent(HttpResponse response, HttpEntity entity) throws IOException;
}
