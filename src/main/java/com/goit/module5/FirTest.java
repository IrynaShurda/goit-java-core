package com.goit.module5;

public class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
//        FirNum firNum = new FirNum();
//        FirNum firNum = new FirNumSum();
        FirNum firNum = new FirNumFactorial();
        FirTest firTest = new FirTest();

        //Should be 10
//        System.out.println(firTest.test(firNum, 10));

        //Should be 6
//        System.out.println(firTest.test(firNum, 3));

        //Should be 120
        System.out.println(firTest.test(firNum, 5));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        //return super.calc(n);
        int number = 1;
        int sum = 0;
        while (number <= n) {
            sum += number;
            number++;
        }
        return sum;
    }
}
class FirNumFactorial extends FirNum{
    @Override
    public int calc(int n) {
        int number = 1;
        int fucNum = 1;

         if (n==0){
             return fucNum;
         }else

        while (number <= n) {
            fucNum *= number;
            number++;
        }
        return fucNum;
    }
}
