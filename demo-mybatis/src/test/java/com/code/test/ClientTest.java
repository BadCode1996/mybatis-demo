package com.code.test;

import com.code.bean.User;
import com.code.config.MySqlSessionFactoryConfig;
import com.code.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author BadCode
 * @date 2022/3/26 1:34
 */
public class ClientTest {

    private static final SqlSession session = MySqlSessionFactoryConfig.getSqlSession();

    @Test
    public void test1() {
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.queryById(1);
        System.out.println("user = " + user);
    }

    @Test
    public void test2() {
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.findAll().forEach(System.out::println);
    }
}
