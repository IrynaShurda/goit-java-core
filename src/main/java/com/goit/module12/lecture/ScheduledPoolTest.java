package com.goit.module12.lecture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledPoolTest {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.schedule(
                () -> System.out.println("Time.schedule " + System.currentTimeMillis()),
                2,
                TimeUnit.SECONDS
        );
        executorService.scheduleAtFixedRate(
                ()->System.out.println("Time.scheduleAtFixedRate " + System.currentTimeMillis()),
                0,
                2,
                TimeUnit.SECONDS
                );
        Thread.sleep(7000);
        executorService.shutdown();
        System.out.println("other actions");
    }
}
