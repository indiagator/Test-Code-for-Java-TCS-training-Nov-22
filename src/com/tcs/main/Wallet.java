package com.tcs.main;

public class Wallet {

    int balance;

    Wallet(int balance)
    {
        this.balance = balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}
