package com.farm.factory;

import com.farm.animals.Animal;
import com.farm.animals.Cat;
import com.farm.animals.Dog;

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