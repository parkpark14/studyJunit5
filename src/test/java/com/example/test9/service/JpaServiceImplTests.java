package com.example.test9.service;

import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
// import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.test9.entity.JpaEntity;
import com.example.test9.repository.JpaRepository;

import lombok.extern.slf4j.Slf4j;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
// @ExtendWith(SpringExtension.class)   이건 왜 안될까???
@Import(JpaServiceImpl.class)
@SpringBootTest(classes = JpaServiceImpl.class)
public class JpaServiceImplTests {

    @Autowired
    JpaServiceImpl jpaService;

    @MockBean
    JpaRepository jpaRepository;

    @Test
    @DisplayName("JpaService Test1")
    void Test1() {

        log.info("JpaServiceImplTests.Test1");

        JpaEntity findUser = new JpaEntity("pyg", "younggyun", "ansan", 40);
        when(jpaRepository.findById("pyg"))
            .thenReturn(Optional.ofNullable(findUser));

        log.info(jpaRepository.findById("pyg").get().getName());
        log.info("=============================================");
        log.info(findUser.getName());

        assertThat(findUser.toString()).isEqualTo(jpaRepository.findById("pyg").get().toString());

    }
    
}
