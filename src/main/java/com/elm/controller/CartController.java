package com.elm.controller;

import com.elm.entity.Cart;
import com.elm.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("elm/CartController")
@CrossOrigin(origins = "*")
public class CartController {
    CartService cartService;

    @Autowired
    public void setCartService(CartService cartService){
        this.cartService = cartService;
    }

    @PostMapping("/listCart")
    public List<Cart> listCart(@RequestParam String userId){
        System.out.println(cartService.listCart(userId));
        return cartService.listCart(userId);
    }

    @PostMapping("/saveCart")
    public int saveCart(
            @RequestParam Integer businessId,
            @RequestParam String userId,
            @RequestParam Integer foodId) {
        return  cartService.saveCart(businessId, userId, foodId);
    }

    @PostMapping("/updateCart")
    public int updateCart(
            @RequestParam Integer businessId,
            @RequestParam String userId,
            @RequestParam Integer foodId,
            @RequestParam Integer quantity) {
        return cartService.updateCart(businessId, userId, foodId, quantity);
    }


    @PostMapping("/removeCart")
    public int removeCart(
            @RequestParam Integer businessId,
            @RequestParam String userId,
            @RequestParam Integer foodId) {
        return cartService.removeCart(businessId, userId, foodId);
    }
}
