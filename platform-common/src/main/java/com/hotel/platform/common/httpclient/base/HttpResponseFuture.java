package com.hotel.platform.common.httpclient.base;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.concurrent.Cancellable;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.util.Args;

import com.hotel.platform.common.httpclient.HttpResponse;


/**
 * Created by wmo on 2018/7/26.
 */
public class HttpResponseFuture<T> implements Future<T>, Cancellable {
    private Function<HttpResponse, T> convert;
    private FutureCallback<T> callback;
    private HttpUriRequest uriRequest;

    private volatile boolean completed;
    private volatile boolean cancelled;
    private volatile T result;

    public HttpResponseFuture(Function<HttpResponse, T> convert, FutureCallback<T> callback,
            HttpUriRequest uriRequest) {
        super();
        this.convert = convert;
        this.callback = callback;
        this.uriRequest = uriRequest;
    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        HttpResponse response = new HttpResponse();
        response.setHttpCode(-1);
        response.setResponseException(new ExecutionException(new Exception("请求被取消")));
        return cancel(response);
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public boolean isDone() {
        return this.completed;
    }

    private T getResult() {
        return this.result;
    }

    @Override
    public synchronized T get() throws InterruptedException {
        while (!this.completed) {
            wait();
        }
        return this.result;
    }

    @Override
    public synchronized T get(long timeout, TimeUnit unit) throws InterruptedException, TimeoutException {
        Args.notNull(unit, "Time unit");
        final long msecs = unit.toMillis(timeout);
        final long startTime = (msecs <= 0) ? 0 : System.currentTimeMillis();
        long waitTime = msecs;
        if (this.completed) {
            return getResult();
        } else if (waitTime <= 0) {
            if (uriRequest != null && !uriRequest.isAborted()) {
                uriRequest.abort();
            }
            throw new TimeoutException();
        } else {
            for (;;) {
                wait(waitTime);
                if (this.completed) {
                    return getResult();
                } else {
                    waitTime = msecs - (System.currentTimeMillis() - startTime);
                    if (waitTime <= 0) {
                        if (uriRequest != null && !uriRequest.isAborted()) {
                            uriRequest.abort();
                        }
                        throw new TimeoutException();
                    }
                }
            }
        }
    }

    public boolean completed(final HttpResponse response) {
        synchronized (this) {
            if (this.completed) {
                return false;
            }
            this.completed = true;
            if (this.convert != null) {
                this.result = this.convert.apply(response);
            }
            notifyAll();
        }
        if (this.callback != null) {
            this.callback.completed(this.result);
        }

        return true;
    }

    public boolean failed(final HttpResponse response) {
        synchronized (this) {
            if (this.completed) {
                return false;
            }
            this.completed = true;
            if (this.convert != null) {
                this.result = this.convert.apply(response);
            }
            notifyAll();
        }
        if (this.callback != null) {
            this.callback.completed(this.result);
        }
        return true;
    }

    public boolean cancel(final HttpResponse response) {
        synchronized (this) {
            if (this.completed) {
                return false;
            }
            this.completed = true;
            this.cancelled = true;
            if (this.convert != null) {
                this.result = this.convert.apply(response);
            }
            notifyAll();
        }
        if (this.callback != null) {
            this.callback.completed(this.result);
        }
        return true;
    }

    @Override
    public boolean cancel() {
        return cancel(true);
    }
}
