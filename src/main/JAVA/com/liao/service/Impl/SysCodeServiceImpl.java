package com.liao.service.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.liao.dao.SysCodeDao;
import com.liao.model.SysCode;
import com.liao.service.SysCodeService;
import org.springframework.stereotype.Service;



/**
 * @Description:
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014年10月13日
 */
@Service
public class SysCodeServiceImpl implements SysCodeService {
	@Resource
	SysCodeDao sysCodeDao;

	public List<SysCode> find(Map paraMap) {
		return sysCodeDao.find(paraMap);
	}

}
