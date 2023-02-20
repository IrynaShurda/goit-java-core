package com.goit.module12.task1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TwoTimeInThreads {
    public static void main(String[] args) throws InterruptedException {
        extracted(1, 5, 1,5,10000);
    }

    private static void extracted(int periodOne, int periodTwo, int delayOne,int delayTwo, int shutdownTime) throws InterruptedException {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        AtomicInteger counter = new AtomicInteger();
        executorService.scheduleAtFixedRate(
                () -> {
                    counter.getAndIncrement();
                    System.out.println(counter.get() + " сек");
                },
                delayOne,
                periodOne,
                TimeUnit.SECONDS
        );
        executorService.scheduleAtFixedRate(
                () -> System.out.println("Минуло 5 секунд"),
                delayTwo,
                periodTwo,
                TimeUnit.SECONDS
        );
        Thread.sleep(shutdownTime);
        executorService.shutdown();
        System.out.println("finish");
    }
}

