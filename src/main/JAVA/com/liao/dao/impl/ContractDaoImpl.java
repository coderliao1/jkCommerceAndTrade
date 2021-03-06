package com.liao.dao.impl;

import java.util.Map;

import com.liao.Vo.ContractVO;
import com.liao.dao.ContractDao;
import com.liao.model.Contract;
import org.springframework.stereotype.Repository;



/**
 * @Description:
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014年10月9日
 */
@Repository
public class ContractDaoImpl extends BaseDaoImpl<Contract> implements ContractDao {
	public ContractDaoImpl() {
		//设置命名空间
		super.setNs("com.liao.mapper.ContractMapper");
	}

	public void updateState(Map map) {
		super.getSqlSession().update(super.getNs()+".updateState", map);
	}

	public ContractVO view(String contractId) {
		return super.getSqlSession().selectOne(super.getNs()+".view", contractId);
	}
}
