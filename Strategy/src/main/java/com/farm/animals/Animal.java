package com.farm.animals;

import com.farm.strategy.Mood;

public abstract class Animal {

    private Mood mood;
    protected String sound;
    protected String kind;

    protected Animal(Mood mood) {
        this.mood = mood;
    }

    public void makeSound() {
        System.out.println(kind + " says " + mood.changeMood(sound));
    }

}
