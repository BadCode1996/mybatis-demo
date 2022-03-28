package com.code.mapper;

import com.code.bean.Item;

/**
 * @author BadCode
 * @date 2022/3/28 13:28
 */
public interface ItemMapper {

    /**
     * query item by id
     * @param id item_id
     * @return item
     */
    Item queryItemById(int id);
}
