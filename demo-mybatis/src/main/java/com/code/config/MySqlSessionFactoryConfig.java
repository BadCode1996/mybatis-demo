package com.code.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author BadCode
 * @date 2022/3/26 1:40
 */
public class MySqlSessionFactoryConfig {

    private static SqlSessionFactory factory;

    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            factory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        return factory.openSession();
    }


}
