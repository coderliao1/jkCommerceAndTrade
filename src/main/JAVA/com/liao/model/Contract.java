package com.liao.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Contract {
    private String id;

    private String cpnum;
    private String extnum;

    private String offeror;
    private String contractNo;
    private java.util.Date signingDate;
    private String inputBy;
    private String checkBy;
    private String inspector;
    private Double totalAmount;
    private Integer importNum;
    private String crequest;
    private String customName;
    private java.util.Date deliveryPeriod;
    private java.util.Date shipTime;
    private String tradeTerms;
    private String remark;
    private String printStyle;
    private Integer oldState;
    private Integer state;
    private Integer outState;

    private String createBy;
    private String createDept;
    private java.util.Date createTime;
}
