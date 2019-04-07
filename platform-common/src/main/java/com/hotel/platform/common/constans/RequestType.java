package com.hotel.platform.common.constans;

/**
 * @Author wmo
 * @CreateDate 2019/3/20 13:11
 * @Version 1.0
 * @Description
 */
public interface RequestType {
    /**
     * 新订
     */
    String SEND_ORDER = "hotel.platform.sendhotelorder";
    /**
     * 取消
     */
    String CANCEL_ORDER = "hotel.platform.cancelorder";
    /**
     * 酒店可订检查
     */
    String HOTEL_AVAIL = "hotel.platform.hotelavail";
}
