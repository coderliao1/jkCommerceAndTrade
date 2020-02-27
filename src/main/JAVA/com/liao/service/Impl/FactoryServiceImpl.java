package com.liao.service.Impl;

import com.liao.dao.FactoryDao;
import com.liao.model.Factory;
import com.liao.pagination.Page;
import com.liao.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
@Service
public class FactoryServiceImpl implements FactoryService {
    @Resource
    FactoryDao factoryDao;
    @Override
    public List<Factory> findPage(Page page) {
        return null;
    }

    @Override
    public List<Factory> find(Map paraMap) {
        return factoryDao.find(paraMap);
    }

    @Override
    public Factory get(Serializable id) {
        return factoryDao.get(id);
    }

    @Override
    public void insert(Factory factory) {
        factory.setId(UUID.randomUUID().toString());   //设置UUID
        factory.setState("1");                         //默认启用
        factoryDao.insert(factory);

    }

    @Override
    public void update(Factory factory) {
        factoryDao.update(factory);

    }

    @Override
    public void deleteById(Serializable id) {
        factoryDao.deleteById(id);

    }

    @Override
    public void delete(Serializable[] ids) {
        factoryDao.delete(ids);
    }

    @Override
    public void start(Serializable[] ids) {
        Map map = new HashMap();
        map.put("state",1);
        map.put("ids",ids);
        factoryDao.updateState(map);

    }

    @Override
    public void stop(Serializable[] ids) {
        Map map = new HashMap();
        map.put("state",0);
        map.put("ids",ids);
        factoryDao.updateState(map);


    }

    @Override
    public List<Factory> getFactoryList() {
        Map<String,Object> paraMap = new HashMap<String,Object>();
        paraMap.put("state", 1);			//1启用，代表只查询启用的生产厂家

        return factoryDao.find(paraMap);
    }
}
