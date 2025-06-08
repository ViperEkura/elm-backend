package com.elm.service.impl;

import com.elm.entity.Cart;
import com.elm.mapper.CartMapper;
import com.elm.service.CartService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    CartMapper cartMapper;

    public CartServiceImpl(CartMapper cartMapper){
        this.cartMapper = cartMapper;
    }
    @Override
    public List<Cart> listCart(String userId) {
        return cartMapper.listCart(userId);
    }

    @Override
    public int saveCart(Integer businessId, String userId, Integer foodId){
        return cartMapper.saveCart(businessId, userId, foodId);
    }

    @Override
    public int updateCart(Integer businessId, String userId, Integer foodId, Integer quantity) {
        return cartMapper.updateCart(businessId, userId, foodId, quantity);
    }

    @Override
    public int removeCart(Integer businessId, String userId, Integer foodId) {
        return cartMapper.removeCart(businessId, userId, foodId);
    }

}
