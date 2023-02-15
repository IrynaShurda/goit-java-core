package com.goit.module11.task2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseSortDesc {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Ivan",
                "Andrii",
                "Olha",
                "Maria",
                "Max",
                "Diana"
        );
        System.out.println(getUpperCaseSortDesc(names));
    }

    private static List<String> getUpperCaseSortDesc(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
