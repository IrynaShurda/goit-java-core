package com.goit.module4;

import java.util.Arrays;

public class ArlanHelper {
    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();

        //Завдання 1
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(2));


        //Завдання 2
        //Should be:
        //XX
        //XX
        //XX
        System.out.println(helper.drawRect(2, 3, 'X'));
    }
    public String drawQuad(int n){
        int line = n;
        int column=n;
        int i = 0;
        int j = 0;
        while (i<line) {
            while (j < column) {
                //result +="*";
                System.out.print("*");
                j++;
            }
            i++;
            j=0;
            //result+="\n";
            System.out.println();
        }
//        for (String[] strings : quad) {
//            System.out.println( Arrays.toString(strings));
//        }
        return "";
    }

    public String drawRect(int width, int height, char c){
        String resultC = "";
        int i = 0;
        int j = 0;
        while (i<height) {
            while (j<width){
                resultC += c;
                j++;
            }
            resultC +="\n";
            i++;
            j=0;
        }
        return resultC;
    }
}
