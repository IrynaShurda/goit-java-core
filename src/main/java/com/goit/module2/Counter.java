package com.goit.module2;

public class Counter {
    public static void main(String[] args) {
        Counter count=new Counter();
        System.out.println("current(number) = " + count.current(5));
        System.out.println("next(number) = " + count.next(5));
        System.out.println("prev(number) = " + count.prev(5));

    }
    public long current(long number){
return number;
    }
    public long next(long number){
return ++number;
    }
    public long prev(long number){
return --number;
    }
}
