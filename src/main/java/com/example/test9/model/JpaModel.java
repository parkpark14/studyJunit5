package com.example.test9.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JpaModel {
    private String id;
    private String name;
    private String location;
    private int age;
}
