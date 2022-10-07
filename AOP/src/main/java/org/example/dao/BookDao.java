package org.example.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author 滨
 * @Date 2022/8/18 10:56
 * @Description: TODO
 * @Version 1.0
 */
@Repository("BookDao")
public class BookDao {
    public void save(){
        System.out.println(System.currentTimeMillis());
        System.out.println("BookDao Save...");
    }

    public void update(){
        System.out.println("BookDao update...");

    }
}
