package com.liao.Vo;

import java.util.List;


import com.liao.model.Contract;
import com.liao.model.ExtCproduct;
import com.liao.model.Factory;
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
public class ContractProductVO {
	private String id;
	
	private Contract contract;		//将复杂的关联关系变成单表操作
	private List<ExtCproduct> extCproducts;		//和附件一对多
	private Factory factory;		//和生产厂家多对一
	
	private String productNo;
	private String productImage;
	private String productDesc;
	private Integer cnumber;
	private Integer outNumber;
	private String loadingRate;			//装率
	private Integer boxNum;				//箱数
	private String packingUnit;			//包装单位
	private Double price;
	private Double amount;
	private Integer finished;
	private String exts;
	private Integer orderNo;

	
}
