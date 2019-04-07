package com.hotel.platform.common.httpclient.base;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.util.EntityUtils;

import com.hotel.platform.common.httpclient.HttpResponse;


public class StringProcess implements BaseDataProcess<String> {
    @Override
    public void setRequestContent(RequestBuilder requestBuilder, String requestContent)
            throws UnsupportedEncodingException {
        if (requestContent != null && !requestContent.trim().isEmpty()) {
            byte[] bytes = requestContent.getBytes("UTF-8");
            ByteArrayEntity entity = new ByteArrayEntity(bytes);
            requestBuilder.setEntity(entity);
            // requestBuilder.addHeader("Content-Length", String.valueOf(bytes.length));
        }
    }

    @Override
    public void setResponseContent(HttpResponse response, HttpEntity entity) throws IOException {
        response.setResponseString(EntityUtils.toString(entity, "UTF-8"));
    }
}
