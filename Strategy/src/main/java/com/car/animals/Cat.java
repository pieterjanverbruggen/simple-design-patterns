package com.car.animals;

import com.car.strategy.Mood;

public class Cat extends Animal {

    public Cat(Mood mood) {
        super(mood);
        this.kind = "Cat";
        this.sound = "Meow";
    }

}