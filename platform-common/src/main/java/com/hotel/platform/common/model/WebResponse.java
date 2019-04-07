package com.hotel.platform.common.model;

import java.util.Date;

public class WebResponse {
    private String responseBody;
    private Date responseTime;
    private String status;
    private Integer httpResCode;
    private Throwable responseException;
    private Long cost;

    public WebResponse() {}

    public WebResponse(String responseBody) {
        this.responseBody = responseBody;
    }

    public WebResponse(String responseBody, Date responseTime) {
        this.responseBody = responseBody;
        this.responseTime = responseTime;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public Date getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Date responseTime) {
        this.responseTime = responseTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getHttpResCode() {
        return httpResCode;
    }

    public void setHttpResCode(Integer httpResCode) {
        this.httpResCode = httpResCode;
    }

    public Throwable getResponseException() {
        return responseException;
    }

    public void setResponseException(Throwable responseException) {
        this.responseException = responseException;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }
}
