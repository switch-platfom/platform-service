package com.hotel.platform.web.web;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.hotel.platform.entity.UserInfo;
import com.hotel.platform.dao.mapper.UserInfoMapper;
import com.hotel.platform.common.constans.LogAppend;

@RestController
@RequestMapping("/test")
public class MainController extends BaseController {
    private static Logger UTILS_LOG = Logger.getLogger(LogAppend.UTILS);
    private static Logger EXCEPTION_LOG = Logger.getLogger(LogAppend.EXCEPTION);
    private static Logger REQUEST_LOG = Logger.getLogger(LogAppend.REQUEST);
    private static Logger DEBUG_LOG = Logger.getLogger(LogAppend.DEBUG);
    private static Logger DEFAULT_LOG = Logger.getLogger(MainController.class);

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
        return JSON.toJSONString(userInfoMapper.getUserById(userInfo.getId()));
    }
}
