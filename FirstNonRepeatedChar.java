package com.java.demo.Java8Codes;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {

        String input  = "Java is awesome";

        Character result  =
                 input.chars()
                .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);
    }
}
 /*input.chars(): The input is assumed to be a String. The chars() method is used to obtain an IntStream of characters' ASCII values from the input string.
.mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i))): For each character's ASCII value in the IntStream, it maps it to a lowercase Character object using Character.valueOf((char) i), and then converts it to lowercase using Character.toLowerCase() method.
.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())): This part collects the mapped characters into a LinkedHashMap<Character, Long>. It groups the characters by their occurrences using Collectors.groupingBy() with Function.identity() as the classifier (i.e., grouping by the character itself), and then it counts the occurrences using Collectors.counting().
.entrySet(): The result of the previous operation is a set of key-value pairs (characters and their counts). entrySet() converts this set to a Set<Map.Entry<Character, Long>>.
.stream(): It converts the set to a Stream of Map.Entry instances.
.filter(entry -> entry.getValue() == 1L): It filters the entries of the Stream to keep only those with a count of 1L, i.e., the characters that occur only once.
.map(entry -> entry.getKey()): It maps each Map.Entry to the character (the key) in the entry.
.findFirst().get(): It finds the first element in the Stream (which will be the character that occurs only once) and gets it using get() method to assign it to the result variable of type Character.
                 */