package com.farmshop.animals;

import com.farmshop.strategy.Mood;
import com.farmshop.strategy.Normal;

public abstract class Animal {

    private Mood mood;
    protected String sound;
    protected String kind;

    protected Animal() {
        this.mood = new Normal();
    }

    protected Animal(Mood mood) {
        this.mood = mood;
    }

    public void makeSound() {
        System.out.println(kind + " says " + mood.changeMood(sound));
    }

}
