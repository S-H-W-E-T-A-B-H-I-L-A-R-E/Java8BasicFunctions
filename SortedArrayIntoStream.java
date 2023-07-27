package com.java.demo.Java8Codes;

import java.util.Arrays;

public class SortedArrayIntoStream {
    public static void main(String[] args) {
        int[] arr = {99,76,45,67,23,12,90};
        //sort performs well on small to medium-sized arrays.
//        Arrays.sort(arr);
        //Parallel sorting can lead to better performance
        // when sorting large datasets, especially in multi-core systems.
        Arrays.parallelSort(arr);
        // Converted it into Stream and print
        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
    }
}
