package com.car;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start the program");

        Car focus = new Car("Ford", "Focus", "red");
        Car auris = new Car("Toyota", "Auris", "blue");
        Car golf = new Car("Volkswagen", "Golf", "green");

        focus.increaseSpeed(80);
        auris.increaseSpeed(50);
        golf.increaseSpeed(120);

        // TODO Create an Adapter so that all speed information is in KM/H

        focus.displaySpeed();
        auris.displaySpeed();
        golf.displaySpeed();

        System.out.println("Stop the program");
    }

}
