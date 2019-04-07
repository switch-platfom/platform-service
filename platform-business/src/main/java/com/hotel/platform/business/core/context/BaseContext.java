package com.hotel.platform.business.core.context;

import java.util.Map;

import org.joda.time.DateTime;

/**
 * @Author wmo
 * @CreateDate 2019/3/20 12:31
 * @Version 1.0
 * @Description
 */
public class BaseContext {
    public BaseContext(String requestType) {
        this.startTime = DateTime.now();
        this.requestType = requestType;
    }

    private DateTime startTime;
    private String traceLogId;
    private Long sendAdapterCost;
    private String requestType;
    private Integer hotelId;
    private Map<String, String> logTag;
    private String serviceUrl;

    public DateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    public String getTraceLogId() {
        return traceLogId;
    }

    public void setTraceLogId(String traceLogId) {
        this.traceLogId = traceLogId;
    }

    public Long getSendAdapterCost() {
        return sendAdapterCost;
    }

    public void setSendAdapterCost(Long sendAdapterCost) {
        this.sendAdapterCost = sendAdapterCost;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Map<String, String> getLogTag() {
        return logTag;
    }

    public void setLogTag(Map<String, String> logTag) {
        this.logTag = logTag;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }
}
