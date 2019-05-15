package com.boyang.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //将该类放入到spring 的IOC容器中
public class User {

    @Value("${user.userName}")
    private String userName;
    @Value("${user.password}")
    private int password;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                '}';
    }
}
