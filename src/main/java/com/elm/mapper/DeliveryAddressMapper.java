package com.elm.mapper;


import com.elm.entity.DeliveryAddress;
import org.apache.ibatis.annotations.*;


@Mapper
public interface DeliveryAddressMapper {
    @Insert("INSERT INTO deliveryaddress (contactName, contactSex, contactTel, address, userId) " +
            "VALUES (#{contactName}, #{contactSex}, #{contactTel}, #{address}, #{userId})")
    int saveDeliveryAddress(
            String userId, String contactName, String contactSex,
            String contactTel, String address);

    @Update("UPDATE deliveryaddress SET " +
            "contactName = #{contactName}, contactSex = #{contactSex}, " +
            "contactTel = #{contactTel}, address = #{address} " +
            "WHERE daId = #{daId}")
    int updateDeliveryAddress(Integer daId, String contactName, String contactSex,
                              String contactTel, String address);

    @Select("SELECT * FROM deliveryaddress WHERE daId = #{daId}")
    DeliveryAddress getDeliveryAddressById(Integer daId);


    @Select("SELECT * FROM deliveryaddress WHERE userId = #{userId}")
    DeliveryAddress listDeliveryAddressByUserId(String userId);

    @Delete("DELETE FROM deliveryaddress WHERE daId = #{daId}")
    int removeDeliveryAddress(Integer daId);
}
