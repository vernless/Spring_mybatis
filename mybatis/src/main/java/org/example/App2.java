package org.example;

import org.example.config.Springconfig;
import org.example.domain.Account;
import org.example.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author 滨
 * @Date 2022/8/17 22:33
 * @Description: TODO
 * @Version 1.0
 */
public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Springconfig.class);
        AccountService bean = ctx.getBean(AccountService.class);
        Account as = bean.findById(1);
        System.out.println(as);
    }
}
