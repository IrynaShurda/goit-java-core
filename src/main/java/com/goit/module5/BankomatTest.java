package com.goit.module5;

public class BankomatTest {
    public static void main(String[] args) {
        Card testCard = new Card();

        System.out.println("testCard.cardNumber = " + testCard.getCardNumber());
        System.out.println("testCard.fullName = " + testCard.getFullName());
        System.out.println("testCard.balance = " + testCard.getBalance());


//        long balance = testCard.getBalance();
//        balance-=1500;
//        testCard.;


//        testCard.getBalance()=testCard.balance-100;
//        System.out.println("testCard.balance = " + testCard.balance);

//        System.out.println("=============================");
//        Card otherCard = new Card();
//        System.out.println("otherCard.cardNumber = " + otherCard.cardNumber);
//        System.out.println("otherCard.fullName = " + otherCard.fullName);
//        System.out.println("otherCard.balance = " + otherCard.balance);

        testCard.withdrawMoney(1500);
        System.out.println("testCard.getBalance() = " + testCard.getBalance());

        PrivatBankCard privatBankCard = new PrivatBankCard();
        System.out.println("cardPrivat.getCreditLimit() = " + privatBankCard.getCreditLimit());
        System.out.println("cardPrivat.getAddress() = " + privatBankCard.getAddress());



    }
}
