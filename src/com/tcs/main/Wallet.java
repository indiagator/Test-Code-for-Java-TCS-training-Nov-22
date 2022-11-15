package com.tcs.main;

public class Wallet implements MyInterface { // Wallet is IMPLEMENTATION and MyInterface is the INTERFACE

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

    @Override
    public void sort() {

    }

    @Override
    public Month[] list() {
        return new Month[0];
    }
}
