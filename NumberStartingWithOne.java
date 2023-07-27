package com.java.demo.Java8Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOne {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,14,1,67,89,45,34,56,54,23,13);
        List<String> string = list.stream()
                .map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(string);
        //alternative print
        list.stream()
                .map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);
    }
}
