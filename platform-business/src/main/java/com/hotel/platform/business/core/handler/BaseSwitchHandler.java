package com.hotel.platform.business.core.handler;

/**
 * @Author wmo
 * @CreateDate 2019/3/20 12:18
 * @Version 1.0
 * @Description
 */
public interface BaseSwitchHandler<RQ, RS> {

    /**
     * 处理请求
     * 
     * @param request 请求内容
     * @return
     */
    RS process(RQ request);
}
