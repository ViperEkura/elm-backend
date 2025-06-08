package com.elm.mapper;


import com.elm.entity.Business;
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

    @Select("SELECT o.*, b.businessId AS business_businessId, b.businessName, b.businessAddress, " +
            "b.businessExplain, b.businessImg, b.orderTypeId, b.starPrice, b.deliveryPrice, b.remarks " +
            "FROM orders o " +
            "LEFT JOIN business b ON o.businessId = b.businessId " +
            "WHERE o.orderId = #{orderId}")
    @Results({
            // 映射多对一 Business 对象
            @Result(
                    property = "business",
                    column = "businessId",
                    javaType = Business.class,
                    one = @One(select = "com.elm.mapper.BusinessMapper.getBusinessById")
            )
    })
    Orders getOrdersById(Integer orderId);
}
