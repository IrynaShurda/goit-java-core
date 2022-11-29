package com.goit.module4;

import java.util.Arrays;

public class ArlanHelper {
    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(2));
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
}
