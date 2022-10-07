package org.test;

/**
 * @Author 滨
 * @Date 2022/8/15 17:27
 * @Description: TODO
 * @Version 1.0
 */
import org.dao.UserDAO;

public class UserService {
    private UserDAO userDAO ;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void save(){
        System.out.println("save userservice dao");
        userDAO.save();
    }

}
