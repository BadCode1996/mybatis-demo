package com.code.mapper;

import com.code.bean.User;

import java.util.List;

/**
 * @author BadCode
 * @date 2022/3/26 1:19
 */
public interface UserMapper {
    /**
     * query user by id
     * @param id id
     * @return user
     */
    User queryById(int id);

    /**
     * query all user
     * @return users
     */
    List<User> findAll();
}
