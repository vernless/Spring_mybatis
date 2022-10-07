package org.example.aop;

import javafx.beans.binding.ObjectExpression;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

/**
 * @Author 滨
 * @Date 2022/8/18 11:03
 * @Description: TODO
 * @Version 1.0
 */
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(public void org.example.dao.BookDao.up*())")
    private void pt(){}

    /*@Before("pt()")
    public void method(){
        System.out.println("hi");
    }*/

    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("hello");
        Object ret = pjp.proceed();
        System.out.println("see you");
    }


}
