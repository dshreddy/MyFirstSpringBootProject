package org.example;

import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.example.bean.UserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}