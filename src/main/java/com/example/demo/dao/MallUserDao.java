package com.example.demo.dao;

import com.example.demo.entity.MallUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 用户表(MallUser)表数据库访问层
 *
 * @author makejava
 * @since 2021-10-25 18:32:55
 */
@Mapper
public interface MallUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MallUser queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MallUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param mallUser 实例对象
     * @return 对象列表
     */
    List<MallUser> queryAll(MallUser mallUser);

    /**
     * 新增数据
     *
     * @param mallUser 实例对象
     * @return 影响行数
     */
    int insert(MallUser mallUser);

    /**
     * 修改数据
     *
     * @param mallUser 实例对象
     * @return 影响行数
     */
    int update(MallUser mallUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}