package org.example.service;

import jakarta.annotation.PostConstruct;
import org.example.bean.UserConfig;

public class UserService {
    private UserConfig userConfig;

    public UserService(UserConfig userConfig) {
        this.userConfig = userConfig;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "userConfig=" + userConfig +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("UserService Bean Created: " + this);
    }
}
