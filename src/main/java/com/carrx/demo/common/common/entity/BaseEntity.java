//package com.carrx.demo.common.common.entity;
//
//import java.io.Serializable;
//import java.util.Date;
//
//import javax.persistence.Id;
//import javax.persistence.MappedSuperclass;
//
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.format.annotation.DateTimeFormat;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import tk.mybatis.mapper.annotation.Version;
//
///**
// * 基础Entity，提供通用属性
// *
// * @Author: Carl.Xiang
// * @Date: 2020/1/3 15:06
// **/
////@MappedSuperclass
//@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"})
//public abstract class BaseEntity implements Serializable {
//
//    /**
//     * 主键id
//     */
////    @Id
//    protected String id;
//
//    /**
//     * 乐观锁版本
//     */
//    @Version
//    protected Long version;
//
//    /**
//     * 创建时间
//     */
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
//    protected Date createdDate;
//
//    /**
//     * 创建者名称
//     */
//    protected String createdBy;
//
//    /**
//     * 更新时间
//     */
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
//    protected Date updatedDate;
//
//    /**
//     * 更新者名称
//     */
//    protected String updatedBy;
//
//    public void preInsert() {
//        if (StringUtils.isBlank(id)) {
//            id = String.valueOf(System.currentTimeMillis());
//        }
//        createdDate = new Date();
//        updatedDate = createdDate;
//        createdBy = "admin";
//        updatedBy = createdBy;
//    }
//
//    public void preUpdate() {
//        createdDate = null;
//        createdBy = null;
//        updatedDate = new Date();
//        updatedBy = "admin";
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public Long getVersion() {
//        return version;
//    }
//
//    public void setVersion(Long version) {
//        this.version = version;
//    }
//
//    public Date getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Date createdDate) {
//        this.createdDate = createdDate;
//    }
//
//    public String getCreatedBy() {
//        return createdBy;
//    }
//
//    public void setCreatedBy(String createdBy) {
//        this.createdBy = createdBy;
//    }
//
//    public Date getUpdatedDate() {
//        return updatedDate;
//    }
//
//    public void setUpdatedDate(Date updatedDate) {
//        this.updatedDate = updatedDate;
//    }
//
//    public String getUpdatedBy() {
//        return updatedBy;
//    }
//
//    public void setUpdatedBy(String updatedBy) {
//        this.updatedBy = updatedBy;
//    }
//
//}
