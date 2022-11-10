package com.tcs.side;


import java.util.Objects;

public class Location {


    //GPS representation

    public static String locationType = "xy";

    private float x; // instance variables
    float y;

    public Location(float x, float y) // parameters
    {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        if (Float.compare(location.x, x) != 0) return false;
        return Float.compare(location.y, y) == 0;
    }
}
