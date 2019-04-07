package com.hotel.platform.business.core.context;

import com.hotel.platform.common.constans.RequestType;

/**
 * @Author wmo
 * @CreateDate 2019/3/20 13:10
 * @Version 1.0
 * @Description
 */
public class HotelAvailContext extends BaseContext {
    public HotelAvailContext() {
        super(RequestType.HOTEL_AVAIL);
    }
}
