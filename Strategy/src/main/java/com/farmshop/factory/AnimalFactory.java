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
            case "British Shorthair": return new Cat(new Normal());
            case "American Shorthair": return new Cat(new Angry());
            case "Beagle": return new Dog(new Normal());
            case "Golden Retriever": return new Dog(new Sweet());
            case "Pitbull": return new Dog(new Angry());
        }
        throw new Exception("My apologies, but I do not know an animal of type: " + breed);
    }
}