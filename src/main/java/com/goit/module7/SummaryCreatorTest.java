package com.goit.module7;

public class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
//        String longPhrase = "Java is very popular language";
        String longPhrase = "kamugayrraduvune";

        System.out.println(summaryCreator.create(longPhrase));
    }
}
class SummaryCreator {
    public String create(String text) {
        String newText = text;
        if (text.length() >= 16) {
            if (text.charAt(15) != ' ') {
                newText = text.substring(0, 15) + "...";
            } else {
                newText = text.substring(0, 15);
            }
        }
        return newText;
    }
}

