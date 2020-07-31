package com.epam.java8;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {

        List<String> wordList = Arrays.asList("Geeks", "foR",
                "GeEksQuiz", "GeeksforGeeks");

        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        wordList.stream()
                .filter(string -> string.endsWith("s"))
                .forEach(System.out::println);

        wordList.stream()
                .anyMatch(String::isEmpty);

        long count = wordList.stream().filter(x -> x.contains("Geeks")).count();

        numList.stream()
                .filter(x -> x%2 == 0)
                .forEach(System.out::println);

        numList.stream()
                .filter(x -> x%2 != 0)
                .forEach(System.out::println);

    }
}

