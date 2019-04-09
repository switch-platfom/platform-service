package com.hotel.platform.common.model;

import java.util.Map;

import org.springframework.util.CollectionUtils;

import com.alibaba.fastjson.JSON;

/**
 * Created by mowei on 2019/4/9.
 */
public class RequestLogModal {
    public final static String PREFIX = "[<Request>";
    public final static String SUFFIX = "</Request>]";

    public RequestLogModal(String content) {
        this.content = content;
    }

    public RequestLogModal(String content, Map<String, String> tags) {
        this.content = content;
        this.tag = tags;
    }

    private String content;
    private Map<String, String> tag;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Map<String, String> getTag() {
        return tag;
    }

    public void setTag(Map<String, String> tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        if (!CollectionUtils.isEmpty(tag)) {
            String tags = JSON.toJSONString(tag);
            return String.format("%s \r\n %s \r\n %s \r\n %s", PREFIX, tags, content, SUFFIX);
        } else {
            return String.format("%s \r\n %s \r\n %s", PREFIX, content, SUFFIX);
        }
    }
}
