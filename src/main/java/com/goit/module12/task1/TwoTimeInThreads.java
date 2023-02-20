package com.goit.module12.task1;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TwoTimeInThreads {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger();
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        executorService.scheduleAtFixedRate(
                ()->{
                    counter.getAndIncrement();
                    if (counter.get()==1) {
                        System.out.println(counter.get() + " секунда від моменту запуску програми");
                    }
                    else if (counter.get()<5) {
                        System.out.println(counter.get() + " секунди від моменту запуску програми");
                    }else {
                        System.out.println(counter.get() + " секунд від моменту запуску програми");
                    }
                },
                1,
                1,
                TimeUnit.SECONDS
        );
        executorService.scheduleAtFixedRate(
                ()->System.out.println("Минуло 5 секунд"),
                5,
                5,
                TimeUnit.SECONDS
        );
        Thread.sleep(10000);
        executorService.shutdown();
        System.out.println("finish");
    }
}

