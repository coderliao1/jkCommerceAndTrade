package com.liao.dao.impl;

import java.io.Serializable;

import com.liao.dao.ContractProductDao;
import com.liao.model.ContractProduct;
import org.springframework.stereotype.Repository;


/**
 * @Description:
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014年10月9日
 */
@Repository
public class ContractProductDaoImpl extends BaseDaoImpl<ContractProduct> implements ContractProductDao {
	public ContractProductDaoImpl() {
		//设置命名空间
		super.setNs("com.liao.mapper.ContractProductMapper");
	}

	public void deleteByContractProductById(Serializable[] ids) {
		super.getSqlSession().delete(super.getNs()+".deleteByContractProductById", ids);
	}
	
	public void deleteByContractId(Serializable[] ids){
		super.getSqlSession().delete(super.getNs()+".deleteByContractId", ids);
	}

}
