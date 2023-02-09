package com.goit.module10.task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.*;

public class Converter {

    public static void main(String[] args) {
        String json = readFile("file2.txt");
        writeFile("user.json", json);
        System.out.println(json);

//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//         Human iryna = new Human("Iryna", 32); //обєкт
//         Human andrii = new Human("Andrii", 33);
//         List<Human> names = new ArrayList<Human>(); //колекція
//         names.add(iryna); //додати обєкт в колекцію
//         names.add(andrii);
////         System.out.println(iryna);
//         System.out.println(names); // вивести колекцію
//        String json = gson.toJson(names); //
//        String json1 = gson.toJson(iryna); //
//        System.out.println(json);
//        System.out.println(json1);
    }

    private static String readFile(String fileName) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        File file = new File(fileName);
        List<Human> names = new ArrayList<>();
        int counter = 0;
        if (file.exists()) {
            try (InputStream fis = new FileInputStream(file);
                 Scanner scanner = new Scanner(fis)) {
                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    if (counter > 0) {
                        String[] strings = line.split(" ");
                        Human human = new Human(strings[0], Integer.valueOf(strings[1]));
                        names.add(human);
                    }
                    counter++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return gson.toJson(names);
    }

    public static void writeFile(String fileJson, String json) {
        File file = new File(fileJson);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(json);
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static class Human {
        private final String name;
        private final int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
