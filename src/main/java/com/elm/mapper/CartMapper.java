package com.elm.mapper;

import com.elm.entity.Cart;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface CartMapper {
    @Select("SELECT c.*, f.*, b.* " +
            "FROM cart c " +
            "LEFT JOIN food f ON c.foodId = f.foodId " +
            "LEFT JOIN business b ON c.businessId = b.businessId " +
            "WHERE c.userId = #{userId}")
    @Results({
            @Result(property = "food.foodId", column = "food_foodId"),
            @Result(property = "food.foodName", column = "foodName"),
            @Result(property = "food.foodExplain", column = "foodExplain"),
            @Result(property = "food.foodImg", column = "foodImg"),
            @Result(property = "food.foodPrice", column = "foodPrice"),
            @Result(property = "food.businessId", column = "food_businessId"),
            @Result(property = "food.remarks", column = "remarks"),
    })
    List<Cart> listCart(String userId);

    @Insert("INSERT INTO cart(businessId, userId, foodId, quantity) " +
            "VALUES (#{businessId}, #{userId}, #{foodId}, 1)")
    int saveCart(Integer businessId, String userId, Integer foodId);

    @Update("UPDATE cart SET quantity = #{quantity} " +
            "WHERE businessId = #{businessId} AND userId = #{userId} AND foodId = #{foodId}")
    int updateCart(Integer businessId, String userId, Integer foodId, Integer quantity);

    @Delete("DELETE FROM cart " +
            "WHERE businessId = #{businessId} AND userId = #{userId} AND foodId = #{foodId}")
    int removeCart(Integer businessId, String userId, Integer foodId);
}
