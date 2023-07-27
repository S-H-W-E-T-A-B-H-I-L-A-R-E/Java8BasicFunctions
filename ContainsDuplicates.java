package com.java.demo.Java8Codes;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicates {

    public static boolean
    containsDup(int[] arr) {
        //convert the int array into list to perform the stream operations
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        //convert this list to set to get only unique  elements
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        //Now check if both have same size
        if (list.size() == set.size()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 6, 1};
        boolean result = containsDup(arr);
        System.out.println(result);
    }
}
