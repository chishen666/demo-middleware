package com.carrx.demo.pagehelper;

import com.github.pagehelper.Page;

import java.util.List;

/**
 * @author Carl.Xiang
 * @date 2020/03/28
 */
public class PageModel<T> {
    /**
     * 返回数据
     */
    private List<T> content;

    /**
     * 第几页
     */
    private Integer pageSize = 20;


    /**
     * 每页条数
     */
    private Integer pageNum = 1;

    /**
     * 总条数
     */
    private Long total;

    /**
     * 总页数
     */
    private Integer pages;

    public PageModel() {
    }

    public PageModel(Page page) {
        this.content = page.getResult();
        this.pageSize = page.getPageSize();
        this.pageNum = page.getPageNum();
        this.total = page.getTotal();
        this.pages = page.getPages();
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}
