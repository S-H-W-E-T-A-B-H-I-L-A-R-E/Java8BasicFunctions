package com.java.demo.Java8Codes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortValues {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 14, 1, 67, 89, 45, 34, 56, 54, 23, 13);
        List<Integer> result = list.stream().sorted().collect(Collectors.toList());
        System.out.println(result);

        //To sort in descending order
        List<Integer> desc = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(desc);
    }
}
