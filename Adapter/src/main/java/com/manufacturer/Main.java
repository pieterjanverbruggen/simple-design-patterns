package com.manufacturer;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start the program");

        OriginalAmericanCar focus = new OriginalAmericanCar("Ford", "Focus", "red");
        OriginalAmericanCar auris = new OriginalAmericanCar("Toyota", "Auris", "blue");
        OriginalAmericanCar golf = new OriginalAmericanCar("Volkswagen", "Golf", "green");

        focus.increaseSpeed(80);
        auris.increaseSpeed(50);
        golf.increaseSpeed(120);

        /**
        TODO Find a solution so that all speed information is in KM/H however:
         - Do not touch the CAR class as this class is shared with America
         - The database has thousands of car models which we do not want to rebuild
         - Isn't there any way we can simply wrap it... ?
         */

        focus.showMilesPerHour();
        auris.showMilesPerHour();
        golf.showMilesPerHour();

        System.out.println("Stop the program");
    }

}
