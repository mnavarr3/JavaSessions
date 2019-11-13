package sample;

public class Item {

    //field variables
    private long propertyID;
    private double value;
    private String description;

    //Constructor that is initializing all 3 field variables
    public Item(long propertyID, double value, String description) {
        this.propertyID = propertyID;
        this.value = value;
        this.description = description;
        System.out.println("I'm in the constructor" + this.description);
    }

    //Constructor that initializes the description
    public Item(String description) {
        this.description = description;
    }

    public Item() {
    }


    public Item(double value, long propertyID) {
        this.propertyID = propertyID;
        this.value = value;
    }


    //getters and setters
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public long getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(long propertyID) {
        this.propertyID = propertyID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //method to calculate value loss
    public double looseValue() {
        double result = 0.0;
        result = this.getValue() * 0.8;
        return result;
    }

}


class Server extends Item {

    public Server(String description) {
        super(description);
    }
}

class Rack extends Item {

    //Constructor that initializes the dsecription field variable
    public Rack(String description) {
        super(description);
    }

    public Rack(long propertyID, double value) {

        super(value, propertyID);


    }



    public double looseValue() {
        double result = 0.0;
        result = this.getValue() * 0;
        return result;
    }

}

class Desktop extends Item {

    public Desktop(long propertyID, double value, String description) {
        super(propertyID, value, description);


    }

    //overriding the loosValue method
    public double looseValue() {
        double result = 0.0;
        result = this.getValue() * 0.6;
        return result;
    }
}

