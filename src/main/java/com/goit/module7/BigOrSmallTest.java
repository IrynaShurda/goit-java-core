package com.goit.module7;

public class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}
class BigOrSmall{
    public String calculate(String text){
        int countSmall=findSmall(text);
        int countBig=text.length()-countSmall;
        if (countSmall>countBig){
            return "Small";
        }
        if (countSmall<countBig){
            return "Big";
        }
        return "Same";
    }
    public int findSmall (String text){
        char[] line = text.toCharArray();
        int counter=0;
        for (char c : line) {
            if (Character.isLowerCase(c)){
                counter++;
            }
        }
        return counter;
    }
}
