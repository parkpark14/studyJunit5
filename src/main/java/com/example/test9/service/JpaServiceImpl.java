package com.example.test9.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test9.entity.JpaEntity;
import com.example.test9.model.JpaModel;
import com.example.test9.repository.JpaRepository;

@Service
public class JpaServiceImpl implements JpaService {

    @Autowired
    private JpaRepository jpaRepository;

    @Override
    public JpaModel insertJpaTest(JpaModel jpaModel) {
        JpaEntity jpaEntity = new JpaEntity(jpaModel.getId(), jpaModel.getName(), jpaModel.getLocation(), jpaModel.getAge());
        jpaRepository.save(jpaEntity);
        return jpaModel;
    }

    @Override
    public JpaModel getJpaData(String id) {
        JpaEntity jpaEntity = jpaRepository.findById(id).orElse(null);
        return new JpaModel(jpaEntity.getId(), jpaEntity.getName(), jpaEntity.getLocation(), jpaEntity.getAge());
    }

    @Override
    public JpaModel getJpaDataByName(String name) {
        JpaEntity jpaEntity = jpaRepository.findByName(name);

        if(jpaEntity.getId().equals(null))
            return null;
        else
            return new JpaModel(jpaEntity.getId(), jpaEntity.getName(), jpaEntity.getLocation(), jpaEntity.getAge());
    }

    @Override
    public List<JpaModel> getJpaDataAll() {
        
        List<JpaEntity> jpaEntityAll = jpaRepository.findAll();

        List<JpaModel> jpaModelAll = new ArrayList<JpaModel>();
        while(jpaEntityAll.iterator().hasNext()) {
            JpaEntity imsi = jpaEntityAll.iterator().next();
            jpaModelAll.add(new JpaModel(imsi.getId(), imsi.getName(), imsi.getLocation(), imsi.getAge()));
        }
        
        return jpaModelAll;
    }
    
}
