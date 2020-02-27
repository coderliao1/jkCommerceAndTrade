package com.liao.dao;

import com.liao.model.Factory;

import java.util.Map;

public interface FactoryDao extends BaseDao<Factory>{
    public void updateState(Map map);         //修改状态
}
