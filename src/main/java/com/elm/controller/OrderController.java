package com.elm.controller;


import com.elm.entity.Orders;
import com.elm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("elm/OrdersController")
@CrossOrigin(origins = "*")
public class OrderController {

    OrderService orderService;
    @Autowired
    public void setOrderService(OrderService orderService){
        this.orderService = orderService;
    }

    @RequestMapping("/createOrders")
    public int creatOrders(
            @RequestParam String userId,
            @RequestParam Integer businessId,
            @RequestParam Integer daId,
            @RequestParam Double orderTotal)
    {
        return  orderService.createOrders(userId, businessId, daId, orderTotal);
    }

    @RequestMapping("/listOrdersByUserId")
    public List<Orders> listOrdersByUserId(@RequestParam String userId){
        return orderService.listOrdersByUserId(userId);
    }

    @RequestMapping("/getOrdersById")
    public Orders getOrdersById(@RequestParam Integer orderId){
        return orderService.getOrdersById(orderId);
    }
}
