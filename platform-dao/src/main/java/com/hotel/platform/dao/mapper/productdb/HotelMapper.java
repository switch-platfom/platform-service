package com.hotel.platform.dao.mapper.productdb;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by mowei on 2019/4/12.
 */
@Mapper
public interface HotelMapper {
    @Select("select count(1) from hotel")
    Integer count();
}
