package org.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 滨
 * @Date 2022/8/16 9:30
 * @Description: TODO
 * @Version 1.0
 */
public class UserDaoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService) context.getBean("UserService");
        userService.save();
        //atx.close();
/*        UserDao userDao = UserDaoFactory.getUserdao();
        userDao.save();*/
/*        UserDaoFactory userDaoFactory = new UserDaoFactory();
        UserDao userDao = userDaoFactory.getUserdao();
        userDao.save();*/
    }
}
