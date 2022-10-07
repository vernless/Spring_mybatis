package vern;

import vern.config.springConfig;
import vern.services.bookServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author 滨
 * @Date 2022/8/17 11:05
 * @Description: TODO
 * @Version 1.0
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext a = new AnnotationConfigApplicationContext(springConfig.class);
        bookServices bookServices = a.getBean(vern.services.bookServices.class);
        bookServices.save();
    }
}
