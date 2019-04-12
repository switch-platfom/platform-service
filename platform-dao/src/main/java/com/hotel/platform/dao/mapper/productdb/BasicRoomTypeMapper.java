package com.hotel.platform.dao.mapper.productdb;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by mowei on 2019/4/12.
 */
@Mapper
public interface BasicRoomTypeMapper {
    @Select("select count(1) from basicroomtype")
    Integer count();
}
