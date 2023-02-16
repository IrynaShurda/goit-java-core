package com.goit.module11.task4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class RandomNumbers {
    public static void main(String[] args) {
        List<Long> randomCollect = randomGenerator(25214903917L, 11L, (long) Math.pow(2, 48))
                .collect(Collectors.toList());
        System.out.println(randomCollect);
    }

    private static Stream<Long> randomGenerator(long a, long c, long m) {
        return LongStream.iterate(0, x -> (a * x + c) % m)
                .limit(10)
                .boxed();
    }
}
