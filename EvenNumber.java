package com.java.demo.Java8Codes;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EvenNumber {
//    public static void main(String[] args) {
        public void evenNumber(){
        List<Integer> nums = Arrays.asList(1,4,6,7,3,5,6,8,9,3,0);
        List<Integer> list = nums.stream().filter(n -> n%2 ==0).collect(Collectors.toList());
        System.out.println("List of Even number" +list);
        Set<Integer> set = nums.stream().filter(n -> n%2 ==0).collect(Collectors.toSet());
        System.out.println("Set of Even number" +set);
    }
}
