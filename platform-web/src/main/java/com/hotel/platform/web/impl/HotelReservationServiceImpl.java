package com.hotel.platform.web.impl;

import javax.jws.WebService;

import com.alibaba.fastjson.JSON;
import com.hotel.platform.business.core.handler.BaseSwitchHandler;
import com.hotel.platform.common.log.LogFactory;
import com.hotel.platform.common.utils.SpringBeanContext;
import com.hotel.platform.contract.cota.HotelResResponseType;
import com.hotel.platform.contract.cota.OTACancelRQ;
import com.hotel.platform.contract.cota.OTACancelRS;
import com.hotel.platform.contract.cota.OTAHotelAvailRQ;
import com.hotel.platform.contract.cota.OTAHotelAvailRS;
import com.hotel.platform.contract.cota.OTAHotelResRQ;
import com.hotel.platform.dao.mapper.UserInfoMapper;
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
        LOGGER.info(String.valueOf(SpringBeanContext.getBean("sendOrderHandler")));
        LOGGER.info(String.valueOf(SpringBeanContext.getBean("cancelOrderHandler")));
        LOGGER.logInfo("Test Info");
        LOGGER.logRequest("Test Request");
        LOGGER.logError("Test Error", new Exception("tttt"));
        UserInfoMapper userInfoMapper = (UserInfoMapper) SpringBeanContext.getBean("userInfoMapper");
        LOGGER.logInfo(JSON.toJSONString(userInfoMapper.getUserById(6)));

        return new OTAHotelAvailRS();
    }

    @Override
    public OTACancelRS cancelOrder(OTACancelRQ request) {
        BaseSwitchHandler<OTACancelRQ, OTACancelRS> cancelOrderHandler =
                (BaseSwitchHandler<OTACancelRQ, OTACancelRS>) SpringBeanContext.getBean("cancelOrderHandler");
        return cancelOrderHandler.process(request);
    }

    @Override
    public HotelResResponseType newOrder(OTAHotelResRQ request) {
        BaseSwitchHandler<OTAHotelResRQ, HotelResResponseType> sendOrderHandler =
                (BaseSwitchHandler<OTAHotelResRQ, HotelResResponseType>) SpringBeanContext.getBean("sendOrderHandler");
        return sendOrderHandler.process(request);
    }
}
