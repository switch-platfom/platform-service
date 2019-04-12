package com.hotel.platform.job.controller;

import org.joda.time.DateTime;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.hotel.platform.common.utils.SpringBeanContext;
import com.hotel.platform.dao.mapper.test02db.TestHotelMapper;
import com.hotel.platform.entity.Hotel;

/**
 * Created by mowei on 2019/4/10.
 */
@Component
@Configurable
public class Test2Task extends QuartzJobBean {


    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        System.out.println("task2 start....");
        try {
            TestHotelMapper testHotelMapper = (TestHotelMapper) SpringBeanContext.getBean("testHotelMapper");
            Hotel hotel = new Hotel();
            hotel.setHotelName("hotelName");
            hotel.setUpdateTime(DateTime.now().toDate());
            testHotelMapper.insertHotel(hotel);
            Thread.sleep(3000);
            System.out.println(JSON.toJSONString(testHotelMapper.getHotelById(hotel.getId())));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task2 end....");
    }
}
