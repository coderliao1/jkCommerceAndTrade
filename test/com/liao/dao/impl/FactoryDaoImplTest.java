package com.liao.dao.impl;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.liao.model.Factory;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class FactoryDaoImplTest {
    public static void main(String[] args){
        //mybatics全局配置文件
        String resource = "mybatics-config.xml";

        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //获取sqlsession工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream) ;

        //获取sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {//1.statement 位置
            //2.sql参数

            Factory factory=new Factory();
            factory.setId("11111");
            sqlSession.insert("com.liao.mapper.FactoryMapper.insert",factory);
            sqlSession.commit();

            System.out.println("user="+factory);

        }catch (Exception e){
            e.printStackTrace();
        }

        finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }

    }

}