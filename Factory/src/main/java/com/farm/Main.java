package com.farm;

import com.farm.animals.*;
import com.farm.factory.AnimalFactory;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Start the program");
        Animal animal = AnimalFactory.getInstance().createAnimal("Beagle");

        /*
        TODO Add a completely new animal and a new dog name to create
         Create a list of animals with four names - iterate over each animal and execute the makeSound
         */

        animal.makeSound();
        System.out.println("Stop the program");
    }

}
