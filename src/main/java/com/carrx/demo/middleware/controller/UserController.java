package com.carrx.demo.middleware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.carrx.demo.middleware.common.entity.Response;
import com.carrx.demo.middleware.entity.UserEntity;
import com.carrx.demo.middleware.service.UserService;

/**
 * 用户Controller
 *
 * @Author: Carl.Xiang
 * @Date: 2019/12/31 13:49
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Response get(@PathVariable String id) {
        UserEntity user = userService.getUserById(id);
        return Response.success(user);
    }

    @PostMapping
    public Response save(@RequestBody UserEntity user) {
        userService.saveUser(user);
        return Response.success();
    }

    @PutMapping
    public Response update(@RequestBody UserEntity user) {
        userService.updateUser(user);
        return Response.success();
    }

    @PutMapping("/{id}")
    public Response remove(@PathVariable String id) {
        userService.removeUser(id);
        return Response.success();
    }

    @DeleteMapping("/{id}")
    public Response delete(@PathVariable String id) {
        userService.deleteUser(id);
        return Response.success();
    }

}
