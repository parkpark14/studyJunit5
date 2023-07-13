package com.example.test9.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "jpatest")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JpaEntity {
    @Id
    private String id;
    private String name;
    private String location;
    private int age;
}
