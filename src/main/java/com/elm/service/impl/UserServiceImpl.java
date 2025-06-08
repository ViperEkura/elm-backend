package com.elm.service.impl;

import com.elm.entity.User;
import com.elm.mapper.UserMapper;
import com.elm.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int saveUser(User user) {
        return  userMapper.saveUser(user);
    }

    @Override
    public int getUserById(String userId) {
        return  userMapper.getUserById(userId) == null ? 0 : 1;
    }

    @Override
    public User getUserByIdByPass(String userId, String password) {
        return userMapper.getUserByIdByPass(userId, password);
    }
}
