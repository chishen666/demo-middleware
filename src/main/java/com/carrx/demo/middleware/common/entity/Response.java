package com.carrx.demo.middleware.common.entity;

import com.carrx.demo.middleware.common.constant.Constants;

/**
 * 统一接口响应实体类
 * 
 * @Author: Carl.Xiang
 * @Date: 2019/12/31 13:48
 **/
public class Response<T> {

    private String code;

    private String msg;

    private T data;

    public static <T> Response<T> success() {
        Response<T> response = new Response<>();
        response.setCode(Constants.EXCEPTION_CODE_2000);
        return response;
    }

    public static <T> Response<T> success(T t) {
        Response<T> response = new Response<>();
        response.setCode(Constants.EXCEPTION_CODE_2000);
        response.setData(t);
        return response;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
