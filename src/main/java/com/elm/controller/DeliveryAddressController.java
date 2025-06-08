package com.elm.controller;

import com.elm.entity.DeliveryAddress;
import com.elm.service.DeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("elm/DeliveryAddressController")
@CrossOrigin(origins = "*")
public class DeliveryAddressController {

    DeliveryAddressService deliveryAddressService;

    @Autowired
    public void setDeliveryAddressService(DeliveryAddressService deliveryAddressService){
        this.deliveryAddressService = deliveryAddressService;
    }

    @PostMapping("/saveDeliveryAddress")
    public int saveDeliveryAddress(
            @RequestParam String userId,
            @RequestParam String contactName,
            @RequestParam String contactSex,
            @RequestParam String contactTel,
            @RequestParam String address){
        return deliveryAddressService.saveDeliveryAddress(userId, contactName, contactSex,
                contactTel, address);
    }

    @PostMapping("/updateDeliveryAddress")
    public int updateDeliveryAddress(
            @RequestParam Integer daId,
            @RequestParam String contactName,
            @RequestParam String contactSex,
            @RequestParam String contactTel,
            @RequestParam String address){
        return deliveryAddressService.updateDeliveryAddress(daId, contactName, contactSex, contactTel, address);
    }

    @PostMapping("/removeDeliveryAddress")
    public int removeDeliveryAddress(@RequestParam Integer daId){
        return deliveryAddressService.removeDeliveryAddress(daId);
    }

    @PostMapping("/getDeliveryAddressById")
    public DeliveryAddress getDeliveryAddressById(@RequestParam Integer daId){
        return deliveryAddressService.getDeliveryAddressById(daId);
    }

    @PostMapping("/listDeliveryAddressByUserId")
    public DeliveryAddress listDeliveryAddressByUserId(@RequestParam String userId){
        return  deliveryAddressService.listDeliveryAddressByUserId(userId);
    }

}
