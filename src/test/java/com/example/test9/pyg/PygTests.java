package com.example.test9.pyg;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import com.example.test9.controller.HelloWorldController;

import lombok.extern.slf4j.Slf4j;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class PygTests {
    
    @Autowired
    private HelloWorldController helloWorldController;

    @Value(value = "${local.server.port}")
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void test1() {
        assertThat(helloWorldController).isNotNull();
    }

    @Test
    void test2() {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/hello", String.class)).contains("Hello, World");
    }

    @Test
    void test3() {

    }
    
}
