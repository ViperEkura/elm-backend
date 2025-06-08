package com.elm.controller;

import com.elm.entity.User;
import com.elm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("elm/UserController")
@CrossOrigin(origins = "*")
public class UserController {
    UserService service;

    @Autowired
    public void setUserService(UserService userService) {
        this.service = userService;
    }

    @PostMapping("/saveUser")
    public int saveUser(
            @RequestParam String userId, @RequestParam String password,
            @RequestParam String userName, @RequestParam Integer userSex)
    {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setUserName(userName);
        user.setUserSex(userSex);
        return service.saveUser(user);
    }

    @PostMapping("/getUserById")
    public int getUserById(@RequestParam String userId){
        return service.getUserById(userId);
    }

    @PostMapping("/getUserByIdByPass")
    public User getUserByIdByPass(@RequestParam String userId, @RequestParam String password){
        return service.getUserByIdByPass(userId, password);
    }
}
