package com.hotel.platform.business.core.context;

import com.hotel.platform.common.constans.RequestType;

/**
 * @Author wmo
 * @CreateDate 2019/3/20 13:10
 * @Version 1.0
 * @Description
 */
public class CancelOrderContext extends BaseContext {
    public CancelOrderContext() {
        super(RequestType.CANCEL_ORDER);
    }

    private Long orderId;
    private Boolean isCm;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
