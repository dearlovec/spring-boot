package com.example.springBootmybatis.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName UserEntity
 * @Author nothingToSay
 * @Date 2018/11/20 16:30
 **/
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String userName;
    private String passWord;
    private String email;
    private String phone;
    private Date createDate;

    public UserEntity(){}

    public UserEntity(String userName, String passWord, String email, String phone) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
