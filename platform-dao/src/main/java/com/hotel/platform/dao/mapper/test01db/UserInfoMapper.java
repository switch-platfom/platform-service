package com.hotel.platform.dao.mapper.test01db;

import com.hotel.platform.entity.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


/**
 * Created by mowei on 2019/4/7.
 */
@Mapper
public interface UserInfoMapper {
    @Insert({"insert into userinfo(username,updatetime) values(#{userName},#{updateTime})"})
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Integer insertUser(UserInfo userInfo);

    @Select("select * from userinfo where id = #{id}")
    UserInfo getUserById(@Param(value = "id") Integer id);
}
