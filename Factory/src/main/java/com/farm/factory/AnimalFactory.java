package com.farm.factory;

import com.farm.animals.Animal;
import com.farm.animals.Cat;
import com.farm.animals.Dog;
import com.farm.animals.Fish;

public class AnimalFactory {

    public static Animal createAnimal(String breed) throws Exception {
        switch(breed) {
            case "British Shorthair":
            case "Munchkin":
            case "American Shorthair":
                return new Cat();
            case "Pitbull":
            case "Beagle":
                return new Dog();
            case "Goldfish":
                return new Fish();
        }
        throw new Exception("My apologies, but I do not know an animal of type: " + breed);
    }
}