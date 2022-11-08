package com.tcs.side;

public class Animal implements Vocal, Control {

    int numberoflimbs;

    @Override
    public String speak() {
        return null;
    }

    @Override
    public boolean willYouObey() {
        return false;
    }
}
