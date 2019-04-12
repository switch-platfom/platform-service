package com.hotel.platform.dao.mapper.htlroomspubdb;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by mowei on 2019/4/12.
 */
@Mapper
public interface RoomAvailInfoMapper {
    @Select("select count(1) from roomavailinfo")
    Integer count();
}
