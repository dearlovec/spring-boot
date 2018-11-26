package com.example.springBootmybatis.domain.mapper;

import com.example.springBootmybatis.domain.entity.UserEntity;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Author nothingToSay
 * @Date 2018/11/22 14:32
 **/
public interface UserMapper {

    List<UserEntity> getAll();

}
