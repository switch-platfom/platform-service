package com.hotel.platform.web.configuration;

import java.util.Collections;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hotel.platform.web.impl.HotelReservationServiceImpl;

/**
 * Created by mowei on 2019/4/9.
 */
@Configuration
public class CxfConfig {
    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new HotelReservationServiceImpl());
        endpoint.setInInterceptors(Collections.singletonList(new CxfInInterceptors()));
        endpoint.setOutInterceptors(Collections.singletonList(new CxfOutInterceptors()));
        endpoint.publish("/HotelReservationService");
        return endpoint;
    }
}
