package com.hotel.platform.common.httpclient.base;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.util.CollectionUtils;

import com.hotel.platform.common.httpclient.HttpResponse;


public class NvPairProcess implements BaseDataProcess<List<NameValuePair>> {
    @Override
    public void setRequestContent(RequestBuilder requestBuilder, List<NameValuePair> requestContent)
            throws UnsupportedEncodingException {
        if (!CollectionUtils.isEmpty(requestContent)) {
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(requestContent);
            requestBuilder.setEntity(entity);
        }
    }

    @Override
    public void setResponseContent(HttpResponse response, HttpEntity entity) throws IOException {
        response.setResponseString(EntityUtils.toString(entity, "UTF-8"));
    }
}
