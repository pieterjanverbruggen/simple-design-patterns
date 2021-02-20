package com.farm;

import com.farm.animals.*;
import com.farm.factory.AnimalFactory;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Start the program");
        AnimalFactory.getInstance().createAnimal("Beagle").makeSound();
        AnimalFactory.getInstance().createAnimal("Pitbull").makeSound();
        AnimalFactory.getInstance().createAnimal("American Shorthair").makeSound();

        // TODO Create a confused animal that is a dog but sounds like a bird

        System.out.println("Stop the program");
    }

}
