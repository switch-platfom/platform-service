package com.hotel.platform.common.httpclient.base;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.ByteArrayEntity;

import com.hotel.platform.common.httpclient.HttpResponse;
import com.hotel.platform.common.log.LogFactory;

public class ByteProcess implements BaseDataProcess<byte[]> {
    private static LogFactory.Log LOGGER = LogFactory.getInstance().getLogger(ByteProcess.class);

    @Override
    public void setRequestContent(RequestBuilder requestBuilder, byte[] requestContent) {
        if (requestContent != null && requestContent.length > 0) {
            ByteArrayEntity entity = new ByteArrayEntity(requestContent);
            requestBuilder.setEntity(entity);
            // requestBuilder.addHeader("Content-Length", String.valueOf(bytes.length));
        }
    }

    @Override
    public void setResponseContent(HttpResponse response, HttpEntity entity) throws IOException {
        if (entity.getContent() != null) {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            try {
                byte[] b = new byte[1024];
                int size = -1;
                while ((size = entity.getContent().read(b, 0, b.length)) != -1) {
                    bos.write(b, 0, size);
                }
                response.setResponseBytes(bos.toByteArray());
            } catch (IOException e) {
                LOGGER.logError("setResponseContent", e);
            } finally {
                try {
                    bos.flush();
                    bos.close();
                } catch (IOException e) {
                    LOGGER.logError("setResponseContent", e);
                }
            }
        }
    }
}
