package com.example.demo.service;

import com.example.demo.dto.MallUserAndOrderDTO;
import com.example.demo.entity.MallOrder;
import java.util.List;

/**
 * 订单表(MallOrder)表服务接口
 *
 * @author makejava
 * @since 2021-10-26 01:37:31
 */
public interface MallOrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallOrder queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MallOrder> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param mallOrder 实例对象
     * @return 实例对象
     */
    MallOrder insert(MallOrder mallOrder);

    /**
     * 修改数据
     *
     * @param mallOrder 实例对象
     * @return 实例对象
     */
    MallOrder update(MallOrder mallOrder);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    MallUserAndOrderDTO queryOrderInfoByUserId(Long userId);

}