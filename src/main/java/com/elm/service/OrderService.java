package com.elm.service;

import com.elm.entity.Orders;

import java.util.List;

public interface OrderService {
    int createOrders(String userId, Integer businessId, Integer daId, Double orderTotal);

    List<Orders> listOrdersByUserId(String userId);

    Orders getOrdersById(Integer orderId);
}
