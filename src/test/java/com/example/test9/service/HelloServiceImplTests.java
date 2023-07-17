package com.example.test9.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

// service 테스트를 작성해본다.
@ExtendWith(SpringExtension.class)
@Import(HelloSerivceImpl.class) // 테스트 하고자하는 구현된 서비스 클래스를 import에 넣어준다.
// jacoco
public class HelloServiceImplTests {
    
}
