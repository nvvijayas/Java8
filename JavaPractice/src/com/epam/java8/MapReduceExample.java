package com.epam.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MapReduceExample {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("Geeks", "foR",
                "GeEksQuiz", "GeeksforGeeks");

        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        String concatedString = wordList.stream()
                .reduce(String::concat)
                .orElseThrow(() -> new RuntimeException("Input not contains Strings"));

        int sum = numList.stream()
                .reduce(Integer::sum)
                .orElse(-1);

        sum = numList.stream()
                .filter(x -> x % 2 == 0)
                .reduce(Integer::sum)
                .orElseThrow(() -> new RuntimeException("Sum can not be calculated"));

        sum = numList.stream()
                .filter(x -> x % 2 != 0)
                .reduce(Integer::sum)
                .orElseThrow(() -> new RuntimeException("Sum can not be calculated"));

        sum = numList.stream()
                .filter(x -> x % 2 != 0)
                .reduce(Integer::max)
                .orElse(-1);

        int maxSize = wordList.stream()
                .map(x -> x.length())
                .reduce(Integer::max)
                .orElse(-1);

        int minSize = wordList.stream().map(x -> x.length())
                .reduce(Integer::min)
                .orElse(-1);


    }
}
