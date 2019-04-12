package com.hotel.platform.dao.mapper.supplierdb;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by mowei on 2019/4/12.
 */
@Mapper
public interface SupplierHotelInfoMapper {
    @Select("select count(1) from supplier_hotelinfo")
    Integer count();
}
