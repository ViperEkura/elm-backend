package com.elm.mapper;

import com.elm.entity.Business;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BusinessMapper {

    @Select("SELECT * FROM business WHERE orderTypeId = #{orderTypeId}")
    List<Business> listBusinessByOrderTypeId(Integer orderTypeId);

    @Select("SELECT * FROM business WHERE businessId = #{businessId}")
    Business getBusinessById(Integer businessId);

}
