package com.code.mapper;

import com.code.bean.User;

import java.util.List;

/**
 * @author BadCode
 * @date 2022/3/27 1:56
 */
public interface UserMapper {

    /**
     * query user by id
     * @param id id
     * @return user
     */
    User queryById(int id);

    /**
     * find all users
     * @return users
     */
    List<User> findAll();
}
