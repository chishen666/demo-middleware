package com.carrx.demo.pagehelper;

import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Carl.Xiang
 * @date 2020/03/26
 */
@RequestMapping("/pagehelper")
@RestController
public class PageHelperController {
    @Autowired
    private PageHelperService pageHelperService;

    @GetMapping(value = "/init")
    public void init() {
        pageHelperService.init();
    }

    @GetMapping(value = "/list")
    public Object list(PageLog pageLog, PageModel pageModel) {
        Page page = pageHelperService.listPageLogsByPage(pageLog, pageModel);
        return new PageModel<>(page);
    }

}
