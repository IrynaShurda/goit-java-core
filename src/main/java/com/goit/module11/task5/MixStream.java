package com.goit.module11.task5;

import java.util.ArrayList;
import java.util.Iterator;
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
        System.out.println(collectedStreams);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        List<T> resultList = new ArrayList<>();

        while (firstIterator.hasNext()&& secondIterator.hasNext()){
            resultList.add(firstIterator.next());
            resultList.add(secondIterator.next());
        }
        return resultList.stream();
    }
}
