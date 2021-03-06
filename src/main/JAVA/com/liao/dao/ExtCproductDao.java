package com.liao.dao;

import java.io.Serializable;


import com.liao.model.ExtCproduct;

/**
 * @Description:
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014年10月9日
 */
public interface ExtCproductDao extends BaseDao<ExtCproduct> {
	public void deleteByContractProductById(Serializable[] ids);
	public void deleteByContractId(Serializable[] contractIds);
}
