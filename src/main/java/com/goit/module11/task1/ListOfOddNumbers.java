package com.goit.module11.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfOddNumbers {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Ivan",
                "Andrii",
                "Olha",
                "Maria",
                "Max",
                "Diana"
        );
        System.out.println(validateLine(names));
    }

    private static String validateLine(List<String> names) {
        List<String> indexWithWord = new ArrayList<>();
        final int[] counter = {1};
        names
                .forEach(name -> {
                    String indexWord = counter[0] + ". " + name;
                    if (counter[0] % 2 != 0) {
                        indexWithWord.add(indexWord);
                    }
                    counter[0]++;
                });
        return indexWithWord
                .stream()
                .collect(Collectors.joining(", "));
    }
}
