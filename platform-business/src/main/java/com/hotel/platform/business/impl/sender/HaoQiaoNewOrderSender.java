package com.hotel.platform.business.impl.sender;

import com.hotel.platform.business.core.context.SendOrderContext;
import com.hotel.platform.business.core.sender.AbstractRestAdapterSender;
import com.hotel.platform.business.core.sender.SendSupplierType;
import com.hotel.platform.business.core.sender.SenderType;
import com.hotel.platform.business.core.sender.SenderVendor;
import com.hotel.platform.contract.cota.HotelResResponseType;
import com.hotel.platform.contract.cota.OTAHotelResRQ;

/**
 * @Author wmo
 * @CreateDate 2019/3/22 15:03
 * @Version 1.0
 * @Description
 */
@SendSupplierType(version = SenderVendor.HAOQIAO, type = SenderType.CANCEL_ORDER)
public class HaoQiaoNewOrderSender
        extends AbstractRestAdapterSender<OTAHotelResRQ, HotelResResponseType, SendOrderContext> {

    @Override
    public HotelResResponseType sendRequest(OTAHotelResRQ request, SendOrderContext context) {
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
    public String getRequest(OTAHotelResRQ request, SendOrderContext context) {
        return null;
    }

    @Override
    public HotelResResponseType getResponse(OTAHotelResRQ request, String response, SendOrderContext context) {
        return null;
    }
}
