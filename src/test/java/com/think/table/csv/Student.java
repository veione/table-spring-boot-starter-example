package com.think.table.csv;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Student {

    private long no;

    private String name;

    private int age;

    // List无法进行转换
    private List<String> hobby;
    //private String[] hobby;

    private Map<Integer, Integer> prob;

    public Student(long no, String name, int age, List<String> hobby, Map<Integer, Integer> prob) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.prob = prob;
    }
}
