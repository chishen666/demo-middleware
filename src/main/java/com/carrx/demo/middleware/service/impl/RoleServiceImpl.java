//package com.carrx.demo.middleware.service.impl;
//
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//import org.springframework.util.CollectionUtils;
//
//import com.carrx.demo.common.constants.Constants;
//import com.carrx.demo.common.constants.ResponseConstants;
//import com.carrx.demo.middleware.common.entity.PageModel;
//import com.carrx.demo.middleware.common.exception.BusinessException;
//import com.carrx.demo.middleware.common.service.impl.BaseCrudServiceImpl;
//import com.carrx.demo.middleware.entity.RoleEntity;
//import com.carrx.demo.middleware.mapper.RoleMapper;
//import com.carrx.demo.middleware.service.RoleService;
//import com.github.pagehelper.Page;
//
//import tk.mybatis.mapper.entity.Example;
//
///**
// * 角色实现类
// *
// * @Author: Carl.Xiang
// * @Date: 2019/12/31 19:10
// **/
//@Service
//public class RoleServiceImpl extends BaseCrudServiceImpl<RoleEntity, RoleMapper> implements RoleService {
//
//    @Override
//    public RoleEntity getRole(String id) {
//        RoleEntity roleEntity = super.get(id);
//        return roleEntity;
//    }
//
//    @Override
//    public Page<RoleEntity> listRoles(RoleEntity roleEntity, PageModel pageModel) {
//        Page page = super.startPage(pageModel);
//        dao.select(roleEntity);
//        return page;
//    }
//
//    @Override
//    public void saveRole(RoleEntity roleEntity) {
//        // 1.业务校验：角色编码和角色名称不能重复
//        Example example = new Example(RoleEntity.class);
//        example.createCriteria().andEqualTo("roleCode", roleEntity.getRoleCode()).orEqualTo("roleName",
//            roleEntity.getRoleName());
//        List<RoleEntity> list = dao.selectByExample(example);
//        if (!CollectionUtils.isEmpty(list)) {
//            if (roleEntity.getRoleCode().equals(list.get(0).getRoleCode())) {
//                throw new BusinessException(ResponseConstants.VALIDATE_ROLE_ROLECODE_IS_EXISTED);
//            } else {
//                throw new BusinessException(ResponseConstants.VALIDATE_ROLE_ROLENAME_IS_EXISTED);
//            }
//        }
//
//        // 2.数据保存
//        roleEntity.setIsEnabled(Constants.YES_OR_NO_YES);
//        roleEntity.setIsDeleted(Constants.YES_OR_NO_NO);
//        super.save(roleEntity);
//    }
//
//    @Override
//    public void updateRole(RoleEntity roleEntity) {
//        // 1.业务校验：角色编码和角色名称不能重复
//        Example example = new Example(RoleEntity.class);
//
//        Example.Criteria criteria1 = example.createCriteria();
//        criteria1.andNotEqualTo("id", roleEntity.getId());
//
//        Example.Criteria criteria2 = example.createCriteria();
//        criteria2.andEqualTo("roleCode", roleEntity.getRoleCode()).orEqualTo("roleName", roleEntity.getRoleName());
//
//        example.and(criteria1);
//        example.and(criteria2);
//
//        List<RoleEntity> list = dao.selectByExample(example);
//        if (!CollectionUtils.isEmpty(list)) {
//            if (roleEntity.getRoleCode().equals(list.get(0).getRoleCode())) {
//                throw new BusinessException(ResponseConstants.VALIDATE_ROLE_ROLECODE_IS_EXISTED);
//            } else {
//                throw new BusinessException(ResponseConstants.VALIDATE_ROLE_ROLENAME_IS_EXISTED);
//            }
//        }
//
//        // 2.数据保存
//        super.update(roleEntity);
//    }
//
//    @Override
//    public void removeRole(RoleEntity roleEntity) {
//        RoleEntity paramsRoleEntity = new RoleEntity();
//        paramsRoleEntity.setId(roleEntity.getId());
//        paramsRoleEntity.setVersion(roleEntity.getVersion());
//        paramsRoleEntity.setIsDeleted(Constants.YES_OR_NO_YES);
//        super.update(paramsRoleEntity);
//    }
//
//    @Override
//    public void deleteRole(RoleEntity roleEntity) {
//        super.delete(roleEntity);
//    }
//}
