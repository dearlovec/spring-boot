package com.example.springBootmybatis.controller;

import com.example.springBootmybatis.domain.entity.UserEntity;
import com.example.springBootmybatis.domain.mapper.UserMapper;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getAll")
    public List<UserEntity> getUsers(){
        return userMapper.getAllUsers();
    }

    @RequestMapping("/insert")
    public void insert(){
        userMapper.insert(new UserEntity("hcc","123","1221@163.com","17692975552"));
        userMapper.insert(new UserEntity("hccb","1233","1222@163.com","17692975551"));
        userMapper.insert(new UserEntity("hqq","1234","1223@163.com","17692975553"));
        userMapper.insert(new UserEntity("hcqqw","1235","1224@163.com","17692975554"));
    }

    @RequestMapping("/update")
    public void update(){
        UserEntity userEntity = userMapper.getOne(1l);
        userEntity.setUserName("cccccccccc");
        userMapper.update(userEntity);
    }

    @RequestMapping("/delete")
    public void delete(){
        userMapper.delete(2l);
    }

}
