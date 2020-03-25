package com.carrx.demo.restful;

/**
 * @author Carl.Xiang
 * @date 2020/03/26
 */
public class Role {
    private String roleCode;
    private String roleName;

    public Role() {
    }

    public Role(String roleCode, String roleName) {
        this.roleCode = roleCode;
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
