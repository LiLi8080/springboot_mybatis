package com.example.demo.controller;

import com.example.demo.dto.MallUserAndOrderDTO;
import com.example.demo.entity.MallOrder;
import com.example.demo.service.MallOrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单表(MallOrder)表控制层
 *
 * @author makejava
 * @since 2021-10-26 01:37:31
 */
@RestController
@RequestMapping("mallOrder")
public class MallOrderController {
    /**
     * 服务对象
     */
    @Resource
    private MallOrderService mallOrderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MallOrder selectOne(Integer id) {
        return this.mallOrderService.queryById(id);
    }


    @GetMapping("selectMallUserAndOrderByUserId")
    public MallUserAndOrderDTO queryOrderInfoByUserId(Long userId){
        return mallOrderService.queryOrderInfoByUserId(userId);
    }
}