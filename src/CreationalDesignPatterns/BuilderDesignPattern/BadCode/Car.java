package CreationalDesignPatterns.BuilderDesignPattern.BadCode;

public class Car {
    private String engine;
    private int wheels;
    private int seats;
    private String color;
    private boolean hasSunRoof;
    private boolean hasNavigationSystem;

    // BAD CODE: too many constructors → telescoping!

    public Car(String engine) {
        this.engine = engine;
    }

    public Car(String engine, int wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public Car(String engine, int wheels, int seats) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
    }

    public Car(String engine, int wheels, int seats, String color) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.color = color;
    }

    public Car(String engine, int wheels, int seats, String color, boolean hasSunRoof) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.color = color;
        this.hasSunRoof = hasSunRoof;
    }

    public Car(String engine, int wheels, int seats, String color, boolean hasSunRoof, boolean hasNavigationSystem) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.color = color;
        this.hasSunRoof = hasSunRoof;
        this.hasNavigationSystem = hasNavigationSystem;
    }

    // Getters
    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasSunRoof() {
        return hasSunRoof;
    }

    public boolean isHasNavigationSystem() {
        return hasNavigationSystem;
    }
}
