package com.carrx.demo.middleware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carrx.demo.middleware.common.entity.Response;
import com.carrx.demo.middleware.entity.UserEntity;
import com.carrx.demo.middleware.utils.RedisUtils;

/**
 * Redis测试类
 * 
 * @Author: Carl.Xiang
 * @Date: 2020/1/15 11:51
 **/
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisUtils redisUtils;

    @GetMapping("/test")
    public Response test() {
        UserEntity userEntity = new UserEntity();
        userEntity.setName("123");
        redisUtils.setValue("user", userEntity);
        UserEntity a = redisUtils.getValue("user");
        return Response.success(a);
    }
}
