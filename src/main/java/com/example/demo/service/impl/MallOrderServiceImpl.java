package com.example.demo.service.impl;

import com.example.demo.dao.MallUserDao;
import com.example.demo.dto.MallUserAndOrderDTO;
import com.example.demo.entity.MallOrder;
import com.example.demo.dao.MallOrderDao;
import com.example.demo.entity.MallUser;
import com.example.demo.service.MallOrderService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 订单表(MallOrder)表服务实现类
 *
 * @author makejava
 * @since 2021-10-26 01:37:31
 */
@Service("mallOrderService")
public class MallOrderServiceImpl implements MallOrderService {
    @Resource
    private MallOrderDao mallOrderDao;
    @Resource
    private MallUserDao mallUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallOrder queryById(Integer id) {
        return this.mallOrderDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<MallOrder> queryAllByLimit(int offset, int limit) {
        return this.mallOrderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param mallOrder 实例对象
     * @return 实例对象
     */
    @Override
    public MallOrder insert(MallOrder mallOrder) {
        this.mallOrderDao.insert(mallOrder);
        return mallOrder;
    }

    /**
     * 修改数据
     *
     * @param mallOrder 实例对象
     * @return 实例对象
     */
    @Override
    public MallOrder update(MallOrder mallOrder) {
        this.mallOrderDao.update(mallOrder);
        return this.queryById(mallOrder.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.mallOrderDao.deleteById(id) > 0;
    }

    @Override
    public MallUserAndOrderDTO queryOrderInfoByUserId(Long userId) {
        // 1. 通过用户id查询用户信息
        MallUser mallUser = new MallUser();
        mallUser.setUserId(userId);
        List<MallUser> mallUsers = mallUserDao.queryAll(mallUser);
        if(CollectionUtils.isEmpty(mallUsers)){
            return null;
        }
        MallUser user = mallUsers.get(0);

        // 2.根据用户id查询其所有订单信息
        MallOrder order = new MallOrder();
        order.setUserId(userId);
        List<MallOrder> mallOrders = mallOrderDao.queryAll(order);
        //根据购买时间倒序展示
        List<MallOrder> orderList = mallOrders.stream()
                .sorted(Comparator.comparing(MallOrder::getCreateTime).reversed())
                .collect(Collectors.toList());


        //封装返回对象
        return MallUserAndOrderDTO.builder().userId(userId)
                .userAddress(user.getUserAddress())
                .userBirthday(user.getUserBirthday())
                .userName(user.getUserName())
                .userGender(user.getUserGender())
                .userPhone(user.getUserPhone())
                .mallOrderList(orderList)
                .build();
    }
}