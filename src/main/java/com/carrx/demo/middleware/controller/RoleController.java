package com.carrx.demo.middleware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.carrx.demo.common.constants.Constants;
import com.carrx.demo.common.constants.ResponseConstants;
import com.carrx.demo.middleware.common.controller.BaseController;
import com.carrx.demo.middleware.common.entity.PageModel;
import com.carrx.demo.middleware.common.entity.Response;
import com.carrx.demo.middleware.common.exception.BusinessException;
import com.carrx.demo.middleware.entity.RoleEntity;
import com.carrx.demo.middleware.service.RoleService;
import com.carrx.demo.common.utils.StringUtils;

/**
 * 角色Controller
 * 
 * @Author: Carl.Xiang
 * @Date: 2019/12/31 19:11
 **/
@RestController
@RequestMapping("/role")
public class RoleController extends BaseController<RoleEntity> {

    @Autowired
    private RoleService roleService;

    @GetMapping("/{id}")
    public Response get(@PathVariable String id) {
        super.validate4Id(id);
        return Response.success(roleService.getRole(id));
    }

    @GetMapping
    public Response list(RoleEntity roleEntity, PageModel pageModel) {
        return Response.success(new PageModel(roleService.listRoles(roleEntity, pageModel)));
    }

    @PostMapping
    public Response save(@RequestBody RoleEntity roleEntity) {
        this.validate4Save(roleEntity);
        roleService.saveRole(roleEntity);
        return Response.success();
    }

    @PutMapping
    public Response update(@RequestBody RoleEntity roleEntity) {
        this.validate4Update(roleEntity);
        roleService.updateRole(roleEntity);
        return Response.success();
    }

    @DeleteMapping
    public Response remove(@RequestBody RoleEntity roleEntity) {
        super.validate4IdAndVersion(roleEntity);
        roleService.removeRole(roleEntity);
        return Response.success();
    }

    @Override
    protected void validate4Save(RoleEntity roleEntity) {
        if (StringUtils.isEmpty(roleEntity.getRoleCode())) {
            throw new BusinessException(Constants.EXCEPTION_CODE_4000,
                ResponseConstants.VALIDATE_ROLE_ROLECODE_IS_REQUIRED);
        }
        if (StringUtils.isBlank(roleEntity.getRoleName())) {
            throw new BusinessException(Constants.EXCEPTION_CODE_4000,
                ResponseConstants.VALIDATE_ROLE_ROLENAME_IS_REQUIRED);
        }
    }

    @Override
    protected void validate4Update(RoleEntity roleEntity) {
        super.validate4Update(roleEntity);
        if (StringUtils.isWhitespace(roleEntity.getRoleCode())) {
            throw new BusinessException(Constants.EXCEPTION_CODE_4000,
                ResponseConstants.VALIDATE_ROLE_ROLECODE_IS_REQUIRED);
        }
        if (StringUtils.isWhitespace(roleEntity.getRoleName())) {
            throw new BusinessException(Constants.EXCEPTION_CODE_4000,
                ResponseConstants.VALIDATE_ROLE_ROLENAME_IS_REQUIRED);
        }
    }
}