package com.epam.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorExample {

    public static void main(String[] args) {

        List<String> wordList = Arrays.asList("Geeks", "foR",
                "GeEksQuiz", "GeeksforGeeks");

        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Set<String> wordsSet = wordList.stream().collect(Collectors.toSet());

        Map wordMap = wordList.stream().
                collect(Collectors.toMap(x -> x, x -> x.length()));

        Map numMap = numList.stream().collect(Collectors.toMap(x -> x, x -> x % 2 == 0));

        System.out.println(wordList.stream().collect(Collectors.groupingBy(String::length)));

        System.out.println(wordList.stream()
                                    .collect(Collectors.groupingBy(String::length, Collectors.mapping(x -> x.charAt(2),Collectors.toList()))));


        wordsSet = wordList.stream()
                .filter(x -> x.contains("Geeks"))
                .distinct()
                .collect(Collectors.toSet());


    }
}
