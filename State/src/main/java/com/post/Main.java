package com.post;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start the program");
        // Create Package
        Package order = new Package();
        order.printStatus();
        order.nextState();
        order.nextState();
        order.nextState();
        order.previousState();
        order.previousState();
        order.previousState();
        order.printStatus();
        System.out.println("Stop the program");
    }

}
