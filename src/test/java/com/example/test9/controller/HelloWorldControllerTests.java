package com.example.test9.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.test9.service.HelloSerivceImpl;

import lombok.extern.slf4j.Slf4j;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.containsString;


// Controller 테스트를 작성해본다.
// 단위 테스트로 작성해본다.
@Slf4j
@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTests {
    
    @Autowired
    MockMvc mockMvc;
    
    @MockBean   // Mock객체 , 즉 가짜 객체를 만들었다.
    HelloSerivceImpl helloSerivce;


    @Test
    @DisplayName("Hello world를 띄운다.")
    void Test1() {
        when(helloSerivce.hello()).thenReturn("hello");

        try {
            this.mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("hello, World")))
                .andDo(print());
        } catch (Exception e) {
            e.printStackTrace();
        }
            
    }

    @Test
    void Test2() {
        log.info("test2");
    }
}
