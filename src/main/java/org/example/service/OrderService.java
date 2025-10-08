package org.example.service;

import jakarta.annotation.PostConstruct;

public class OrderService {

    public static OrderService createInstance(UserService userService) {
        System.out.println("OrderService.createInstance: " + userService);
        return null;
    }

    @PostConstruct
    public void init() {

        System.out.println("OrderService Bean Created");
    }
}
