package com.manufacturer;

public class OriginalAmericanCar {

    // Data fields
    private String type;
    private String model;
    private String color;
    private int speed;

    // Constructor
    public OriginalAmericanCar(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }

    // Methods
    public int increaseSpeed(int increment) {
        this.speed = this.speed + increment;
        return this.speed;
    }

    public void showMilesPerHour() {
        System.out.println("This car is driving at " + speed + " miles per hour");
    }
}
