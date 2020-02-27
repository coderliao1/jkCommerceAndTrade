package com.liao.dao.impl;

import com.liao.dao.FactoryDao;
import com.liao.model.Factory;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class FactoryDaoImpl extends BaseDaoImpl<Factory> implements FactoryDao {
    public FactoryDaoImpl() {
        //设置命名空间
        super.setNs("com.liao.mapper.FactoryMapper");
    }

    public void updateState(Map map) {
        super.getSqlSession().update(super.getNs()+".updateState", map);
    }
}
