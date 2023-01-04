package com.goit.module7;

public class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but  @ there"));
    }
}

class EmailDetector {
    public boolean isPresent(String text) {
        int atNumber = text.indexOf('@');
        if (atNumber<2){
            return false;
        }
        return text.charAt(atNumber - 2) != ' ' &&
                text.charAt(atNumber - 1) != ' ' &&
                text.charAt(atNumber + 1) != ' ' &&
                text.charAt(atNumber + 2) != ' ';
    }
}
