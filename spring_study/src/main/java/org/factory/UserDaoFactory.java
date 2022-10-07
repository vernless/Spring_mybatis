package org.factory;

import org.dao.Iml.UserDao;

/**
 * @Author 滨
 * @Date 2022/8/16 9:55
 * @Description: TODO
 * @Version 1.0
 */
public class UserDaoFactory {
    public  UserDao getUserdao(){
        return new UserDao();
    }
}
