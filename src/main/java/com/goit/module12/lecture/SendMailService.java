package com.goit.module12.lecture;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SendMailService {

    //для одного потоку
//    private ExecutorService executorService = Executors.newSingleThreadExecutor();

    //для декількох потокі з зазначенням к-ті потоків
    private ExecutorService executorService = Executors.newFixedThreadPool(10);



    public void sendMails(List<String> mails) throws InterruptedException {

        //.newScheduledThreadPool - виконувати задачу за розкладом
        //.newFixedThreadPool() - багато потоків та багато задач
        //.newSingleThreadExecutor() - один поток який робить лише одну задачу



        System.out.println("I have a discount start mail process...");
//        for (String mail : mails) {
//            Thread.sleep(1000);
//            System.out.println("Mail sended: " + mail);
//        }

        // створення одного потоку за допомогою Executor
        for (String mail : mails) {
            executorService.submit(()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Mail sended: " + mail);
            });

        }

    }
}
