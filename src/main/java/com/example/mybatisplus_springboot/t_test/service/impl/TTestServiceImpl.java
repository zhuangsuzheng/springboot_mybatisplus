package com.example.mybatisplus_springboot.t_test.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatisplus_springboot.t_test.entity.TTest;
import com.example.mybatisplus_springboot.t_test.dao.TTestMapper;
import com.example.mybatisplus_springboot.t_test.service.ITTestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2021-03-14
 */
@Service
public class TTestServiceImpl extends ServiceImpl<TTestMapper, TTest> implements ITTestService {

    @Autowired
    TTestMapper tTestMapper;

    @Override
    public TTest getTest() {
        QueryWrapper<TTest> tTestQueryWrapper = new QueryWrapper<>();
        tTestQueryWrapper.eq("id","1");
        return tTestMapper.selectOne(tTestQueryWrapper);
    }
}
