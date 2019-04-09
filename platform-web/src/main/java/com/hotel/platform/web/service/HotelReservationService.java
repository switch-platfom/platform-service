package com.hotel.platform.web.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.hotel.platform.contract.cota.HotelResResponseType;
import com.hotel.platform.contract.cota.OTACancelRQ;
import com.hotel.platform.contract.cota.OTACancelRS;
import com.hotel.platform.contract.cota.OTAHotelAvailRQ;
import com.hotel.platform.contract.cota.OTAHotelAvailRS;
import com.hotel.platform.contract.cota.OTAHotelResRQ;

/**
 * Created by mowei on 2019/4/9.
 */
@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface HotelReservationService {
    @WebMethod(operationName = "OTAHotelAvailRQ", action = "http://www.opentravel.org/OTA/2003/05/OTAHotelAvailRQ")
    @WebResult(name = "OTA_HotelAvailRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
    OTAHotelAvailRS hotelAvail(@WebParam(name = "OTA_HotelAvailRQ",
            targetNamespace = "http://www.opentravel.org/OTA/2003/05") OTAHotelAvailRQ request);

    @WebMethod(operationName = "OTA_CancelRQ", action = "http://www.opentravel.org/OTA/2003/05/OTACancelRQ")
    @WebResult(name = "OTA_CancelRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
    OTACancelRS cancelOrder(@WebParam(name = "OTA_CancelRQ",
            targetNamespace = "http://www.opentravel.org/OTA/2003/05") OTACancelRQ request);

    @WebMethod(operationName = "OTA_HotelResRQ", action = "http://www.opentravel.org/OTA/2003/05/OTAHotelResRQ")
    @WebResult(name = "HotelResResponseType", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
    HotelResResponseType newOrder(@WebParam(name = "OTA_HotelResRQ",
            targetNamespace = "http://www.opentravel.org/OTA/2003/05") OTAHotelResRQ request);
}
