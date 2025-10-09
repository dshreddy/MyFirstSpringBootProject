package org.example.aop.controller;

import org.example.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String userLogin() {
        userService.login();
        return "User login endpoint called successfully";
    }
}
