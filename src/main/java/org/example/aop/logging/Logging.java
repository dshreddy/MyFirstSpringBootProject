package org.example.aop.logging;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {

    @Before("execution(public void org.example.aop.service.UserService.login())")
    public void beforeLogin() {
        System.out.println("This method is executed before login");
    }

    @After("execution(public void org.example.aop.service.UserService.login())")
    public void afterLogin() {
        System.out.println("This method is executed after login");
    }

    @Around("execution(public void org.example.aop.service.UserService.login())")
    public void aroundLogin() {
        System.out.println("This method is executed both before and after login");
    }
}
