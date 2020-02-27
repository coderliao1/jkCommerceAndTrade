package com.liao.service.Impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import com.liao.dao.ExtCproductDao;
import com.liao.dao.SysCodeDao;
import com.liao.model.ExtCproduct;
import com.liao.model.SysCode;
import com.liao.pagination.Page;
import com.liao.service.ExtCproductService;

import org.springframework.stereotype.Service;



/**
 * @Description:
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014年10月11日
 */
@Service
public class ExtCproductServiceImpl implements ExtCproductService {
	@Resource
	ExtCproductDao extCproductDao;
	@Resource
	SysCodeDao sysCodeDao;

	public List<ExtCproduct> findPage(Page page) {
		return extCproductDao.findPage(page);
	}

	public List<ExtCproduct> find(Map paraMap) {
		return extCproductDao.find(paraMap);
	}

	public ExtCproduct get(Serializable id) {
		return extCproductDao.get(id);
	}

	public void insert(ExtCproduct extCproduct) {
		extCproduct.setId(UUID.randomUUID().toString());
		//自动计算总金额=数量*单价		...修改，删除；同步合同总金额
		/*if(UtilFuns.isNotEmpty(extCproduct.getCnumber()) && UtilFuns.isNotEmpty(extCproduct.getPrice())){
			extCproduct.setAmount(extCproduct.getCnumber()*extCproduct.getPrice());
		}
		*/
		extCproductDao.insert(extCproduct);
	}

	public void update(ExtCproduct extCproduct) {
		extCproductDao.update(extCproduct);
	}

	public void deleteById(Serializable id) {
		extCproductDao.deleteById(id);
	}

	public void delete(Serializable[] ids) {
		extCproductDao.delete(ids);
	}

	public List<SysCode> getCtypeList() {
		Map paraMap = new HashMap();
		paraMap.put("parentId", "0104");			//sys_code_b 0104附件分类
		return sysCodeDao.find(paraMap);
	}

}
