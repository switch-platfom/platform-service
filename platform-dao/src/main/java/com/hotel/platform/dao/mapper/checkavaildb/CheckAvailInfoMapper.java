package com.hotel.platform.dao.mapper.checkavaildb;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by mowei on 2019/4/12.
 */
@Mapper
public interface CheckAvailInfoMapper {

    @Select("select count(1) from checkavailinfo")
    Integer count();
}
