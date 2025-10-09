package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml") // To create beans
@EnableAspectJAutoProxy // To use AspectJ
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}