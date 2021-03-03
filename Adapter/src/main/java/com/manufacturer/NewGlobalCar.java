package com.manufacturer;

public class NewGlobalCar implements Dashboard {

    enum Metric {A, E};

    // Data fields
    private String type;
    private String model;
    private String color;
    private Metric metric;
    private int speedInMiles;

    // Constructor
    public NewGlobalCar(String type, String model, String color, Character metric) {
        this.type = type;
        this.model = model;
        this.color = color;
        if (metric.equals('A')) {
            this.metric = Metric.A;
        } else {
            this.metric = Metric.E;
        }
    }

    // Methods
    public int increaseSpeed(int increment) {
        this.speedInMiles = this.speedInMiles + increment;
        return this.speedInMiles;
    }

    public void displaySpeed() {
        if (this.metric == Metric.A) System.out.println("This car is driving at " + speedInMiles + " miles per hour");
        else System.out.println("This car is driving at " + speedInMiles * 1.6 + " km per hour");
    }

}
