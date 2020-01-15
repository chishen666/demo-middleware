package com.carrx.demo.middleware.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.carrx.demo.middleware.common.constant.ResponseConstants;
import com.carrx.demo.middleware.common.entity.BaseEntity;
import com.carrx.demo.middleware.common.exception.BusinessException;
import com.carrx.demo.middleware.utils.StringUtils;

/**
 * 基础通用Contrller
 * 
 * @Author: Carl.Xiang
 * @Date: 2020/1/2 16:30
 **/
public class BaseController<E extends BaseEntity> {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 入参校验：id必填
     * 
     * @param id
     */
    protected void validate4Id(String id) {
        if (StringUtils.isBlank(id)) {
            throw new BusinessException(ResponseConstants.VALIDATE_ID_IS_REQUIRED);
        }
    }

    /**
     * 入参校验：id和version必填
     * 
     * @param baseEntity
     */
    protected void validate4IdAndVersion(BaseEntity baseEntity) {
        this.validate4Id(baseEntity.getId());
        if (baseEntity.getVersion() == null) {
            throw new BusinessException(ResponseConstants.VALIDATE_VERSION_IS_REQUIRED);
        }
    }

    /**
     * 入参校验：数据新增
     * 
     * @param baseEntity
     */
    protected void validate4Save(E baseEntity) {}

    /**
     * 入参校验：数据更新
     * 
     * @param baseEntity
     */
    protected void validate4Update(E baseEntity) {
        this.validate4IdAndVersion(baseEntity);
    }
}
