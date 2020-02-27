package com.liao.Vo;

import java.util.List;


import com.liao.model.ContractProduct;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description:
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014年10月11日
 */

@Setter
@Getter
public class ContractVO {
	private String id;
	
	private List<ContractProduct> contractProducts;		//货物的集合
	
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
