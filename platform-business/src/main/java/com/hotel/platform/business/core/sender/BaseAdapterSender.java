package com.hotel.platform.business.core.sender;


import com.hotel.platform.business.core.context.BaseContext;

/**
 * @Author wmo
 * @CreateDate 2019/3/22 14:51
 * @Version 1.0
 * @Description
 */
public interface BaseAdapterSender<RQ, RS, CONTEXT extends BaseContext> {

    /**
     * 向适配器发送请求
     * 
     * @param request
     * @param context
     * @return
     */
    RS sendRequest(RQ request, CONTEXT context);
}
