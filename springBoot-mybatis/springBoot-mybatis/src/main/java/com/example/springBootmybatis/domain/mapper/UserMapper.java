package com.example.springBootmybatis.domain.mapper;

import com.example.springBootmybatis.domain.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Author nothingToSay
 * @Date 2018/11/22 14:32
 **/
public interface UserMapper {

    @Select("select *from user")
    @Results({
            @Result(property = "userName", column = "user_name")
    })
    List<UserEntity> getAllUsers();

    @Select("SELECT *FROM user WHERE id = #{id}")
    UserEntity getOne(Long id);

    @Insert("insert into user(email,password,phone,user_name,create_date) values(#{email},#{passWord},#{phone},#{userName},now())")
    void insert(UserEntity userEntity);

    @Update("update user set user_name = #{userName},email=#{email} where id = '${id}'")
    void update(UserEntity userEntity);

    @Delete("delete from user where id = #{id}")
    void delete(Long id);

}
