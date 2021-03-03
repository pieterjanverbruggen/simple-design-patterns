package com.farmshop.factory;

import com.farmshop.animals.*;
import com.farmshop.strategy.*;

public class AnimalFactory {

    private static AnimalFactory instance = null;
    private AnimalFactory() {}

    public static AnimalFactory getInstance() {
        if (instance == null) instance =  new AnimalFactory();
        return instance;
    }

    public Animal createAnimal(String breed) throws Exception {
        switch(breed) {
            case "British Shorthair": return new Cat(breed, new Normal());
            case "American Shorthair": return new Cat(breed, new Angry());
            case "Beagle": return new Dog(breed, new Normal());
            case "Golden Retriever": return new Dog(breed, new Sweet());
            case "Pitbull": return new Dog(breed, new Angry());
        }
        throw new Exception("My apologies, but I do not know an animal of type: " + breed);
    }
}