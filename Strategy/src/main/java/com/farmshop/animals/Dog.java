package com.farmshop.animals;

import com.farmshop.strategy.Mood;

public class Dog extends Animal {

    public Dog(String breed, Mood mood) {
        super(breed, mood);
        this.kind = "Dog";
        this.sound = "Woof-Woof";
    }
}