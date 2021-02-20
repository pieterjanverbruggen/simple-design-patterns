package com.farmshop.animals;

import com.farmshop.strategy.Mood;

public class Dog extends Animal {

    public Dog(Mood mood) {
        super(mood);
        this.kind = "Dog";
        this.sound = "Woof-Woof";
    }
}