package com.liao.Vo;


import com.liao.model.ContractProduct;
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
public class ExtCproductVO {
	private String id;
	
	private ContractProduct contractProduct;
	private Factory factory;
	
	private String ctype;
	private String productNo;
	private String productImage;
	private String productDesc;
	private Integer cnumber;
	private String packingUnit;			//包装单位
	private Double price;
	private Double amount;
	private String productRequest;
	private Integer orderNo;


}
