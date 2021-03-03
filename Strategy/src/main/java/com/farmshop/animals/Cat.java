package com.farmshop.animals;

import com.farmshop.strategy.Mood;

public class Cat extends Animal {

    public Cat(String breed, Mood mood) {
        super(breed, mood);
        this.kind = "Cat";
        this.sound = "Meow";
    }

}