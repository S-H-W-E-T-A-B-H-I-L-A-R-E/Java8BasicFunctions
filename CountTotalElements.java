package com.java.demo.Java8Codes;

import java.util.Arrays;
import java.util.List;

public class CountTotalElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,14,1,67,89,45,34,56,54,23,13);
        long count = list.stream().count();
        System.out.println(count);
    }
}
