package org.dao.Impl;

import org.dao.bookDAO;

/**
 * @Author 滨
 * @Date 2022/8/17 9:57
 * @Description: TODO
 * @Version 1.0
 */
public class bookDao implements bookDAO {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("bookDao..."+name);
    }
}
