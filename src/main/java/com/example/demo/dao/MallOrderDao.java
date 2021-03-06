package com.example.demo.dao;

import com.example.demo.entity.MallOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 订单表(MallOrder)表数据库访问层
 *
 * @author makejava
 * @since 2021-10-26 01:37:31
 */
@Mapper
public interface MallOrderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallOrder queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MallOrder> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param mallOrder 实例对象
     * @return 对象列表
     */
    List<MallOrder> queryAll(MallOrder mallOrder);

    /**
     * 新增数据
     *
     * @param mallOrder 实例对象
     * @return 影响行数
     */
    int insert(MallOrder mallOrder);

    /**
     * 修改数据
     *
     * @param mallOrder 实例对象
     * @return 影响行数
     */
    int update(MallOrder mallOrder);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}