package org.example;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.dao.AccountDao;
import org.example.domain.Account;

import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException {
        //1. 创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //2. 加载mybatis.xml配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
        //3. 创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        //4. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //5. 执行SqlSession对象的查询方法，获取结果
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        Account a = accountDao.findById(1);
        System.out.println(a);
        //6. 释放资源
        sqlSession.close();
    }
}
