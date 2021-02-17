package com.factory.solution;

import com.factory.animals.*;

public class AnimalFactory {

    private static AnimalFactory instance = null;
    private AnimalFactory() {}

    public static AnimalFactory getInstance() {
        if (instance == null) instance =  new AnimalFactory();
        return instance;
    }

    public Animal createAnimal(String breed) throws Exception {
        switch(breed) {
            case "British Shorthair":
            case "American Shorthair":
                return new Cat();
            case "Beagle": return new Dog();
        }
        throw new Exception("My apologies, but I do not know an animal of type: " + breed);
    }
}