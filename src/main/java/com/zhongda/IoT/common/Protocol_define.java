package com.zhongda.IoT.common;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Protocol {
    private Long   id;
    private String name;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date   createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
}
