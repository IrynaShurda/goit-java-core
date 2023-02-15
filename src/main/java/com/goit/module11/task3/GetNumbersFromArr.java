package com.goit.module11.task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetNumbersFromArr {
    public static void main(String[] args) {
        List<String> arrNumbers = List.of("1, 2, 0", "4, 5");
        System.out.println(sortNumbers(arrNumbers));
    }

    private static String sortNumbers(List<String> arrNumbers) {
        return arrNumbers.stream()
                .map(numbers -> numbers.split(", "))
                .flatMap(Arrays::stream)
                .map(Integer::valueOf)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}
