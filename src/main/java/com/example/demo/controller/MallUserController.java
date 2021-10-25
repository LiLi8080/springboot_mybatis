package com.example.demo.controller;

import com.example.demo.entity.MallUser;
import com.example.demo.service.MallUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(MallUser)表控制层
 *
 * @author makejava
 * @since 2021-10-25 18:32:56
 */
@RestController
@RequestMapping("mallUser")
public class MallUserController {
    /**
     * 服务对象
     */
    @Resource
    private MallUserService mallUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MallUser selectOne(Integer id) {
        return this.mallUserService.queryById(id);
    }

    /**
     * 条件查询
     *
     * @param mallUser 条件
     * @return 查询结果数据集
     */
    @GetMapping("selectAll")
    public List<MallUser> queryAll(MallUser mallUser){
        return mallUserService.queryAll(mallUser);
    }

    /**
     * 新增单条数据
     *
     * @param mallUser 新增数据
     * @return 新增数据
     */
    @PostMapping("insertOne")
    public MallUser insertOne(@RequestBody MallUser mallUser){
        return mallUserService.insert(mallUser);
    }
    @PutMapping("updateOne")
    public MallUser updateOne(@RequestBody MallUser mallUser){
        return mallUserService.update(mallUser);
    }
    @DeleteMapping("deleteOne")
    public Boolean deleteOne( Integer id){
        return mallUserService.deleteById(id);
    }
}