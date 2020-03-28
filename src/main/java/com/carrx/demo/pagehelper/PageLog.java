package com.carrx.demo.pagehelper;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author Carl.Xiang
 * @date 2020/03/26
 */
public class PageLog {
    private String id;
    private String subject;
    private String desc;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date logTime;

    public PageLog() {
    }

    public PageLog(String id, String subject, String desc, Date logTime) {
        this.id = id;
        this.subject = subject;
        this.desc = desc;
        this.logTime = logTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }
}
