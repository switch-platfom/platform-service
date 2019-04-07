package com.hotel.platform.business.core.exceptions;

/**
 * @Author wmo
 * @CreateDate 2019/3/20 12:45
 * @Version 1.0
 * @Description
 */
public enum ExceptionEnum {
    /**成功*/
    SUCCESS(0, "SUCCESS"),
    /** 系统错误 **/
    SYS_UNKNOWN(10000, "SYS_UNKNOWN"),
    SYS_EXCEPTION(10001, "系统异常"),
    SYS_NETWORK_EXCEPTION(10002, "网络异常"),
    /** Request错误 **/
    REQUEST_EMPTY(20001, "请求为空"),
    REQUEST_ILLEGAL_ARGS(20002, "请求参数不合法"),
    REQUEST_INVALID_ARGS(20003, "无效参数"),
    REQUEST_UNSUPPORTED_TYPE(20004, "Unsupported RequestType"),
    REQUEST_NONE_VENDORID(20005, "缺少VendorID参数"),
    /** 信息缺少错误 **/
    NONE_HOTEL_INFO(40001, "没有酒店信息"),
    NONE_ROOM_INFO(40002, "没有对应房型"),
    NONE_ORDER_INFO(40003, "没有对应订单信息"),
    /** 普通业务错误信息 **/
    ERROR_INVOKE_API_FAILED(50001,"调用接口失败"),
    /** 订单错误信息 **/
    ORDER_FAILED_CREATE(60001, "新订不成功"),
    ORDER_FAILED_CANCEL(60002, "取消不成功"),
    ORDER_PROCESSING(60003,"订单处理中,短时间内请勿重发");

    public static ExceptionEnum getExceptionEnum(int errorCode) {
        for (ExceptionEnum type : ExceptionEnum.values()) {
            if (type.errorCode == errorCode) {
                return type;
            }
        }
        return SYS_UNKNOWN;
    }

    private int errorCode;
    private String errorMsg;

    private ExceptionEnum(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
