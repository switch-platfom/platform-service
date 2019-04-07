package com.hotel.platform.business.impl.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hotel.platform.business.core.context.CancelOrderContext;
import com.hotel.platform.business.core.sender.AbstractRestAdapterSender;
import com.hotel.platform.business.core.sender.SendSupplierType;
import com.hotel.platform.business.core.sender.SenderType;
import com.hotel.platform.business.core.sender.SenderVendor;
import com.hotel.platform.common.constans.LogAppend;
import com.hotel.platform.contract.cota.OTACancelRQ;
import com.hotel.platform.contract.cota.OTACancelRS;

/**
 * @Author wmo
 * @CreateDate 2019/3/22 15:03
 * @Version 1.0
 * @Description
 */
@SendSupplierType(version = SenderVendor.HAOQIAO, type = SenderType.CANCEL_ORDER)
public class HaoQiaoCancelOrderSender extends AbstractRestAdapterSender<OTACancelRQ, OTACancelRS, CancelOrderContext> {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogAppend.DEBUG);

    @Override
    public OTACancelRS sendRequest(OTACancelRQ request, CancelOrderContext context) {
        return null;
    }

    @Override
    public String getRequest(OTACancelRQ request, CancelOrderContext context) {
        return null;
    }

    @Override
    public OTACancelRS getResponse(OTACancelRQ request, String response, CancelOrderContext context) {
        return null;
    }

    @Override
    public int getConnectionTimeOut() {
        return 60000;
    }

    @Override
    public int getSocketTimeout() {
        return 60000;
    }

    @Override
    public int getRequestConnectionTimeout() {
        return 1000;
    }

    @Override
    public String getContentType() {
        return "application/xml";
    }

    @Override
    public String getSoapAction() {
        return null;
    }
}
