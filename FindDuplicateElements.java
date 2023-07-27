package com.java.demo.Java8Codes;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,89,89,67,57,46,47,46,90,10);
        Set<Integer> duplicateElements = new HashSet<>();
                list.stream()
                        .filter(n -> !duplicateElements.add(n))
                        .forEach(System.out::println);
    }
}
