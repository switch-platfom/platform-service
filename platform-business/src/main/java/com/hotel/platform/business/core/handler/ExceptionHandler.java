package com.hotel.platform.business.core.handler;

import com.hotel.platform.business.core.exceptions.BizException;
import com.hotel.platform.business.core.exceptions.SystemException;

/**
 * @Author wmo
 * @CreateDate 2019/3/20 12:58
 * @Version 1.0
 * @Description
 */
public interface ExceptionHandler<RQ, RS, CONTEXT> {
    /**
     * 业务逻辑错误处理
     *
     * @param request
     * @param response
     * @param context
     * @param throwable
     */
    void bizExceptionHandler(RQ request, RS response, CONTEXT context, BizException throwable);

    /**
     * 系统错误处理
     *
     * @param throwable
     * @param response
     */
    void systemExceptionHandler(SystemException throwable, RS response);

    /**
     * 其他错误处理
     *
     * @param request
     * @param response
     * @param context
     * @param throwable
     */
    void otherExceptionHandler(RQ request, RS response, CONTEXT context, Exception throwable);
}
