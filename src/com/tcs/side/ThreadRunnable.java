package com.tcs.side;

public class ThreadRunnable implements Runnable {

    private String threadName;
    private Thread t4;

    private TestThread father;

    private Number n1;
    private Number n2;

    ThreadRunnable(String threadName, TestThread father, Number n1, Number n2)
    {
        this.threadName = threadName;
        this.father = father;
        //t4 = new TestThreadExtended("INNER_THREAD5",father);
       // setData();

        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public void run() {


        //t4.start();

        if(Thread.interrupted())
        {
            //Code for Interrupt Handling
        }

        int cntr  = 0;
        try
        {
            while (cntr < 15) // infinite loop
            {

                n1.doI();

                if(Thread.interrupted()) // interrupt flag's value is returned
                {
                    //Code for Interrupt Handling
                }



                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    //Code for Interrupt Handling
                    throw new RuntimeException(e);
                }

                cntr++;
            }

        }
        catch (RuntimeException e)
        {
            System.out.println(threadName+" was interrupted "+e.getMessage());
        }

    }

    public String getThreadName() {
        return threadName;
    }


    public Thread getT4() {
        return t4;
    }

    public void setData()
    {
        father.setSharedDataT1(t4); // invoking a synchronized method
    }
}
