package com.hotel.platform.common.httpclient.base;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.util.EntityUtils;

import com.hotel.platform.common.httpclient.HttpResponse;


public class MultiPartProcess implements BaseDataProcess<MultipartEntityBuilder> {

    @Override
    public void setRequestContent(RequestBuilder requestBuilder, MultipartEntityBuilder requestContent)
            throws UnsupportedEncodingException {
        requestBuilder.setEntity(requestContent.build());
    }

    @Override
    public void setResponseContent(HttpResponse response, HttpEntity entity) throws IOException {
        response.setResponseString(EntityUtils.toString(entity, "UTF-8"));
    }
}
