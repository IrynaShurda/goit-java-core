package com.goit.module12.task1;

import java.util.StringJoiner;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConvertToFizzBuzz {

    public static ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();
    public static int n = 15;

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(2);

        service.submit(() -> {
            while (true) {
                StringJoiner joiner = new StringJoiner(", ");
                if (queue.size() > 0) {
//                    StringJoiner result = joiner.add(queue.poll().toString());
                    System.out.print( queue.poll()+ ", ");
//                    System.out.println(result);

                }
            }
        });

        for (int i = 1; i <= n; i++) {
            final int counter = i;

            service.submit(() -> {
                if (counter % 3 == 0 && counter % 5 != 0) {
                    queue.offer("fizz");
                }
            });
            service.submit(() -> {
                if (counter % 5 == 0 && counter % 3 != 0) {
                    queue.offer("buzz");
                }
            });
            service.submit(() -> {
                if (counter % 5 == 0 && counter % 3 == 0) {

                    queue.offer("fizzbuzz");
                }
            });
            service.submit(() -> {
                number(counter);
            });
        }
        service.shutdown();


    }

    private static void number(int counter) {
        if (counter % 5 != 0 && counter % 3 != 0) {
            queue.offer(counter);
        }
    }
}
