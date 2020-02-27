package com.liao.dao.impl;

import java.io.Serializable;

import com.liao.dao.ExtCproductDao;
import com.liao.model.ExtCproduct;
import org.springframework.stereotype.Repository;



/**
 * @Description:
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014年10月9日
 */
@Repository
public class ExtCproductDaoImpl extends BaseDaoImpl<ExtCproduct> implements ExtCproductDao {
	public ExtCproductDaoImpl() {
		//设置命名空间
		super.setNs("com.liao.mapper.ExtCproductMapper");
	}

	public void deleteByContractProductById(Serializable[] ids) {
		super.getSqlSession().delete(super.getNs()+".deleteByContractProductById", ids);
	}
	
	public void deleteByContractId(Serializable[] contractIds){
		super.getSqlSession().delete(super.getNs()+".deleteByContractId", contractIds);
	}
}
