package com.hotel.platform.business.core.exceptions;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author wmo
 * @CreateDate 2019/3/20 12:43
 * @Version 1.0
 * @Description
 */
public class BizException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private ExceptionEnum exceptionEnum;
    private Map<String, String> tags = new HashMap<>();
    private String errorMsg;

    public BizException() {
        super();
    }

    public BizException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public BizException(String errorMsg, Map<String, String> tags) {
        super(errorMsg);
        this.errorMsg = errorMsg;
        this.tags = tags;
    }

    public BizException(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }

    public BizException(ExceptionEnum exceptionEnum, Map<String, String> tags) {
        super();
        this.exceptionEnum = exceptionEnum;
        this.tags = tags;
    }

    public ExceptionEnum getExceptionEnum() {
        return exceptionEnum;
    }

    public void setExceptionEnum(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }

    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
