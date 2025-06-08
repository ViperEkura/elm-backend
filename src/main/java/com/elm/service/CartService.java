package com.elm.service;

import com.elm.entity.Cart;
import java.util.List;


public interface CartService {
    List<Cart> listCart(String userId);
    int saveCart(Integer businessId, String userId, Integer foodId);
    int updateCart(Integer businessId, String userId, Integer foodId, Integer quantity);
    int removeCart(Integer businessId, String userId, Integer foodId);

}
