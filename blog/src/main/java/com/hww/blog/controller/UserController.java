package com.hww.blog.controller;

import com.hww.blog.domain.entity.UserEntity;
import com.hww.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @ClassName UserController
 * @Author nothingToSay
 * @Date 2018/11/20 16:40
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public void insert(@RequestBody UserEntity user){
        user.setCreateDate(new Date());
        userService.insert(user);
    }


    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public Page<UserEntity> findAll(int page, int size){
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(page,size,sort);
        return userService.findAll(pageable);
    }

    @RequestMapping("/{id}")
    public UserEntity findUser(@PathVariable Long id){
        return userService.findUser(id);
    }

}
