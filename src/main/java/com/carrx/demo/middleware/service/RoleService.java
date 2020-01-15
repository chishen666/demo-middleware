package com.carrx.demo.middleware.service;

import com.carrx.demo.middleware.common.entity.PageModel;
import com.carrx.demo.middleware.common.service.BaseCrudService;
import com.carrx.demo.middleware.entity.RoleEntity;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

/**
 * 角色Service
 *
 * @Author: Carl.Xiang
 * @Date: 2019/12/31 19:08
 **/
public interface RoleService extends BaseCrudService<RoleEntity> {
    /**
     * 根据id查询角色
     * 
     * @param id
     * @return
     */
    RoleEntity getRole(String id);

    /**
     * 分页条件查询角色列表
     *
     * @param roleEntity
     * @param pageModel
     * @return
     */
    Page<RoleEntity> listRoles(RoleEntity roleEntity, PageModel pageModel);

    /**
     * 保存角色
     * 
     * @param roleEntity
     */
    void saveRole(RoleEntity roleEntity);

    /**
     * 更新角色
     * 
     * @param roleEntity
     */
    void updateRole(RoleEntity roleEntity);

    /**
     * 删除角色（逻辑删除）
     * 
     * @param roleEntity
     */
    void removeRole(RoleEntity roleEntity);

    /**
     * 删除角色（物理删除）
     *
     * @param roleEntity
     */
    void deleteRole(RoleEntity roleEntity);
}
