package com.hotel.platform.common.model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;

import org.springframework.util.CollectionUtils;

import com.alibaba.fastjson.JSON;

/**
 * Created by mowei on 2019/4/9.
 */
public class ErrorLogModal {
    public final static String PREFIX = "[<Error>";
    public final static String SUFFIX = "</Error>]";

    public ErrorLogModal(String title, Throwable throwable) {
        this.title = title;
        this.throwable = throwable;
    }

    public ErrorLogModal(String title, Map<String, String> tags) {
        this.title = title;
        this.tag = tags;
    }

    public ErrorLogModal(String title, Throwable throwable, Map<String, String> tags) {
        this.title = title;
        this.throwable = throwable;
        this.tag = tags;
    }

    private String title;
    private Throwable throwable;
    private Map<String, String> tag;

    public static String getSUFFIX() {
        return SUFFIX;
    }

    public static String getPREFIX() {
        return PREFIX;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
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
            return String.format("%s \r\n %s \r\n %s \r\n %s \r\n %s", PREFIX, title, tags, formatException(throwable),
                    SUFFIX);
        } else {
            return String.format("%s \r\n %s \r\n %s \r\n %s", PREFIX, title, formatException(throwable), SUFFIX);
        }
    }

    /**
     * 将异常信息转化成字符串
     * 
     * @param t
     * @return
     * @throws IOException
     */
    private String formatException(Throwable t) {
        if (t == null) {
            return "";
        }
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            t.printStackTrace(new PrintStream(baos));
            return baos.toString();
        } catch (Exception e) {
            return "";
        }
    }
}
