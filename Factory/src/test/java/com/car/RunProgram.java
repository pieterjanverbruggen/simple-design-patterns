package com.car;

import com.car.animals.Animal;
import com.car.factory.AnimalFactory;

public class RunProgram {

    public static void main(String[] args) throws Exception {
        System.out.println("Start the program");
        Animal animal = AnimalFactory.getInstance().createAnimal("Beagle");
        animal.makeSound();
        System.out.println("Stop the program");
    }
}
