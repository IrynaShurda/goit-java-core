package com.goit.module4;

import java.util.Arrays;

public class ArlanHelper {
    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();

        //Завдання 10
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(2));


        //Завдання 11
        //Should be:
        //XX
        //XX
        //XX
        System.out.println(helper.drawRect(2, 3, 'X'));

        //Завдання 12
        //Should be:
        //*#*#*
        System.out.println(helper.drawLine(5));

        //Завдання 13
        //Should be:
        //JavaJavaJavaJava
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));

    }

    public String drawQuad(int n) {
        int i = 0;
        int j = 0;
        while (i < n) {
            while (j < n) {
                //result +="*";
                System.out.print("*");
                j++;
            }
            i++;
            j = 0;
            //result+="\n";
            System.out.println();
        }
//        for (String[] strings : quad) {
//            System.out.println( Arrays.toString(strings));
//        }
        return "";
    }

    public String drawRect(int width, int height, char c) {
        String resultC = "";
        int i = 0;
        int j = 0;
        while (i < height) {
            while (j < width) {
                resultC += c;
                j++;
            }
            resultC += "\n";
            i++;
            j = 0;
        }
        return resultC;
    }
    public String drawLine(int length){
        String resultLine="";
        int line = 0;
        while (line<length ){
            resultLine +="*";
            line++;
            while (line<length ){
                resultLine +="#";
                line++;
                break;
            }
            resultLine +="";
        }
        return resultLine;
    }
    public String drawPattern(char[] pattern, int repeatCount){
        String resultPattern ="".strip();
        int index=0;
        while (index< repeatCount){
            resultPattern+=String.valueOf(pattern);
            index++;
        }
        return resultPattern;
    }
}
