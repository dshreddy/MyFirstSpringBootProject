package org.example.beans.bean;

import jakarta.annotation.PostConstruct;

public class UserConfig {
    private String name;
    private String className;

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "UserConfig{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("UserConfig Bean Created: " + this);
    }
}
