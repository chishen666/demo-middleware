package com.carrx.demo.common.common.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Dao层CRUD基础接口
 * 
 * @Author: Carl.Xiang
 * @Date: 2020/1/2 18:49
 **/
public interface BaseCrudMapper<T> extends BaseMapper, Mapper<T>, MySqlMapper<T> {}
