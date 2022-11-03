public class CafeCoffeeDay { // BluePrint

    // DATA members - fields - table fields

    private String location; // initialized later
    private final float size; // intialized with the constructor
    private final int strength; // number of personnel

    //methods

    CafeCoffeeDay(float size, int strength)
    {
        this.size = size;
        this.strength = strength;


    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getSize() {
        return this.size;
    }

    public int getStrength() {
        return strength;
    }

    public String getLocation() {
        return location;
    }
}
