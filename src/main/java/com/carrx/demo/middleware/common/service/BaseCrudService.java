//package com.carrx.demo.middleware.common.service;
//
//import java.util.List;
//
//import com.carrx.demo.middleware.common.entity.BaseEntity;
//
///**
// * 服务层CRUD基础接口
// *
// * @Author: Carl.Xiang
// * @Date: 2020/1/3 15:18
// **/
//public interface BaseCrudService<E extends BaseEntity> {
//    /**
//     * 根据id查询一个实体
//     *
//     * @param id
//     * @return
//     */
//    E get(String id);
//
//    /**
//     * 根据条件查询一个实体
//     *
//     * @param entity
//     * @return
//     */
//    E get(E entity);
//
//    /**
//     * 根据条件查实体列表
//     *
//     * @param entity
//     * @return
//     */
//    List<E> find(E entity);
//
//    /**
//     * 保存一个实体
//     *
//     * @param entity
//     */
//    void save(E entity);
//
//    /**
//     * 更新一个实体
//     *
//     * @param entity
//     */
//    void update(E entity);
//
//    /**
//     * 删除一个实体（物理删除）
//     *
//     * @param entity
//     */
//    void delete(E entity);
//
//}
