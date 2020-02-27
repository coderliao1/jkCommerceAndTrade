package com.liao.dao.impl;

import java.util.Map;

import com.liao.dao.SysCodeDao;
import com.liao.model.SysCode;
import org.springframework.stereotype.Repository;


/**
 * @Description:
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014年10月9日
 */
@Repository
public class SysCodeDaoImpl extends BaseDaoImpl<SysCode> implements SysCodeDao {
	public SysCodeDaoImpl() {
		//设置命名空间
		super.setNs("com.liao.mapper.SysCodeMapper");
	}
}
