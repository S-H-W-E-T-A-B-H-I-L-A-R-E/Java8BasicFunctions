package com.java.demo.Java8Codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeAndFilter {
//    Java 8 program to perform cube on list elements and filter numbers greater than 50.
public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,5,6,8,3,4,9,2);
    List<Integer> result = list.stream().map(i -> i*i*i).filter(i -> i>50).collect(Collectors.toList());
    System.out.println(result);
}
}
