package com.hotel.platform.common.httpclient.base;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.DeflateDecompressingEntity;
import org.apache.http.client.entity.GzipDecompressingEntity;
import org.apache.http.concurrent.FutureCallback;

import com.hotel.platform.common.httpclient.HttpRequest;
import com.hotel.platform.common.httpclient.HttpResponse;
import com.hotel.platform.common.log.LogFactory;

/**
 * Created by wmo on 2018/7/19.
 */
public class HttpRequestCallBack<T, V> implements FutureCallback<org.apache.http.HttpResponse> {
    private static LogFactory.Log LOGGER = LogFactory.getInstance().getLogger(HttpRequestCallBack.class);

    private BaseDataProcess<T> baseDataProcess;
    private HttpRequest<T> httpRequest;
    private long start;
    private HttpResponseFuture<V> responseFuture;

    public HttpRequestCallBack(BaseDataProcess<T> baseDataProcess, HttpRequest<T> httpRequest, long starTime,
            HttpResponseFuture<V> requestFuture) {
        this.baseDataProcess = baseDataProcess;
        this.httpRequest = httpRequest;
        this.start = starTime;
        this.responseFuture = requestFuture;
    }

    @Override
    public void completed(org.apache.http.HttpResponse result) {
        long cost = System.currentTimeMillis() - start;
        HttpResponse response;
        try {
            response = processResponse(result, baseDataProcess);
            response.setCost(cost);
            responseFuture.completed(response);
        } catch (Exception e) {
            responseFuture.failed(getExceptionResponse(e, cost));
            LOGGER.logError("http异步执行异常", e, httpRequest.getTag());
        }
    }

    @Override
    public void failed(Exception ex) {
        long cost = System.currentTimeMillis() - start;
        LOGGER.logError("http异步处理失败,cost:" + String.valueOf(cost), httpRequest.getTag());
        responseFuture.failed(getExceptionResponse(ex, cost));
    }

    @Override
    public void cancelled() {
        long cost = System.currentTimeMillis() - start;
        LOGGER.logError("http请求被取消,cost:" + String.valueOf(cost), httpRequest.getTag());
        responseFuture
                .cancel(getExceptionResponse(new HttpCancelRequestException("http请求被取消", httpRequest.getTag()), cost));
    }

    /**
     * 设置错误响应
     *
     * @param throwable
     * @param cost
     */
    private HttpResponse getExceptionResponse(Throwable throwable, long cost) {
        HttpResponse response = new HttpResponse();
        response.setHttpCode(-1);
        response.setResponseException(throwable);
        response.setCost(cost);
        response.setResponseString("");

        return response;
    }

    /**
     * 处理结果
     *
     * @param response
     * @param baseDataProcess
     * @return
     */
    private HttpResponse processResponse(org.apache.http.HttpResponse response, BaseDataProcess<T> baseDataProcess) {
        HttpResponse httpResponse = new HttpResponse();
        long start = System.currentTimeMillis();
        try {
            httpResponse.setHttpCode(response.getStatusLine().getStatusCode());
            httpResponse.setResponseHeaders(response.getAllHeaders());
            HttpEntity entity = response.getEntity();
            start = System.currentTimeMillis();
            if (entity != null) {
                Header encodingHeader = entity.getContentEncoding();
                if (encodingHeader != null && encodingHeader.getValue() != null) {
                    if ("gzip".equalsIgnoreCase(encodingHeader.getValue())) {
                        entity = new GzipDecompressingEntity(entity);
                    } else if ("deflate".equalsIgnoreCase(encodingHeader.getValue())) {
                        entity = new DeflateDecompressingEntity(entity);
                    }
                }
                baseDataProcess.setResponseContent(httpResponse, entity);
            } else {
                httpResponse.setResponseString("");
            }
        } catch (Exception ex) {
            LOGGER.logError("process http response exception", ex, httpRequest.getTag());
            httpResponse.setHttpCode(-1);
            httpResponse.setResponseException(ex);
        }
        return httpResponse;
    }
}
