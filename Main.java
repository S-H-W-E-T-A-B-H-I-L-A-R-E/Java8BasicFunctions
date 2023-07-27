package com.java.demo.Java8Codes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        List<Student> list = new ArrayList<>();
        list.add(new Student("abc", "male"));
        list.add(new Student("qwe", "female"));
        list.add(new Student("abc", "male"));
        list.add(new Student("qwe", "female"));
        list.add(new Student("abc", "male"));
        list.add(new Student("qwe", "female"));
        list.add(new Student("abc", "male"));
        list.add(new Student("qwe", "female"));
        list.add(new Student("abc", "male"));
        list.add(new Student("qwe", "female"));

        List<String> girlsname = list.stream()
                                 .filter(student -> student.getGender().equalsIgnoreCase("female"))
                                 .map(Student:: getName)
                                 .collect(Collectors.toList());

        System.out.println("List of girl students" +girlsname);

    }
}
