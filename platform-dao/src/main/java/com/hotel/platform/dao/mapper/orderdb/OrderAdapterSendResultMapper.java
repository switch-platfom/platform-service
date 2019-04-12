package com.hotel.platform.dao.mapper.orderdb;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by mowei on 2019/4/12.
 */
@Mapper
public interface OrderAdapterSendResultMapper {
    @Select("select count(1) from order_adaptersendresult")
    Integer count();
}
