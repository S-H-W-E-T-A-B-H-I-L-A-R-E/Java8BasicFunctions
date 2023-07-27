package com.java.demo.Java8Codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperAndLowerCase {
    // How to use map to convert object into Uppercase in Java 8?
    public static void main(String[] args) {

        List<String> namesList = Arrays.asList("Shreya", "Pratik", "Shweta", "Manju", "Ram", "Akshay");
        List<String>  str = namesList.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
        System.out.println("Upper case" +str);
        str = namesList.stream().map(i -> i.toLowerCase()).collect(Collectors.toList());
        System.out.println("Lower case" +str);
    }
}
