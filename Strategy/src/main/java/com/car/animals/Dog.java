package com.car.animals;

import com.car.strategy.Mood;

public class Dog extends Animal {

    public Dog(Mood mood) {
        super(mood);
        this.kind = "Dog";
        this.sound = "Woof-Woof";
    }
}