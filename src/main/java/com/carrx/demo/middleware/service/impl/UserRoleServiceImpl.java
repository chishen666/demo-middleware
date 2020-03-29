//package com.carrx.demo.middleware.service.impl;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.carrx.demo.middleware.entity.UserRoleEntity;
//import com.carrx.demo.middleware.mapper.UserRoleMapper;
//import com.carrx.demo.middleware.model.UserRoleModel;
//import com.carrx.demo.middleware.service.UserRoleService;
//
///**
// * 用户角色关联实现类
// *
// * @Author: Carl.Xiang
// * @Date: 2020/1/2 16:09
// **/
//@Service
//public class UserRoleServiceImpl implements UserRoleService {
//
//    @Autowired
//    private UserRoleMapper userRoleMapper;
//
//    @Override
//    public List<UserRoleEntity> getRolesByUserName(String username) {
//        UserRoleEntity userRoleEntity = new UserRoleEntity();
//        userRoleEntity.setUsername(username);
//        List<UserRoleEntity> list = userRoleMapper.select(userRoleEntity);
//        return list;
//    }
//
//    @Override
//    public void bind(UserRoleModel userRoleModel) {
//        String username = userRoleModel.getUsername();
//        List<String> roleCodes = userRoleModel.getRoleCodes();
//
//        // 1：解绑用户的角色
//        this.unbind(username);
//
//        // 2：绑定用户的角色
//        List<UserRoleEntity> userRoleEntities = roleCodes.stream().map(roleCode -> {
//            UserRoleEntity userRoleEntity = new UserRoleEntity();
//            userRoleEntity.preInsert();
//            userRoleEntity.setUsername(username);
//            userRoleEntity.setRoleCode(roleCode);
//            userRoleMapper.insertSelective(userRoleEntity);
//            return userRoleEntity;
//        }).collect(Collectors.toList());
//        // userRoleMapper.insertList(userRoleEntities);
//
//    }
//
//    @Override
//    public void unbind(String username) {
//        UserRoleEntity userRoleEntity = new UserRoleEntity();
//        userRoleEntity.setUsername(username);
//        userRoleMapper.delete(userRoleEntity);
//    }
//}
