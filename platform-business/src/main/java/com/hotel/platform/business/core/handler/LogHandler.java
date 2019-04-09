package com.hotel.platform.business.core.handler;

import com.hotel.platform.business.core.context.BaseContext;

/**
 * @Author wmo
 * @CreateDate 2019/3/22 20:57
 * @Version 1.0
 * @Description
 */
public interface LogHandler<RQ, RS, CONTEXT extends BaseContext> {

    /**
     * 记录请求到db
     * 
     * @param request
     * @param response
     * @param context
     * @param cost
     */
    void log(RQ request, RS response, CONTEXT context,long cost);
}
