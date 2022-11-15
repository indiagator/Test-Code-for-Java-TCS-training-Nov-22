package com.tcs.main;

public interface MyInterface
{
    void sort();
    Month[] list();

    static int add2nos(int x, int y)
    {
        return x+y;
    }

    default void sortAgain() // this is still an abstract method BUT with a default implementation
    {
        System.out.println("This is another sort method");
    }
}
