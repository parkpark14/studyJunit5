package com.example.test9.service;

import java.util.List;

import com.example.test9.model.JpaModel;

public interface JpaService {
    JpaModel insertJpaTest(JpaModel jpaModel);
    JpaModel getJpaData(String id);
    JpaModel getJpaDataByName(String name);
    List<JpaModel> getJpaDataAll();
    String JpaTest();
}
