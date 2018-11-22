package com.hww.blog.service;

import com.hww.blog.domain.dao.UserDao;
import com.hww.blog.domain.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserService
 * @Author nothingToSay
 * @Date 2018/11/20 16:41
 **/
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void insert(UserEntity user){
        userDao.save(user);
    }

    public void delete(Long id){
        userDao.deleteById(id);
    }

    public Page<UserEntity> findAll(Pageable pageable){
        return userDao.findAll(pageable);
    }

    public UserEntity findUser(Long id){
        return userDao.findById(id).get();
    }

    public Page<UserEntity> userPage( Pageable pageable){
        Page<UserEntity> userEntities = userDao.findAll(pageable);
        return userEntities;
    }


}
