package com.goit.module11.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MixStream {
    public static void main(String[] args) {
        Stream<String> first = Stream.of(
                "1",
                "3",
                "5",
                "7",
                "9"
        );
        Stream<String> second = Stream.of(
                "2",
                "4",
                "6",
                "8"
        );
        List<String> collectedStreams = zip(first, second)
                .collect(Collectors.toList());
//        Collections.shuffle(collectedStreams);
        System.out.println(collectedStreams);


    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());
        List<T> resultList = new ArrayList<>();

        long sizeFirst = firstList.size();
        long sizeSecond = secondList.size();
        long minSize = Math.min(sizeFirst, sizeSecond);

        for (int i = 0; i < minSize; i++) {
            resultList.add(firstList.get(i));
            resultList.add(secondList.get(i));
        }
        return resultList.stream();

    }
}
