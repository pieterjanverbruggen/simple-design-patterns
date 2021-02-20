package com.car.animals;

import com.car.strategy.Mood;
import com.car.strategy.Normal;

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
