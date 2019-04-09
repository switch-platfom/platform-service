package com.hotel.platform.business.impl.handler;

import org.springframework.stereotype.Service;

import com.hotel.platform.business.core.context.CancelOrderContext;
import com.hotel.platform.business.core.exceptions.BizException;
import com.hotel.platform.business.core.exceptions.SystemException;
import com.hotel.platform.business.core.handler.AbstractOrderHandler;
import com.hotel.platform.contract.cota.OTACancelRQ;
import com.hotel.platform.contract.cota.OTACancelRS;

/**
 * Created by mowei on 2019/4/7.
 */
@Service
public class CancelOrderHandler extends AbstractOrderHandler<OTACancelRQ, OTACancelRS, CancelOrderContext> {

    @Override
    public void log(OTACancelRQ request, OTACancelRS response, CancelOrderContext context, long cost) {

    }

    @Override
    public void bizExceptionHandler(OTACancelRQ request, OTACancelRS response, CancelOrderContext cancelOrderContext,
            BizException throwable) {

    }

    @Override
    public void systemExceptionHandler(SystemException throwable, OTACancelRS response) {

    }

    @Override
    public void otherExceptionHandler(OTACancelRQ request, OTACancelRS response, CancelOrderContext cancelOrderContext,
            Exception throwable) {

    }

    @Override
    public OTACancelRS initResponse() {
        return null;
    }

    @Override
    public CancelOrderContext initContext(OTACancelRQ request, OTACancelRS response) throws BizException {
        return null;
    }

    @Override
    public void checkRequest(OTACancelRQ request, OTACancelRS response) throws BizException {

    }

    @Override
    public void preProcess(OTACancelRQ request, OTACancelRS response, CancelOrderContext context) throws BizException {

    }

    @Override
    public void sendRequest(OTACancelRQ request, OTACancelRS response, CancelOrderContext context) throws BizException {

    }

    @Override
    public void afterProcess(OTACancelRQ request, OTACancelRS response, CancelOrderContext context)
            throws BizException {

    }
}
