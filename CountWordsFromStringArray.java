package com.java.demo.Java8Codes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordsFromStringArray {
    //How to count each element/word from the String ArrayList in Java8?
    public static void main(String[] args) {
        List<String> names = Arrays.asList("wasd", "effc", "edwe", "zxczv", "asvv", "mkjtig","effc", "zxczv");
        Map<String, Long> countMap = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countMap);
    }
}
