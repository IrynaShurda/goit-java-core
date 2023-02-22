package com.goit.module12.task2;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConvertToFizzBuzz {

    public static ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue();
    public static int n = 15;

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= n; i++) {
            final int counter = i;
            threadA(service, counter);
            threadB(service, counter);
            threadC(service, counter);
            threadD(service, counter);
        }

        Thread.sleep(1000);
        service.shutdownNow();
        Object result = String.join(", ", queue);
        System.out.println(result);
    }

    private static void threadA(ExecutorService service, int counter) {
        service.submit(() -> {
            if (counter % 3 == 0 && counter % 5 != 0) {
                queue.offer("fizz");
            }
        });
    }

    private static void threadB(ExecutorService service, int counter) {
        service.submit(() -> {
            if (counter % 5 == 0 && counter % 3 != 0) {
                queue.offer("buzz");
            }
        });
    }

    private static void threadC(ExecutorService service, int counter) {
        service.submit(() -> {
            if (counter % 5 == 0 && counter % 3 == 0) {
                queue.offer("fizzbuzz");
            }
        });
    }

    private static void threadD(ExecutorService service, int counter) {
        service.submit(() -> {
            number(counter);
        });
    }

    private static void number(int counter) {
        if (counter % 5 != 0 && counter % 3 != 0) {
            queue.offer(String.valueOf(counter));
        }
    }
}
