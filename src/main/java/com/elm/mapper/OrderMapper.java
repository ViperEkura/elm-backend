package com.elm.mapper;


import com.elm.entity.Orders;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface OrderMapper {
    @Insert("INSERT INTO orders (userId, businessId, daId, orderDate, orderTotal) " +
            "VALUES (#{userId}, #{businessId}, #{daId}, CURRENT_TIMESTAMP, #{orderTotal})")
    int createOrders(String userId, Integer businessId, Integer daId, Double orderTotal);

    @Select("SELECT * FROM orders WHERE userId = #{userId}")
    List<Orders> listOrdersByUserId(String userId);

    @Select("SELECT  * FROM orders WHERE  orderId = #{orderId}")
    Orders getOrdersById(Integer orderId);
}
