package com.example.test9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test9.service.HelloService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloWorldController {

    @Autowired
    private HelloService helloSerivce;
    
    @RequestMapping(method=RequestMethod.GET , value = "/hello")
    public @ResponseBody String hello() {
        log.info("HelloWorldController.hello()");
        String hello = helloSerivce.hello();
        return hello + ", World";
    }
}
