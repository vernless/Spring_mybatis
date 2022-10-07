package org.example;

import org.dao.Impl.bookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext a = new ClassPathXmlApplicationContext("applicationContext.xml");
        bookDao bookDao = (bookDao) a.getBean("bookDao");
        bookDao.save();
    }
}
