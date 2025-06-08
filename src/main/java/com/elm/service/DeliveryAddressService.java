package com.elm.service;

import com.elm.entity.DeliveryAddress;

public interface DeliveryAddressService {

    int saveDeliveryAddress(
            String userId, String contactName, String contactSex,
            String contactTel, String address);

    int updateDeliveryAddress(
            Integer daId, String contactName, String contactSex,
            String contactTel, String address);

    int removeDeliveryAddress(Integer daId);
    DeliveryAddress getDeliveryAddressById(Integer daId);

    DeliveryAddress listDeliveryAddressByUserId(String userId);


}
