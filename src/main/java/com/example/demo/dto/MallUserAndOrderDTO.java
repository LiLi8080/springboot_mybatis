package com.example.demo.dto;

import com.example.demo.entity.MallOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MallUserAndOrderDTO {
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
    // 用户订单列表
    private List<MallOrder> mallOrderList;
}
