package com.elm.mapper;

import com.elm.entity.Food;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FoodMapper {
    @Select("SELECT * FROM food WHERE businessId = #{businessId}")
    List<Food> listFoodByBusinessId(Integer businessId);

}
