package com.farmshop.factory;

import com.farmshop.animals.*;
import com.farmshop.strategy.*;

public class AnimalFactory {

    public static  Animal createAnimal(String breed) throws Exception {
        switch(breed) {
            case "British Shorthair": return new Cat(breed, new Normal());
            case "American Shorthair": return new Cat(breed, new Angry());
            case "Beagle": return new Dog(breed, new Normal());
            case "Golden Retriever": return new Dog(breed, new Sweet());
            case "Pitbull": return new Dog(breed, new Angry());
            case "GoofyCat": return new Cat(breed, new Confused());
            case "GoofyDog": return new Dog(breed, new Confused());
        }
        throw new Exception("My apologies, but I do not know an animal of type: " + breed);
    }
}