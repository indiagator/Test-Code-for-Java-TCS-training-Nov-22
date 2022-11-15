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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return numberoflimbs == animal.numberoflimbs;
    }

    @Override
    public int hashCode() {
        return numberoflimbs;
    }
}
