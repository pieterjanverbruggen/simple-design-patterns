package com.farmshop;

import com.farmshop.animals.Animal;
import com.farmshop.factory.AnimalFactory;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Start the program");
        LinkedList<Animal> animals = new LinkedList<>();
        animals.add(AnimalFactory.createAnimal("Beagle"));
        animals.add(AnimalFactory.createAnimal("Pitbull"));
        animals.add(AnimalFactory.createAnimal("American Shorthair"));
        animals.add(AnimalFactory.createAnimal("GoofyCat"));
        animals.add(AnimalFactory.createAnimal("GoofyDog"));

        for (Animal animal : animals) {
            animal.makeSound();
        }

        System.out.println("Stop the program");
    }

}
