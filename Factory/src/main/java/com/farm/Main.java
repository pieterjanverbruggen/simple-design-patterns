package com.farm;

import com.farm.factory.AnimalFactory;
import com.farm.animals.Animal;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Start the program");
        LinkedList<Animal> animals = new LinkedList<>();
        animals.add(AnimalFactory.createAnimal("Beagle"));
        animals.add(AnimalFactory.createAnimal("Pitbull"));
        animals.add(AnimalFactory.createAnimal("Munchkin"));
        animals.add(AnimalFactory.createAnimal("Goldfish"));
        for (Animal animal : animals) {
            animal.makeSound();
        }

        System.out.println("Stop the program");
    }

}
