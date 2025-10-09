package org.example.aop.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Getter
    @Setter
    @AllArgsConstructor
    public class User {
        private String name;
        private int age;
        private String address;
    }

    private User user;

    public UserService() {
        user = new User("John", 30, "New York");
    }

    public void login() {
        System.out.println("Logging user in");
    }

    public void logout() throws Exception {
        System.out.println("Logging user out");
        throw new Exception("unable to logout user");
    }
}
