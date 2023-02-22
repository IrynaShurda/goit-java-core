package com.goit.module5;

public class Card {
    private String cardNumber = "123456789";
    private String fullName = "Ivan Ivanov";
    private long balance = 1000;

    private long creditLimit = 0;

    //    геттер -метод який відкриває читання поля.
    //    він повертає значення поля в зовнішній світ

    public String getCardNumber(){
        return cardNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public long getBalance() {
        return balance;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(long creditLimit) {
        this.creditLimit = creditLimit;
    }

    public long withdrawMoney(long amountToWithdraw) {
        if(amountToWithdraw<=0){
            System.out.println("Invalid amount: "+ amountToWithdraw);
            return 0;
        }
        if (amountToWithdraw>balance){
            System.out.println("not enough money on your balance");
            return 0;
        }
        System.out.println("You");
        balance-=amountToWithdraw;
        return amountToWithdraw;
    }
}
