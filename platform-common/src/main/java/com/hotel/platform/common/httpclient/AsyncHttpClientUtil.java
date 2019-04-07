package com.hotel.platform.common.httpclient;

import java.util.List;
import java.util.function.Function;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import com.hotel.platform.common.httpclient.base.AsyncHttpClient;
import com.hotel.platform.common.httpclient.base.ByteProcess;
import com.hotel.platform.common.httpclient.base.HttpResponseFuture;
import com.hotel.platform.common.httpclient.base.MultiPartProcess;
import com.hotel.platform.common.httpclient.base.NvPairProcess;
import com.hotel.platform.common.httpclient.base.StringProcess;


/**
 * HeaderMap: Content-Type: xxx Authorization->basic; Accept-Encoding->gzip, deflate (use gzip)
 * SOAPAction->connectionEntity.MethodOrActionName Cache-Control->no-cache (GetARoom);
 * X-Company-Key->connectionEntity.SSLCertificatePassword (Relux) apiAuthenticationKey->connectionEntity.UserPassword
 * (ANA)
 */
public class AsyncHttpClientUtil {

    public static <V> HttpResponseFuture<V> postString(HttpRequest<String> httpRequest,
            Function<HttpResponse, V> convert, FutureCallback<V> callBack) {
        return AsyncHttpClient.processRequest(RequestBuilder.post(), httpRequest, new StringProcess(), convert,
                callBack);
    }

    public static <V> HttpResponseFuture<V> postByte(HttpRequest<byte[]> httpRequest, Function<HttpResponse, V> convert,
            FutureCallback<V> callBack) {
        return AsyncHttpClient.processRequest(RequestBuilder.post(), httpRequest, new ByteProcess(), convert, callBack);
    }

    public static <V> HttpResponseFuture<V> postNameValuePair(HttpRequest<List<NameValuePair>> httpRequest,
            Function<HttpResponse, V> convert, FutureCallback<V> callBack) {
        return AsyncHttpClient.processRequest(RequestBuilder.post(), httpRequest, new NvPairProcess(), convert,
                callBack);
    }

    public static <V> HttpResponseFuture<V> postMultiPart(HttpRequest<MultipartEntityBuilder> httpRequest,
            Function<HttpResponse, V> convert, FutureCallback<V> callBack) {
        return AsyncHttpClient.processRequest(RequestBuilder.post(), httpRequest, new MultiPartProcess(), convert,
                callBack);
    }

    public static <V> HttpResponseFuture<V> get(HttpRequest<String> httpRequest, Function<HttpResponse, V> convert,
            FutureCallback<V> callBack) {
        httpRequest.setRequestBody("");
        return AsyncHttpClient.processRequest(RequestBuilder.get(), httpRequest, new StringProcess(), convert,
                callBack);
    }

    public static <V> HttpResponseFuture<V> put(HttpRequest<String> httpRequest, Function<HttpResponse, V> convert,
            FutureCallback<V> callBack) {
        return AsyncHttpClient.processRequest(RequestBuilder.put(), httpRequest, new StringProcess(), convert,
                callBack);
    }

    public static <V> HttpResponseFuture<V> delete(HttpRequest<String> httpRequest, Function<HttpResponse, V> convert,
            FutureCallback<V> callBack) {
        return AsyncHttpClient.processRequest(RequestBuilder.delete(), httpRequest, new StringProcess(), convert,
                callBack);
    }
}
