package com.example.test9.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class JpaController {

    @GetMapping(value = "/jpaTest")
    public @ResponseBody String jpaTest() {
        return "jpaTest";
    }

    @GetMapping(value = "/mongoFind")
    public void mongoFind() {


        
    }
}
