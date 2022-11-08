package com.tcs.main;

/** my own custom number class */
public class ExtraLong extends Number {

    long numPart1;
    long numPart2;

    ExtraLong(long numPart1, long numPart2)
    {
        this.numPart1 = numPart1;
        this.numPart2 = numPart2;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
