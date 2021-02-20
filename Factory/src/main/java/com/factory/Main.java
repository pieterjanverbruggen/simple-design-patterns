package com.factory;

import com.factory.animals.*;
import com.factory.solution.AnimalFactory;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Start the program");
        Animal animal = AnimalFactory.getInstance().createAnimal("Beagle");
        animal.makeSound();
        System.out.println("Stop the program");
    }

}
