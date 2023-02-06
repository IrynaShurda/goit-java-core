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
//                    System.out.println(word);
                }
//                System.out.println("map " + map);

                sortResult(map);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void sortResult(Map<String, Integer> map) {
        Map<Integer, String> result = new TreeMap<>(Comparator.reverseOrder());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }

        for (Map.Entry<Integer, String> entry : result.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
