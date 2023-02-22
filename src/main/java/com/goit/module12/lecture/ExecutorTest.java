package com.goit.module12.lecture;

import java.util.ArrayList;
import java.util.List;

public class ExecutorTest {
    public static void main(String[] args) throws InterruptedException {
        List<String> mails = new ArrayList<>();
        SendMailService sendMailService = new SendMailService();
        for (int i = 0; i < 100; i++) {
            mails.add("to: user"+ i + "@gmail.com. Content : your discount code " + i);
        }
        System.out.println("some action in program");
        sendMailService.sendMails(mails);

        System.out.println("Continiue program");

    }
}
