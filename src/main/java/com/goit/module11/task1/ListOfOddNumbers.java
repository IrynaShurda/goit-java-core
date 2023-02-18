package com.goit.module11.task1;

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
        final int[] counter = {0};
        return names.stream()
                .peek(c -> counter[0]++)
                .filter(i -> counter[0] % 2 != 0)
                .map(in -> counter[0] + ". " + names.get(counter[0]))
                .collect(Collectors.joining(", "));
    }
}
