package com.hotel.platform.web.impl;

import javax.jws.WebService;

import com.hotel.platform.common.log.LogFactory;
import com.hotel.platform.contract.cota.HotelResResponseType;
import com.hotel.platform.contract.cota.OTACancelRQ;
import com.hotel.platform.contract.cota.OTACancelRS;
import com.hotel.platform.contract.cota.OTAHotelAvailRQ;
import com.hotel.platform.contract.cota.OTAHotelAvailRS;
import com.hotel.platform.contract.cota.OTAHotelResRQ;
import com.hotel.platform.web.service.HotelReservationService;

/**
 * Created by mowei on 2019/4/9.
 */
@WebService(endpointInterface = "com.hotel.platform.web.service.HotelReservationService",
        serviceName = "hotelReservationService")
public class HotelReservationServiceImpl implements HotelReservationService {
    private final LogFactory.Log LOGGER = LogFactory.getInstance().getLogger(HotelReservationServiceImpl.class);

    @Override
    public OTAHotelAvailRS hotelAvail(OTAHotelAvailRQ request) {
        LOGGER.info("test");
        LOGGER.logInfo("Test Info");
        LOGGER.logRequest("Test Request");
        LOGGER.logError("Test Error",new Exception("tttt"));
        return new OTAHotelAvailRS();
    }

    @Override
    public OTACancelRS cancelOrder(OTACancelRQ request) {
        return null;
    }

    @Override
    public HotelResResponseType newOrder(OTAHotelResRQ request) {
        return null;
    }
}
