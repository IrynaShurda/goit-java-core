package com.goit.module6;
import java.util.Arrays;

public class PowTable {
    public static final int[] POWERS_2 = {1,2,3,4,5,6,7,8,9,10};
   static  {
       for (int i = 1; i < POWERS_2.length; i++) {
           POWERS_2[i]=POWERS_2[i]*POWERS_2[i];
       }
    }

}
class PowTableTest {
    public static void main(String[] args) {
        //[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
        System.out.println(Arrays.toString(PowTable.POWERS_2));
    }
}