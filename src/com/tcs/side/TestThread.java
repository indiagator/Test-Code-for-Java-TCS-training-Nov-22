package com.tcs.side;

public class TestThread
{

    private volatile Thread sharedDataT1; // volatile variables are counterparts of synchronized methods
    private Object sharedDataT2;
    private Object sharedDataT3;

    public  void setSharedDataT1(Thread sharedDataT1)
    {
        synchronized (this)
        {
            this.sharedDataT1 = sharedDataT1;
        }
    }

    public synchronized void setSharedDataT2(Object sharedDataT2) {
        this.sharedDataT2 = sharedDataT2;
    }

    public synchronized void setSharedDataT3(Object sharedDataT3) {
        this.sharedDataT3 = sharedDataT3;
    }

    public synchronized Thread getSharedDataT1()
    {
        return (Thread)sharedDataT1;
    }

    public synchronized Object getSharedDataT2() {
        return sharedDataT2;
    }

    public synchronized Object getSharedDataT3() {
        return sharedDataT3;
    }

    public static void main(String[] args) throws InterruptedException // will start from the main method (Entry Point)
    {
        System.out.println("Hello from Class TestThread");

        //Thread tTest = new Thread(new ThreadRunnable());
        //tTest.run();

        TestThread father = new TestThread();

        Number n1 = new Number(0);
        Number n2 = new Number(1);

        Thread t1 = new Thread(new ThreadRunnable("THREAD1",father, n1, n2));
        t1.start();

        Thread t2 = new TestThreadExtended("THREAD2",father, n1, n2);
        t2.start();

        Thread t3 = new TestThreadExtended("THREAD3",father, n1, n2);
        t3.start();

        Thread t4 = new Thread(new ThreadRunnable("THREAD4",father, n1, n2));
        t4.start();



        //int interruptCntr = 0;
        //while(true)
        //{
          //  System.out.println("This is from MAIN ");
           // Thread.sleep(1000);
            //interruptCntr++;

            //if(interruptCntr > 30)
            //{
              //  t1.interrupt();
                //t2.interrupt();
                //t3.interrupt();
                //father.getSharedDataT1().interrupt();

            //}
       // }

        t1.join(); // main thread sleeps till t1 thread is not terminated
        t2.join();
        t3.join();
        t4.join();
        //father.getSharedDataT1().join();
        System.out.println("MAIN THREAD is terminated!");
        //main thread will be terminated!

    }

    void someMethod()
    {

    }

    void someMethod(int x) //method signature
    {

    }

    void someMethod( char y)
    {

    }

}
