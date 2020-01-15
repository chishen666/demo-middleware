package com.carrx.demo.middleware.model;

import java.util.List;

import com.carrx.demo.middleware.entity.UserRoleEntity;

/**
 * 用户角色关联model
 * 
 * @Author: Carl.Xiang
 * @Date: 2020/1/3 15:21
 **/
public class UserRoleModel extends UserRoleEntity {

    /**
     * 绑定的所有角色编码
     */
    private List<String> roleCodes;

    public List<String> getRoleCodes() {
        return roleCodes;
    }

    public void setRoleCodes(List<String> roleCodes) {
        this.roleCodes = roleCodes;
    }
}
