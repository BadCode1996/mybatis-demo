package com.test.mapper;

import com.code.bean.Item;
import com.code.bean.User;
import com.code.mapper.ItemMapper;
import com.code.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author BadCode
 * @date 2022/3/27 2:18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext*.xml")
public class ClientTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ItemMapper itemMapper;

    @Test
    public void test1(){
        User user = userMapper.queryById(1);
        System.out.println("user = " + user);
    }

    @Test
    public void test2(){
        Item item = itemMapper.queryItemById(1);
        System.out.println("item = " + item);
    }
}
