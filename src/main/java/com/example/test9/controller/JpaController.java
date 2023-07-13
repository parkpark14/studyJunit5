package com.example.test9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test9.model.JpaModel;
import com.example.test9.service.JpaService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class JpaController {

    @Autowired
    private JpaService jpaService;

    @GetMapping(value = "/jpaTest")
    public @ResponseBody String jpaTest() {
        return "jpaTest";
    }

    @GetMapping(value = "/mongoFind/{id}")
    public JpaModel mongoFind(
        @PathVariable String id
    ) {
        JpaModel jpaModel = jpaService.getJpaData(id);
        return jpaModel;
    }

    @GetMapping(value = "/mongoInsert/{id}/{name}/{location}/{age}")
    public JpaModel mongoInsert(
        @PathVariable String id,
        @PathVariable String name,
        @PathVariable String location,
        @PathVariable int age
    ) {

        JpaModel jpaModel = new JpaModel(id, name, location, age);

        jpaService.insertJpaTest(jpaModel);
        return jpaModel;
    }
}
