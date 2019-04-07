package com.hotel.platform.business.core.exceptions;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author wmo
 * @CreateDate 2019/3/20 12:44
 * @Version 1.0
 * @Description
 */
public class SystemException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public SystemException(String errorMsg, Throwable cause, Map<String, String> tags) {
        super(errorMsg, cause);
        this.tags = tags;
        this.errorMsg = errorMsg;
        this.cause = cause;
    }

    public SystemException(String errorMsg, Throwable cause) {
        super();
        this.errorMsg = errorMsg;
        this.cause = cause;
    }

    public SystemException(String errorMsg, Map<String, String> tags) {
        super(errorMsg);
        this.tags = tags;
        this.errorMsg = errorMsg;
    }

    public SystemException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public SystemException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getErrorMsg());
        this.switchExceptionEnum = exceptionEnum;
    }

    public SystemException(ExceptionEnum exceptionEnum, Map<String, String> tags) {
        super(exceptionEnum.getErrorMsg());
        this.switchExceptionEnum = exceptionEnum;
        this.tags = tags;
    }


    public SystemException() {
        super();
    }

    private Map<String, String> tags = new HashMap<>();
    private String errorMsg;
    private Throwable cause;
    private ExceptionEnum switchExceptionEnum;

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

    @Override
    public Throwable getCause() {
        return cause;
    }

    public void setCause(Throwable cause) {
        this.cause = cause;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public ExceptionEnum getSwitchExceptionEnum() {
        return switchExceptionEnum;
    }

    public void setSwitchExceptionEnum(ExceptionEnum switchExceptionEnum) {
        this.switchExceptionEnum = switchExceptionEnum;
    }
}
