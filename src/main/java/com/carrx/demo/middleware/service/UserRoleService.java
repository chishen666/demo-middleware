//package com.carrx.demo.middleware.service;
//
//import java.util.List;
//
//import com.carrx.demo.middleware.entity.UserRoleEntity;
//import com.carrx.demo.middleware.model.UserRoleModel;
//
///**
// * 用户角色关联Service
// *
// * @Author: Carl.Xiang
// * @Date: 2020/1/2 11:47
// **/
//public interface UserRoleService {
//    /**
//     * 根据username查询用户所有角色信息
//     *
//     * @param username
//     *            用户名
//     * @return
//     */
//    List<UserRoleEntity> getRolesByUserName(String username);
//
//    /**
//     * 给用户绑定角色
//     *
//     * @param userRoleModel
//     */
//    void bind(UserRoleModel userRoleModel);
//
//    /**
//     * 给用户解绑角色
//     *
//     * @param username
//     *            用户名
//     */
//    void unbind(String username);
//}
