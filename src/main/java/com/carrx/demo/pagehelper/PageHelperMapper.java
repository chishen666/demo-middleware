package com.carrx.demo.pagehelper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Carl.Xiang
 * @date 2020/03/26
 */
@Mapper
public interface PageHelperMapper {

    @Insert("insert into page_log values(#{id}, #{subject}, #{desc}, #{logTime})")
    void insert(PageLog pageLog);

    List<PageLog> listPageLogs(PageLog pageLog);
}
