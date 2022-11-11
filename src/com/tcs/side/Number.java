package com.tcs.side;

public class Number {

    private int i;

    Number(int i)
    {
        this.i = i;
    }

    public synchronized void doI(String threadName) // Transaction is one Unit of Business Logic Operation | It can comprise of multiple methods
    {
        incrementI();
        System.out.println("Value of n1 is: "+i+" as incremented by "+threadName);

    }

    public synchronized void incrementI()
    {
        i++;
        notifyAll();
    }

    public synchronized void checkI() throws InterruptedException
    {
        while( i<15 )
        {
            wait(); // any thread that invokes this checkI() method will go to sleep until someone wakes them up!
        }
    }
}
