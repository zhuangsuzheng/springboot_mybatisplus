package com.example.mybatisplus_springboot.t_test.service;

import com.example.mybatisplus_springboot.t_test.entity.TTest;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author astupidcoder
 * @since 2021-03-14
 */
public interface ITTestService extends IService<TTest> {

    TTest getTest();
}
