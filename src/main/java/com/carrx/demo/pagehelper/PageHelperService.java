package com.carrx.demo.pagehelper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author Carl.Xiang
 * @date 2020/03/26
 */
@Service
public class PageHelperService {

    @Resource
    private PageHelperMapper pageHelperMapper;

    public void init() {
        for (int i = 0; i < 1000; i++) {
            String ii = i + "";
            PageLog pageLog = new PageLog(ii, "subject" + ii, ii + "desc", new Date());
            pageHelperMapper.insert(pageLog);

        }
    }

    public Page listPageLogsByPage(PageLog pageLog, PageModel pageModel) {
        Page page = PageHelper.startPage(pageModel.getPageNum(), pageModel.getPageSize(), "log_time desc");
        pageHelperMapper.listPageLogs(pageLog);
        return page;
    }


}
