package com.hotel.platform.dao.mapper.test02db;

import com.hotel.platform.entity.Hotel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * Created by mowei on 2019/4/11.
 */
@Mapper
public interface HotelMapper {

    @Insert("insert into hotel(hotelname,updatetime) values(#{hotelName},#{updateTime})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Integer insertHotel(Hotel hotel);

    @Select("select hotelName,updateTime from hotel where id = #{id}")
    Hotel getHotelById(Integer hotelId);
}
