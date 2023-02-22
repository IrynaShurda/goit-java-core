package com.goit.module12.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterTest {


//    public static volatile long counter = 0L;
//    private static synchronized void add() {
//        counter = counter + 1;
//    }

    // для інкременту і декрименту можна використовувати наступне

    public static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            threads.add(new Thread(() -> {
                for (int j = 0; j < 100; j++) {
//                    add();
                    //для інкременту і і декрименту можна використовувати наступне
                    counter.addAndGet(1);
                }
            }));
        }
        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("counter = " + counter);
    }

}


