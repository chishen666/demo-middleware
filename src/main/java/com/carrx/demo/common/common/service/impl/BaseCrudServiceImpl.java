//package com.carrx.demo.common.common.service.impl;
//
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.carrx.demo.common.common.component.PageProperties;
//import com.carrx.demo.common.common.constant.Constants;
//import com.carrx.demo.common.common.constant.ResponseConstants;
//import com.carrx.demo.common.common.entity.BaseEntity;
//import com.carrx.demo.common.common.entity.PageModel;
//import com.carrx.demo.common.common.exception.BusinessException;
//import com.carrx.demo.common.common.mapper.BaseCrudMapper;
//import com.carrx.demo.common.common.service.BaseCrudService;
//import com.carrx.demo.common.common.utils.StringUtils;
//import com.github.pagehelper.Page;
//import com.github.pagehelper.PageHelper;
//
///**
// * 服务层CRUD基础接口实现
// *
// * @Author: Carl.Xiang
// * @Date: 2020/1/2 19:31
// **/
//public class BaseCrudServiceImpl<E extends BaseEntity, R extends BaseCrudMapper<E>> implements BaseCrudService<E> {
//
//    protected Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Autowired
//    protected R dao;
//
//    @Autowired
//    private PageProperties pageProperties;
//
//    @Override
//    public E get(String id) {
//        if (StringUtils.isBlank(id)) {
//            throw new BusinessException(Constants.EXCEPTION_CODE_5000, ResponseConstants.BASECRUD_ID_NOT_EXISTED);
//        }
//        E entity = dao.selectByPrimaryKey(id);
//        return entity;
//    }
//
//    @Override
//    public E get(E entity) {
//        entity = dao.selectOne(entity);
//        return entity;
//    }
//
//    @Override
//    public List<E> find(E entity) {
//        List<E> list = dao.select(entity);
//        return list;
//    }
//
//    @Override
//    public void save(E entity) {
//        entity.preInsert();
//        int count = dao.insertSelective(entity);
//        if (count < 1) {
//            throw new BusinessException(Constants.EXCEPTION_CODE_5000, ResponseConstants.BASECRUD_SAVE_ERROR);
//        }
//
//    }
//
//    @Override
//    public void update(E entity) {
//        entity.preUpdate();
//        int count = dao.updateByPrimaryKeySelective(entity);
//        if (count < 1) {
//            throw new BusinessException(Constants.EXCEPTION_CODE_5000, ResponseConstants.BASECRUD_UPDATE_ERROR);
//        }
//    }
//
//    @Override
//    public void delete(E entity) {
//        int count = dao.delete(entity);
//        if (count < 1) {
//            throw new BusinessException(Constants.EXCEPTION_CODE_5000, ResponseConstants.BASECRUD_DELETE_ERROR);
//        }
//    }
//
//    protected Page<E> startPage(PageModel pageModel) {
//        int pageNum = this.getReasonablePageNum(pageModel.getPageNum());
//        int pageSize = this.getReasonablePageSize(pageModel.getPageSize());
//        String orderBy = this.getReasonablePageSort(pageModel.getSort());
//        Page<E> page = this.startPage(pageNum, pageSize, orderBy);
//        return page;
//    }
//
//    protected <E> Page<E> startPage(Integer pageNum, Integer pageSize, String orderBy) {
//        pageNum = this.getReasonablePageNum(pageNum);
//        pageSize = this.getReasonablePageSize(pageSize);
//        orderBy = this.getReasonablePageSort(orderBy);
//        Page<E> page = PageHelper.startPage(pageNum, pageSize, orderBy);
//        return page;
//    }
//
//    protected <T> Page<T> startPage(Class<T> clazz, Integer pageNum, Integer pageSize, String orderBy) {
//        pageNum = this.getReasonablePageNum(pageNum);
//        pageSize = this.getReasonablePageSize(pageSize);
//        orderBy = this.getReasonablePageSort(orderBy);
//        Page<T> page = PageHelper.startPage(pageNum, pageSize, orderBy);
//        return page;
//    }
//
//    private int getReasonablePageNum(Integer pageNum) {
//        if (pageNum == null || pageNum <= 0) {
//            pageNum = this.pageProperties.getDefaultPageNum();
//        }
//
//        return pageNum;
//    }
//
//    private int getReasonablePageSize(Integer pageSize) {
//        if (pageSize != null && pageSize > 0) {
//            if (pageSize > this.pageProperties.getMaxPageSize()) {
//                pageSize = this.pageProperties.getMaxPageSize();
//            }
//        } else {
//            pageSize = this.pageProperties.getDefaultPageSize();
//        }
//
//        return pageSize;
//    }
//
//    private String getReasonablePageSort(String orderBy) {
//        if (StringUtils.isBlank(orderBy)) {
//            orderBy = this.pageProperties.getDefaultPageSort();
//        }
//        return StringUtils.toUnderScoreCase(orderBy);
//    }
//}
