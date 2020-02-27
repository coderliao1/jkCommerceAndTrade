package com.liao.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class Factory {
    private String id;
    private String fullName;
    private String factoryName;
    private String contacts;
    private String phone;
    private String mobile;
    private String fax;
    private String cnote;
    private String inspector;
    private Integer orderNo;
    private String  createDept;
    private String createBy;
    private Date createTime;
    private String state;
}
