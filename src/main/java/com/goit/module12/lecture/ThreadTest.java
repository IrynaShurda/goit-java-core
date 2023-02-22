package com.goit.module12.lecture;

public class ThreadTest {
    public static void main(String[] args) {
        //інформація про поток в поточному методі
//        System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
//        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

        //інформація про кількість логічних ядер на процесорі (паралельних потоків даннич)
//        System.out.println("Runtime.getRuntime().availableProcessors() = " + Runtime.getRuntime().availableProcessors());

//        // створити новий поток
//        Thread myThread = new Thread();

        //створення нового потоку через extends Thread та override run в іншому класі
/*
        Thread thread = new MyThread();
        thread.start(); // початок
        new MyThread().start(); //виділення додаткового потоку

 */
        //створення нового потоку через λ-вираз
/*
        Thread newThread = new Thread(() ->{
            System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        });
        newThread.start();

 */
         new Thread(() -> {
            System.out.println("Thread started");
             try {
                 Thread.sleep(2000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
             System.out.println("Thread ended");
        }).start();



    }
}
