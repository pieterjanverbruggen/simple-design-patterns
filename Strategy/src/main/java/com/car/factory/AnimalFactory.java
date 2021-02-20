package com.car.factory;

import com.car.animals.*;
import com.car.strategy.Angry;
import com.car.strategy.Sweet;

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
                return new Cat(new Sweet());
            case "Beagle": return new Dog(new Sweet());
            case "Pitbull": return new Dog(new Angry());
        }
        throw new Exception("My apologies, but I do not know an animal of type: " + breed);
    }
}