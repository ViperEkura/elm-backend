package com.elm.service.impl;

import com.elm.entity.Food;
import com.elm.mapper.FoodMapper;
import com.elm.service.FoodService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
    FoodMapper foodMapper;

    public FoodServiceImpl(FoodMapper foodMapper){
        this.foodMapper = foodMapper;
    }
    @Override
    public List<Food> listFoodByBusinessId(Integer businessId) {
        return foodMapper.listFoodByBusinessId(businessId);
    }
}
