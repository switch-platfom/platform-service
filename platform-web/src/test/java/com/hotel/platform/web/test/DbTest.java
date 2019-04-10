package com.hotel.platform.web.test;

import com.hotel.platform.dao.mapper.test01db.UserInfoMapper;
import com.hotel.platform.entity.UserInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hotel.platform.web.Application;

/**
 * Created by mowei on 2019/4/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DbTest {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void userInfoMapperTest(){
        UserInfo userInfo = userInfoMapper.getUserById(2);
        Assert.assertNotEquals(userInfo,null);
    }
}
