package com.goit.module10.task1;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadValidPhoneNumbers {
    public static void main(String[] args) {
        readFile("file.txt");
    }

    private static void readFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            try (InputStream fis = new FileInputStream(file);
                 Scanner scanner = new Scanner(fis)) {
                while (scanner.hasNext()) {
                    String phoneNumber = scanner.nextLine();
                    if (validatePhone(phoneNumber)) {
                        System.out.println(phoneNumber);
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static boolean validatePhone(String phoneNumber) {
        Pattern pattern = Pattern.compile("^\\(?\\d{3}\\)?[\\s-]\\d{3}-\\d{4}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
