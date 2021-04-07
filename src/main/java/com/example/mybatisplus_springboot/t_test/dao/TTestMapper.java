package com.example.mybatisplus_springboot.t_test.dao;

import com.example.mybatisplus_springboot.t_test.entity.TTest;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author astupidcoder
 * @since 2021-03-14
 */
@Mapper
public interface TTestMapper extends BaseMapper<TTest> {

}
