package com.carrx.demo1;

import java.util.List;

import com.carrx.demo.pagehelper.PageLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Carl.Xiang
 * @date 2020/03/26
 */
//@Mapper
public interface PageHelperMapper extends tk.mybatis.mapper.common.Mapper<PageLog> {
//public interface PageHelperMapper  {

//    @Insert("insert into page_log values(#{id}, #{subject}, #{desc}, #{logTime})")
    void insert1(PageLog pageLog);

    List<PageLog> listPageLogs(PageLog pageLog);
}
