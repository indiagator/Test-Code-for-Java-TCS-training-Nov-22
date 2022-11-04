package com.tcs.side;


public class CafeCoffeeDay { // BluePrint | Class Declaration

    // DATA members - fields - table fields

    private String location; // initialized later
    private final float size; // intialized with the constructor
    private final int strength; // number of personnel

    //methods

    //Constructor Overloading

    public CafeCoffeeDay(float size, int strength)
    {
        this.size = size;
        this.strength = strength;
        //Other Initialization Code
    }

    // You can have multiple constructors
    CafeCoffeeDay(float size, int strength, String location)
    {
        this.size = size;
        this.strength = strength;
        this.location = location;
        //Other Initialization Code
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getSize() {
        return this.size;
    }

    public int getStrength() {
        return this.strength;
    }

    public String getLocation() {
        return this.location;
    }

    @Override
    public String toString() {

        return super.toString();
    }
}
