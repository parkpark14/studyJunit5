package com.example.test9.service;

import org.springframework.stereotype.Service;

@Service
public class HelloSerivceImpl implements HelloService{

    @Override
    public String hello() {
        return "Hello, World";
    }
    
}
