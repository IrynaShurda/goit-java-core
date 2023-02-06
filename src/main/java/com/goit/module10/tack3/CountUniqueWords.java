package com.goit.module10.tack3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class CountUniqueWords {
    public static void main(String[] args) {
        readFile("words.txt");
    }

    private static void readFile(String fileName) {
        Map<String, Integer> map = new HashMap<>();
        File file = new File(fileName);
        if (file.exists()) {
            try (InputStream fis = new FileInputStream(file);
                 Scanner scanner = new Scanner(fis)) {
                while (scanner.hasNext()) {
                    String word = scanner.next();
                    if (map.containsKey(word)) {
                        int value = map.get(word);
                        value++;
                        map.put(word, value);
                    } else {
                        map.put(word, 1);
                    }
                }
                sortResult(map);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    private static void sortResult(Map<String, Integer> map) {
        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                Integer value1 = map.get(o1);
                Integer value2 = map.get(o2);
                return value1.compareTo(value2) > 0 ? 1 : -1;
            }
        };
        Map<String, Integer> result = new TreeMap<>(comparator.reversed());
        result.putAll(map);
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
