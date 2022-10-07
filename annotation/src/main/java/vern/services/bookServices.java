package vern.services;

import org.springframework.beans.factory.annotation.Autowired;
import vern.dao.Impl.bookDao;
import org.springframework.stereotype.Service;

/**
 * @Author 滨
 * @Date 2022/8/17 11:30
 * @Description: TODO
 * @Version 1.0
 */
@Service
public class bookServices {
    @Autowired
    private vern.dao.Impl.bookDao bookDao;

    public void setBookDao(bookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save(){
        System.out.println("bookServices save...");
        bookDao.save();
    }
}
