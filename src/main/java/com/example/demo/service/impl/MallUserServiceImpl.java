package com.example.demo.service.impl;

import com.example.demo.entity.MallUser;
import com.example.demo.dao.MallUserDao;
import com.example.demo.service.MallUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(MallUser)表服务实现类
 *
 * @author makejava
 * @since 2021-10-25 18:32:56
 */
@Service("mallUserService")
public class MallUserServiceImpl implements MallUserService {
    @Resource
    private MallUserDao mallUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallUser queryById(Integer id) {
        return this.mallUserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<MallUser> queryAllByLimit(int offset, int limit) {
        return this.mallUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param mallUser 实例对象
     * @return 实例对象
     */
    @Override
    public MallUser insert(MallUser mallUser) {
        this.mallUserDao.insert(mallUser);
        return mallUser;
    }

    /**
     * 修改数据
     *
     * @param mallUser 实例对象
     * @return 实例对象
     */
    @Override
    public MallUser update(MallUser mallUser) {
        this.mallUserDao.update(mallUser);
        return this.queryById(mallUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.mallUserDao.deleteById(id) > 0;
    }

    @Override
    public List<MallUser> queryAll(MallUser mallUser) {
        return mallUserDao.queryAll(mallUser);
    }
}