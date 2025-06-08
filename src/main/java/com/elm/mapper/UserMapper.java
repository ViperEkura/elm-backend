package com.elm.mapper;

import com.elm.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Insert({
            "INSERT INTO user (userId, password, userName, userSex, userImg, delTag)" +
            "VALUES (#{userId}, #{password}, #{userName}, #{userSex}, #{userImg}, 1)"
    })
    int saveUser(User user);

    @Select("SELECT * FROM user WHERE userId = #{userId}")
    User getUserById(String userId);

    @Select("SELECT * FROM user WHERE userId = #{userId} AND password = #{password}")
    User getUserByIdByPass(@Param("userId") String userId, @Param("password") String password);
}