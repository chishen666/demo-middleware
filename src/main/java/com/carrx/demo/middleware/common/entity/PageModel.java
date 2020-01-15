package com.carrx.demo.middleware.common.entity;

import java.util.List;

import com.github.pagehelper.Page;

/**
 * 分页查询响应实体
 *
 * @Author: Carl.Xiang
 * @Date: 2020/1/3 15:20
 **/
public class PageModel<T> {
    private List<T> content;
    private int pageNum = 1;
    private int pageSize = 20;
    private long totals;
    private int pages;
    private String sort;

    public PageModel() {}

    public PageModel(Page<T> page) {
        this.content = page.getResult();
        this.pageNum = page.getPageNum();
        this.pageSize = page.getPageSize();
        this.totals = page.getTotal();
        this.pages = page.getPages();
        this.sort = page.getOrderBy();
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotals() {
        return totals;
    }

    public void setTotals(long totals) {
        this.totals = totals;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
