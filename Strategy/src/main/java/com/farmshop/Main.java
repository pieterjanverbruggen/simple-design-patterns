package com.farmshop;

import com.farmshop.factory.AnimalFactory;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Start the program");
        AnimalFactory.getInstance().createAnimal("Beagle").makeSound();
        AnimalFactory.getInstance().createAnimal("Pitbull").makeSound();
        AnimalFactory.getInstance().createAnimal("American Shorthair").makeSound();

        // TODO Create a confused dog AND cat that both sound like a bird.. Tsjirp-Tsjirp!

        System.out.println("Stop the program");
    }

}
