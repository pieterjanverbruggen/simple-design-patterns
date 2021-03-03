package com.farmshop.animals;

import com.farmshop.strategy.Mood;
import com.farmshop.strategy.Normal;

public abstract class Animal {

    private Mood mood;
    protected String sound;
    protected String kind;
    protected String breed;

    protected Animal() {
        this.mood = new Normal();
    }

    protected Animal(String breed, Mood mood) {
        this.mood = mood;
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println(breed + " " + kind + " says " + mood.changeMood(sound));
    }

}
