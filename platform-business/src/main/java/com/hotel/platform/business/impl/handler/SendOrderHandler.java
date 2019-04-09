package com.hotel.platform.business.impl.handler;

import org.springframework.stereotype.Service;

import com.hotel.platform.business.core.context.SendOrderContext;
import com.hotel.platform.business.core.exceptions.BizException;
import com.hotel.platform.business.core.exceptions.SystemException;
import com.hotel.platform.business.core.handler.AbstractOrderHandler;
import com.hotel.platform.contract.cota.HotelResResponseType;
import com.hotel.platform.contract.cota.OTAHotelResRQ;

/**
 * Created by mowei on 2019/4/7.
 */
@Service
public class SendOrderHandler extends AbstractOrderHandler<OTAHotelResRQ, HotelResResponseType, SendOrderContext> {
    @Override
    public void logDb(OTAHotelResRQ request, HotelResResponseType response, SendOrderContext context) {

    }

    @Override
    public void logEs(OTAHotelResRQ request, HotelResResponseType response, SendOrderContext context, long cost) {

    }

    @Override
    public void logMetric(OTAHotelResRQ request, HotelResResponseType response, SendOrderContext context, long cost) {

    }

    @Override
    public void bizExceptionHandler(OTAHotelResRQ request, HotelResResponseType response,
            SendOrderContext sendOrderContext, BizException throwable) {

    }

    @Override
    public void systemExceptionHandler(SystemException throwable, HotelResResponseType response) {

    }

    @Override
    public void otherExceptionHandler(OTAHotelResRQ request, HotelResResponseType response,
            SendOrderContext sendOrderContext, Exception throwable) {

    }

    @Override
    public HotelResResponseType initResponse() {
        return null;
    }

    @Override
    public SendOrderContext initContext(OTAHotelResRQ request, HotelResResponseType response) throws BizException {
        return null;
    }

    @Override
    public void checkRequest(OTAHotelResRQ request, HotelResResponseType response) throws BizException {

    }

    @Override
    public void preProcess(OTAHotelResRQ request, HotelResResponseType response, SendOrderContext context)
            throws BizException {

    }

    @Override
    public void sendRequest(OTAHotelResRQ request, HotelResResponseType response, SendOrderContext context)
            throws BizException {

    }

    @Override
    public void afterProcess(OTAHotelResRQ request, HotelResResponseType response, SendOrderContext context)
            throws BizException {

    }
}
