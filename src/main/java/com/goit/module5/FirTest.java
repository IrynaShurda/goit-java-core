package com.goit.module5;

public class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
//        FirNum firNum = new FirNum();
//        FirNum firNum = new FirNumSum();
//        FirNum firNum = new FirNumFactorial();
//        FirNum firNum = new FirNumMultiplyOdd();
//        FirNum firNum = new FirNumFizzBuzz();
        FirNum firNum = new FirNumBasis();
        FirTest firTest = new FirTest();

        //Should be 10
//        System.out.println(firTest.test(firNum, 10));

        //Should be 6
//        System.out.println(firTest.test(firNum, 3));

        //Should be 120
//        System.out.println(firTest.test(firNum, 5));

        //Should be 15
//        System.out.println(firTest.test(firNum, 5));

        //Should be 83
//        System.out.println(firTest.test(firNum, 20));

        //Should be 20
        System.out.println(firTest.test(firNum, 9));
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
class FirNumMultiplyOdd extends FirNum{
    @Override
    public int calc(int n) {
        int number = 1;
        int sum = 1;
        while (number <= n) {
            if (number % 2 != 0) {
                sum *= number;
            }
            number++;
        }
        return sum;
    }
}
class FirNumFizzBuzz extends FirNum{
    @Override
    public int calc(int n) {
        int number = 1;
        int sum = 0;
        while (number <= n) {
            if(number%3==0 && number%5==0){
                number++;
            }else if (number%3==0 ||number% 5==0){
                sum += number;
                number++;
            } else
            number++;
        }
        return sum;
    }
}

class FirNumBasis extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            if (i%2 == 0) {
                result += i;
            }
        }
        return result/2;
    }
}
