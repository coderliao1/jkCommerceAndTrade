package com.liao.dao.impl;

import com.liao.model.ExtCproduct;
import com.liao.model.Factory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class ExtCproductDaoImplTest {
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


            ExtCproduct extCproduct=sqlSession.selectOne("com.liao.mapper.ExtCproductMapper.find",1);


            System.out.println("user="+extCproduct);

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