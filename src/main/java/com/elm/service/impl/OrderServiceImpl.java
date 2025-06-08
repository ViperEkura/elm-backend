package com.elm.service.impl;


import com.elm.entity.Orders;
import com.elm.mapper.OrderMapper;
import com.elm.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    OrderMapper orderMapper;

    public OrderServiceImpl(OrderMapper orderMapper){
        this.orderMapper = orderMapper;
    }

    public int createOrders(String userId, Integer businessId, Integer daId, Double orderTotal){
        return orderMapper.createOrders(userId, businessId, daId, orderTotal);
    }

    @Override
    public List<Orders> listOrdersByUserId(String userId) {
        return orderMapper.listOrdersByUserId(userId);
    }

    @Override
    public Orders getOrdersById(Integer orderId) {
        return orderMapper.getOrdersById(orderId);
    }
}
