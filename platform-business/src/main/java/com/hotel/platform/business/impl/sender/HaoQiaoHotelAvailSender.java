package com.hotel.platform.business.impl.sender;

import com.hotel.platform.business.core.context.HotelAvailContext;
import com.hotel.platform.business.core.sender.AbstractRestAdapterSender;
import com.hotel.platform.business.core.sender.SendSupplierType;
import com.hotel.platform.business.core.sender.SenderType;
import com.hotel.platform.business.core.sender.SenderVendor;
import com.hotel.platform.contract.cota.OTAHotelAvailRQ;
import com.hotel.platform.contract.cota.OTAHotelAvailRS;

/**
 * @Author wmo
 * @CreateDate 2019/3/22 15:03
 * @Version 1.0
 * @Description
 */
@SendSupplierType(version = SenderVendor.HAOQIAO, type = SenderType.CANCEL_ORDER)
public class HaoQiaoHotelAvailSender
        extends AbstractRestAdapterSender<OTAHotelAvailRQ, OTAHotelAvailRS, HotelAvailContext> {

    @Override
    public OTAHotelAvailRS sendRequest(OTAHotelAvailRQ request, HotelAvailContext context) {
        return null;
    }

    @Override
    public int getConnectionTimeOut() {
        return 0;
    }

    @Override
    public int getSocketTimeout() {
        return 0;
    }

    @Override
    public int getRequestConnectionTimeout() {
        return 0;
    }

    @Override
    public String getContentType() {
        return null;
    }

    @Override
    public String getSoapAction() {
        return null;
    }

    @Override
    public String getRequest(OTAHotelAvailRQ request, HotelAvailContext context) {
        return null;
    }

    @Override
    public OTAHotelAvailRS getResponse(OTAHotelAvailRQ request, String response, HotelAvailContext context) {
        return null;
    }
}
