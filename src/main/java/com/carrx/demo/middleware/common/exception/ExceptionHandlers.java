package com.carrx.demo.middleware.common.exception;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.carrx.demo.middleware.common.constant.Constants;
import com.carrx.demo.middleware.common.entity.Response;

/**
 * 异常处理类
 * 
 * @Author: Carl.Xiang
 * @Date: 2020/1/2 17:40
 **/
@ControllerAdvice
public class ExceptionHandlers {

    public ExceptionHandlers() {}

    @ExceptionHandler({BusinessException.class})
    @ResponseBody
    public Response handleBusinessException(BusinessException e) {
        Response response = new Response();
        response.setCode(StringUtils.defaultIfBlank(e.getCode(), Constants.EXCEPTION_CODE_5000));
        response.setMsg(e.getMessage());
        return response;
    }
}
