package com.example.demo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(MallUser)实体类
 *
 * @author makejava
 * @since 2021-10-25 18:32:53
 */
public class MallUser implements Serializable {
    private static final long serialVersionUID = 474875656283104365L;
    /**
    * 主键id
    */
    private Integer id;
    /**
    * 用户id
    */
    private Long userId;
    /**
    * 用户姓名
    */
    private String userName;
    /**
    * 性别
    */
    private Integer userGender;
    /**
    * 用户地址
    */
    private String userAddress;
    /**
    * 用户生日
    */
    private Date userBirthday;
    /**
    * 用户手机号
    */
    private String userPhone;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}