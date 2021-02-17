package com.factory.animals;

import com.factory.core.Animal;

public class Dog extends Animal {

    public Dog() {
        this.kind = "Dog";
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says woof-woof!");
    }

}