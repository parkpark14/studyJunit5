package com.example.test9.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.test9.entity.JpaEntity;

@Repository
public interface JpaRepository 
    extends MongoRepository<JpaEntity, String> {
    JpaEntity findByName(String name);
}
