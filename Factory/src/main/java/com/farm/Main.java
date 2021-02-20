package com.farm;

import com.farm.factory.AnimalFactory;
import com.farm.animals.Animal;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Start the program");

        /*
        TODO Add one more breed of dog, a breed of a cat and add a new animal.
         Create a list those 4 animals
         Iterate over the list and let them make their sound
         */

        Animal animal = AnimalFactory.getInstance().createAnimal("Beagle");
        animal.makeSound();
        System.out.println("Stop the program");
    }

}
