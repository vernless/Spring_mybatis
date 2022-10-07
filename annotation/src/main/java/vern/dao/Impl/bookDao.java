package vern.dao.Impl;

import org.springframework.beans.factory.annotation.Value;
import vern.dao.bookDAO;
import org.springframework.stereotype.Repository;

/**
 * @Author 滨
 * @Date 2022/8/17 9:57
 * @Description: TODO
 * @Version 1.0
 */
@Repository
public class bookDao implements bookDAO {
    @Value("${name}")
    private String name;
    @Override
    public void save() {
        System.out.println("bookDao..."+name);
    }
}
