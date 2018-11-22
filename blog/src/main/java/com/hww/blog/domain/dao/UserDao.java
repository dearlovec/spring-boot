package com.hww.blog.domain.dao;

import com.hww.blog.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by nothingToSay on 2018/11/20.
 */
public interface UserDao extends JpaRepository<UserEntity,Long> {

    UserEntity findAllByUserName(String userName);


    @Modifying
    @Query("UPDATE UserEntity SET passWord=?2 where userName=?1")
    UserEntity updateUserByUserName(String userName,String passWord);

}
