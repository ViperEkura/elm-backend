package com.elm.entity;


import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Orders {
    private Integer orderId;
    private String userId;
    private Integer businessId;
    private String orderDate;
    private Double orderTotal;
    private Integer daId;
    private Integer orderState;

    //多对一
    private Business business;
    //一对多
    private List<OrderDetailet> list;
}
