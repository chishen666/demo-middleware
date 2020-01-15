package com.carrx.demo.middleware.common.exception;

/**
 * 业务异常
 * 
 * @Author: Carl.Xiang
 * @Date: 2020/1/2 17:06
 **/
public class BusinessException extends RuntimeException {
    /**
     * 异常编码
     */
    private String code;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
