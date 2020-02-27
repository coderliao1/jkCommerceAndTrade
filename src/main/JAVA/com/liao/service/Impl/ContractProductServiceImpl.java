package com.liao.service.Impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import com.liao.dao.ContractProductDao;
import com.liao.dao.ExtCproductDao;
import com.liao.model.ContractProduct;
import com.liao.pagination.Page;
import com.liao.service.ContractProductService;
import org.springframework.stereotype.Service;


/**
 * @Description:
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014年10月11日
 */
@Service
public class ContractProductServiceImpl implements ContractProductService {
	@Resource
	ContractProductDao contractProductDao;
	@Resource
	ExtCproductDao extCproductDao;

	public List<ContractProduct> findPage(Page page) {
		return contractProductDao.findPage(page);
	}

	public List<ContractProduct> find(Map paraMap) {
		return contractProductDao.find(paraMap);
	}

	public ContractProduct get(Serializable id) {
		return contractProductDao.get(id);
	}

	public void insert(ContractProduct contractProduct) {
		contractProduct.setId(UUID.randomUUID().toString());
		//自动计算总金额=数量*单价		...修改，删除；同步合同总金额
	/*	if(UtilFuns.isNotEmpty(contractProduct.getCnumber()) && UtilFuns.isNotEmpty(contractProduct.getPrice())){
			contractProduct.setAmount(contractProduct.getCnumber()*contractProduct.getPrice());
		}*/
		
		contractProductDao.insert(contractProduct);
	}

	public void update(ContractProduct contractProduct) {
		contractProductDao.update(contractProduct);
	}

public void deleteById(Serializable id) {
		Serializable[] ids = {id};
		extCproductDao.deleteByContractProductById(ids);		//删除当前这些货物下的所有附件
		contractProductDao.deleteById(id);
	}

	public void delete(Serializable[] ids) {
		extCproductDao.deleteByContractProductById(ids);		//删除当前这些货物下的所有附件
		contractProductDao.delete(ids);
		
	}

}
