package com.tcs.side;

public class TestThreadExtended extends Thread
{
    private String threadName;
    private TestThread father;

    private Number n1;

    private Number n2;

    TestThreadExtended(String threadName, TestThread father, Number n1, Number n2)
    {
        this.father = father;
        this.threadName = threadName;
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public void run()
    {
        int cntr = 0;
        try
        {
            while (cntr < 15) {

                n1.doI();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }



                cntr++;
            }
        }catch( RuntimeException e)
        {
            System.out.println(threadName+" was interrupted "+e.getMessage());
        }


    }

    public String getThreadName()
    {
        return threadName;
    }
}
