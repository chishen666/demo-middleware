package com.carrx.demo.middleware.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carrx.demo.middleware.entity.UserEntity;

/**
 * 用户Dao
 * 
 * @Author: Carl.Xiang
 * @Date: 2019/12/31 13:49
 **/
@Repository
public interface UserDao extends JpaRepository<UserEntity, String> {}
