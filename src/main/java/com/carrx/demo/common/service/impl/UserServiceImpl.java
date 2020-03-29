//package com.carrx.demo.common.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.carrx.demo.common.common.constant.Constants;
//import com.carrx.demo.common.dao.UserDao;
//import com.carrx.demo.common.entity.UserEntity;
//import com.carrx.demo.common.service.UserService;
//
///**
// * 用户实现类
// *
// * @Author: Carl.Xiang
// * @Date: 2019/12/31 13:49
// **/
//@Service
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    private UserDao userDao;
//
//    @Override
//    public UserEntity getUserById(String id) {
//        UserEntity user = userDao.getOne(id);
//        return user;
//    }
//
//    @Override
//    public void saveUser(UserEntity user) {
//        user.preInsert();
//        user.setIsEnabled(Constants.YES_OR_NO_YES);
//        user.setIsDeleted(Constants.YES_OR_NO_NO);
//        userDao.save(user);
//    }
//
//    @Override
//    public void updateUser(UserEntity user) {
//        UserEntity dbUser = this.getUserById(user.getId());
//        dbUser.preUpdate();
//        dbUser.setName(user.getName());
//        dbUser.setPassword(user.getPassword());
//        dbUser.setUsername(user.getUsername());
//        dbUser.setGender(user.getGender());
//        dbUser.setIsEnabled(user.getIsEnabled());
//        dbUser.setIsDeleted(user.getIsDeleted());
//        userDao.save(dbUser);
//    }
//
//    @Override
//    public void removeUser(String id) {
//        UserEntity dbUser = this.getUserById(id);
//        dbUser.setIsDeleted(Constants.YES_OR_NO_YES);
//        userDao.save(dbUser);
//    }
//
//    @Override
//    public void deleteUser(String id) {
//        userDao.deleteById(id);
//    }
//
//}
