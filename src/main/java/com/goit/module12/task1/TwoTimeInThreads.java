package com.goit.module12.task1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TwoTimeInThreads {
    public static void main(String[] args) throws InterruptedException {
        extracted(1, 5, 1, 5, SECONDS, SECONDS, 10000);
    }

    private static void extracted(int periodOne, int periodTwo, int delayOne, int delayTwo, TimeUnit caseTimeOne, TimeUnit caseTimeTwo, int shutdownTime) throws InterruptedException {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        AtomicInteger counter = new AtomicInteger();
        executorService.scheduleAtFixedRate(
                () -> {
                    counter.getAndIncrement();
                    System.out.println(counter.get() + " сек");
                },
                delayOne,
                periodOne,
                caseTimeOne
        );
        executorService.scheduleAtFixedRate(
                () -> System.out.println("Минуло " + periodTwo + " секунд"),
                delayTwo,
                periodTwo,
                caseTimeTwo
        );
        Thread.sleep(shutdownTime);
        executorService.shutdown();
        System.out.println("finish");
    }
}

