package com.elm.controller;


import com.elm.entity.Food;
import com.elm.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("elm/FoodController")
@CrossOrigin(origins = "*")
public class FoodController {
    FoodService foodService;

    @Autowired
    public void setFoodService(FoodService foodService){
        this.foodService = foodService;
    }

    @PostMapping("/listFoodByBusinessId")
    public List<Food> listFoodByBusinessId(@RequestParam Integer businessId){
        return foodService.listFoodByBusinessId(businessId);
    }
}
