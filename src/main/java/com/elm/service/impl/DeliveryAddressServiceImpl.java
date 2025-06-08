package com.elm.service.impl;

import com.elm.entity.DeliveryAddress;
import com.elm.mapper.DeliveryAddressMapper;
import com.elm.service.DeliveryAddressService;
import org.springframework.stereotype.Service;

@Service
public class DeliveryAddressServiceImpl implements DeliveryAddressService {
    DeliveryAddressMapper deliveryAddressMapper;

    public DeliveryAddressServiceImpl(DeliveryAddressMapper deliveryAddressMapper){
        this.deliveryAddressMapper = deliveryAddressMapper;
    }

    @Override
    public int saveDeliveryAddress(String userId, String contactName, String contactSex,
                                   String contactTel, String address) {
        return deliveryAddressMapper.saveDeliveryAddress(userId, contactName, contactSex, contactTel, address);
    }

    @Override
    public int updateDeliveryAddress(Integer daId, String contactName, String contactSex,
                                     String contactTel, String address) {
        return deliveryAddressMapper.updateDeliveryAddress(daId, contactName, contactSex, contactTel, address);
    }

    @Override
    public int removeDeliveryAddress(Integer daId) {
        return deliveryAddressMapper.removeDeliveryAddress(daId);
    }

    @Override
    public DeliveryAddress getDeliveryAddressById(Integer daId) {
        return deliveryAddressMapper.getDeliveryAddressById(daId);
    }

    @Override
    public DeliveryAddress listDeliveryAddressByUserId(String userId) {
        return deliveryAddressMapper.listDeliveryAddressByUserId(userId);
    }
}
