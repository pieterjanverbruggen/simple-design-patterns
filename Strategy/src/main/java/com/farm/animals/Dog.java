package com.farm.animals;

import com.farm.strategy.Mood;

public class Dog extends Animal {

    public Dog(Mood mood) {
        super(mood);
        this.kind = "Dog";
        this.sound = "Woof-Woof";
    }
}