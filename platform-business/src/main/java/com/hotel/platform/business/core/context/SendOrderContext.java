package com.hotel.platform.business.core.context;

import com.hotel.platform.common.constans.RequestType;

/**
 * @Author wmo
 * @CreateDate 2019/3/20 13:10
 * @Version 1.0
 * @Description
 */
public class SendOrderContext extends BaseContext {
    public SendOrderContext() {
        super(RequestType.SEND_ORDER);
    }

    private Long orderId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
