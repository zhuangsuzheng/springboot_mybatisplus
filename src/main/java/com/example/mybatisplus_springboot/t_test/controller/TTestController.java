package com.example.mybatisplus_springboot.t_test.controller;


import com.example.mybatisplus_springboot.t_test.entity.TTest;
import com.example.mybatisplus_springboot.t_test.service.ITTestService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2021-03-14
 */
@RestController
@RequestMapping("/test")
public class TTestController {

    @Autowired
    ITTestService testServicel;

    @RequestMapping("/test")
    public TTest getTest() {

        return testServicel.getTest();
    }

    @RequestMapping("/getmap")
    public Object getMap(@RequestParam Map<String,Object> params) {

        List<Map<String,String>> xuekeArr = new ArrayList<>();
        if (params.containsKey("xueke")) {
            Gson gson = new Gson();
            xuekeArr = gson.fromJson(params.get("xueke") + "", List.class);
        }
        return xuekeArr;
    }
}
