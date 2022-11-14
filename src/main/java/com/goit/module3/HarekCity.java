package com.goit.module3;

import java.util.*;

public class HarekCity {


    // завдання 5
    /*public static void main(String[] args) {
        String[] arr = new HarekCity().createEmptyNameArray();
        System.out.println(Arrays.toString(arr));
    }*/

    // завдання 6
    /*public static void main(String[] args) {
        int[] ageArray = new HarekCity().createAgeArray(10, 20, 30, 40);
        System.out.println(Arrays.toString(ageArray));
    }*/

    // завдання 7
    /*public static void main(String[] args) {
        String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
        String[] toReplace = new String[]{"lopr", "boki"};
        new HarekCity().fixNames(names, toReplace);
        System.out.println(Arrays.toString(names));
     }*/

    // завдання 8
    /*public static void main(String[] args) {
        String[] names = new String[]{"io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"};
        System.out.println(new HarekCity().firstAndLastTogether(names));
    }*/

    // завдання 9
    /*public static void main(String[] args) {
        String[] results = new String[]{"miho", "hut"};
        new HarekCity().changeElectResult(results);
        System.out.println(Arrays.toString(results));
    }*/

    // завдання 10
    /*public static void main(String[] args) {
        String[] results = new String[]{"mix", "max", "pex", "fux", "rox"};
        String[] changedResults = new HarekCity().changeElectResultAgain(results);
        System.out.println(Arrays.toString(changedResults));
    }*/

    // завдання 11
    /*public static void main(String[] args) {
        char[][] keyboard = new HarekCity().createKeyboard();
        for (int i = 0; i < keyboard.length; i++) {
            System.out.println(Arrays.toString(keyboard[i]));
        }*/

    // завдання 12
    /*public static void main(String[] args) {
        new HarekCity().printKeyboard();
    }*/

    // завдання 13
    public static void main(String[] args) {
        String[] source = new String[] {"Hero", "Mihu"};
        String[] copy = new HarekCity().makeCopy(source);

        source[0] = "CHANGED!"; //Мы меняем исходный массив, но на копии это не отображается

        System.out.println(Arrays.toString(copy));
    }


    // завдання 5
    /*public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }*/

    // завдання 6
        /*public int[] createAgeArray(int age1, int age2, int age3, int age4){
        int [] ageArray = {age1, age2,age3, age4};
        return ageArray;
    }*/

    // завдання 7
    /*public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }*/

    // завдання 8
    /*public String firstAndLastTogether(String[] names) {
        String namesFirst = names[0];
        String namesLast = names[names.length - 1];
        return namesFirst + " AND " + namesLast + " TOGETHER";
    }*/

    // завдання 9
    /*public void changeElectResult(String[] results){
        /*String [] newResults = Arrays.copyOf(results, results.length);
        results [0]=newResults[results.length-1];
        results[newResults.length-1]=newResults[0];
    }*/

    // завдання 10
    /*public String[] changeElectResultAgain(String[] results){
        String [] newResults = new String[3];
        newResults [0]=results[2];
        newResults [1]=results[3];
        newResults[2]=results[4];
        return newResults;
    }*/
    // завдання 11-12
    /*public char[][] createKeyboard() {
        char[][] arr = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };
        return arr;
    }*/

    // завдання 12
    /*public void printKeyboard() {
        //char[][] keyboard = Arrays.copyOf(createKeyboard(), createKeyboard(createKeyboard.length));

        char[][] keyboard = createKeyboard();

        String createKeyboard1 = Arrays.toString(keyboard[0]);
        String createKeyboard2 = Arrays.toString(keyboard[1]);
        String createKeyboard3 = Arrays.toString(keyboard[2]);
        String createKeyboard4 = Arrays.toString(keyboard[3]);

        System.out.println(createKeyboard1);
        System.out.println(createKeyboard2);
        System.out.println(createKeyboard3);
        System.out.println(createKeyboard4);
    }*/

    // завдання 13
    public String[] makeCopy(String[] names){
        String [] copy = Arrays.copyOf(names, names.length);
        System.out.println("Copied!");
    return copy;
    }
}
