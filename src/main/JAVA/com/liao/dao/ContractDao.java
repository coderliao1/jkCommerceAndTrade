package com.liao.dao;

import java.util.Map;


import com.liao.Vo.ContractVO;
import com.liao.model.Contract;

/**
 * @Description:
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014年10月9日
 */
public interface ContractDao extends BaseDao<Contract> {
	public void updateState(Map map);			//修改状态
	public ContractVO view(String contractId);	//查询某个合同
}
