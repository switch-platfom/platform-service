package com.hotel.platform.job.controller;

import java.util.UUID;

import org.joda.time.DateTime;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.hotel.platform.common.utils.SpringBeanContext;
import com.hotel.platform.dao.mapper.test01db.UserInfoMapper;
import com.hotel.platform.entity.UserInfo;

/**
 * Created by mowei on 2019/4/7.
 */
@Component
@Configurable
public class TestTask extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("task start....");
        try {
            UserInfoMapper userInfoMapper = (UserInfoMapper) SpringBeanContext.getBean("userInfoMapper");
            UserInfo userInfo = new UserInfo();
            userInfo.setUserName("Mowei");
            userInfo.setUpdateTime(DateTime.now().toDate());
            userInfoMapper.insertUser(userInfo);

            Thread.sleep(3000);

            System.out.println(JSON.toJSONString(userInfoMapper.getUserById(userInfo.getId())));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task end....");
    }
}
