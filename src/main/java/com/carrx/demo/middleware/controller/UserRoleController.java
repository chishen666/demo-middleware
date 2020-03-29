//package com.carrx.demo.middleware.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import com.carrx.demo.middleware.common.entity.Response;
//import com.carrx.demo.middleware.model.UserRoleModel;
//import com.carrx.demo.middleware.service.UserRoleService;
//
///**
// * 用户角色关联Controller
// *
// * @Author: Carl.Xiang
// * @Date: 2020/1/2 18:48
// **/
//@RestController
//@RequestMapping("/userrole")
//public class UserRoleController {
//
//    @Autowired
//    private UserRoleService userRoleService;
//
//    @PostMapping("/bind")
//    public Response bind(@RequestBody UserRoleModel userRoleModel) {
//        userRoleService.bind(userRoleModel);
//        return Response.success();
//    }
//
//    @GetMapping("/unbind")
//    public Response unbind(@RequestParam String username) {
//        userRoleService.unbind(username);
//        return Response.success();
//    }
//}
