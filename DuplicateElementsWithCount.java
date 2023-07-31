package com.java.demo.Java8Codes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsWithCount {
//   19: How to find only duplicate elements with its count from the String ArrayList in Java8?
public static void main(String[] args) {
    List<String> list = Arrays.asList("AA", "BB", "BB", "CC", "DD");
    Map<String, Long> map = list.stream()
            .filter(x -> Collections.frequency(list, x)>1)
            .collect(Collectors.groupingBy
                    (Function.identity(),Collectors.counting()));
    System.out.println(map);
}
}
