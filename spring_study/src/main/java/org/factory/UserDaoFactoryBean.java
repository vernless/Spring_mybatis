package org.factory;

import org.dao.Iml.UserDao;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author 滨
 * @Date 2022/8/16 10:01
 * @Description: TODO
 * @Version 1.0
 */
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    @Override
    public UserDao getObject() throws Exception {
        return new UserDao();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}
