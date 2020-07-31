package com.epam.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class FindFirstFindAny {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("Geeks", "foR",
                "GeEksQuiz", "GeeksforGeeks");
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numList.stream()
                .findAny().orElse(-1);

        numList.stream()
                .findFirst()
                .orElseThrow(() -> new RuntimeException("There is no integer found"));

        numList.parallelStream()

                .findFirst();
        numList.parallelStream()
                .findAny();


    }
}
