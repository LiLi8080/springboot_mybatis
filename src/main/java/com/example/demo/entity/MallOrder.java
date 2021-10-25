package com.example.demo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单表(MallOrder)实体类
 *
 * @author makejava
 * @since 2021-10-26 01:37:31
 */
public class MallOrder implements Serializable {
    private static final long serialVersionUID = 933759385491436468L;
    /**
    * 主键id
    */
    private Integer id;
    /**
    * 订单id
    */
    private Long orderId;
    /**
    * 用户id
    */
    private Long userId;
    /**
    * 商品id
    */
    private Long goodsId;
    /**
    * 订单总额
    */
    private Double totalAmount;
    /**
    * 支付方式
    */
    private Integer payType;
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

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
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