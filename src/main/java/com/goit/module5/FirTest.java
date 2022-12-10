package com.goit.module5;

public class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
//        FirNum firNum = new FirNum();
        FirNum firNum = new FirNumSum();
        FirTest firTest = new FirTest();

        //Should be 10
        //System.out.println(firTest.test(firNum, 10));

        //Should be 6
        System.out.println(firTest.test(firNum, 3));

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
