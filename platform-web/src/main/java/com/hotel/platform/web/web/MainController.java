package com.hotel.platform.web.web;


import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.hotel.platform.common.utils.LogUtil;
import com.hotel.platform.dao.mapper.UserInfoMapper;
import com.hotel.platform.entity.UserInfo;

@RestController
@RequestMapping("/test")
public class MainController extends BaseController {
    private static Logger LOGGER = LogUtil.getLogger(MainController.class);

    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 首页
     * 
     * @return
     */
    @RequestMapping("/logs")
    @ResponseBody
    public String index() {

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("mowei");
        userInfo.setUpdateTime(DateTime.now().toDate());

        userInfoMapper.insertUser(userInfo);

        LOGGER.info("ok");
        return JSON.toJSONString(userInfoMapper.getUserById(userInfo.getId()));
    }
}
