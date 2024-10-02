package someSimpleTasks;

import java.io.Serializable;

public class Car extends Vehicle implements Serializable {
    private static final long serialVersionUID = 1l;
    private String make;
    private int year;

    public Car() {
    }

    public Car(String make, int year) {
        if (year < 0) {
            throw new NumberFormatException("Year cannot be negative");
        }
        this.make = make;
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void displayInfo() {
        System.out.println("Car info: make - " + this.make + ", year - " + this.year);
    }

    @Override
    public void move() {
        System.out.println("Car " + this.make + " is moving");
    }
}
