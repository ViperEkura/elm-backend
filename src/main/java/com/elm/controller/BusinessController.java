package com.elm.controller;

import com.elm.entity.Business;
import com.elm.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("elm/BusinessController")
@CrossOrigin(origins = "*")
public class BusinessController {
    BusinessService businessService;

    @Autowired
    public void setBusinessService(BusinessService businessService){
        this.businessService = businessService;
    }

    @PostMapping("/listBusinessByOrderTypeId")
    public List<Business> listBusinessByOrderTypeId(@RequestParam Integer orderTypeId) {
        return businessService.listBusinessByOrderTypeId(orderTypeId);
    }

    @PostMapping("/getBusinessById")
    public Business getBusinessById(@RequestParam Integer businessId){
        return businessService.getBusinessById(businessId);
    }
}
