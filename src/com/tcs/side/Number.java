package com.tcs.side;

public class Number {

    private int i;

    Number(int i)
    {
        this.i = i;
    }

    public synchronized void doI()
    {
        incrementI();
        System.out.println("Value of n1 is: "+i);

    }

    public synchronized void incrementI()
    {
        i++;
    }
}
