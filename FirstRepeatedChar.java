package com.java.demo.Java8Codes;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedChar {
    public static void main(String[] args) {
        String str = "Java is fabulous";
        Character ch = str.chars()
                        .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() >1L)
                        .map(entry -> entry.getKey())
                        .findFirst()
                        .get();
        System.out.println(ch);

    }
}
