package com.example.springBootmybatis.controller;

import com.example.springBootmybatis.domain.entity.UserEntity;
import com.example.springBootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Author nothingToSay
 * @Date 2018/11/22 15:01
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAll")
    public List<UserEntity> getUsers(){
        return userService.getall();
    }

}
