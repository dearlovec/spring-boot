package com.example.springBootmybatis.service;

import com.example.springBootmybatis.domain.entity.UserEntity;
import com.example.springBootmybatis.domain.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserService
 * @Author nothingToSay
 * @Date 2018/11/22 16:52
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<UserEntity> getall(){
        return userMapper.getAll();
    }
}
