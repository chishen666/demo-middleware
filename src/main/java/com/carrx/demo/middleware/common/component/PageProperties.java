package com.carrx.demo.middleware.common.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 分页查询默认配置
 * 
 * @Author: Carl.Xiang
 * @Date: 2020/1/3 15:20
 **/
@Component
@ConfigurationProperties(prefix = "demo.page", ignoreInvalidFields = true)
public class PageProperties {
    private static final int MAX_PAGE_SIZE = 2000;
    private static final int DEFAULT_PAGE_NUM = 1;
    private static final int DEFAULT_PAGE_SIZE = 20;
    private static final String DEFAULT_PAGE_SORT = "updatedDate desc";
    private int maxPageSize = MAX_PAGE_SIZE;
    private int pageSize = DEFAULT_PAGE_SIZE;

    public int getMaxPageSize() {
        return maxPageSize;
    }

    public void setMaxPageSize(int maxPageSize) {
        this.maxPageSize = maxPageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getDefaultPageNum() {
        return DEFAULT_PAGE_NUM;
    }

    public int getDefaultPageSize() {
        return pageSize;
    }

    public String getDefaultPageSort() {
        return DEFAULT_PAGE_SORT;
    }
}
