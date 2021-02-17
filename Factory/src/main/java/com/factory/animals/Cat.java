package com.factory.animals;

import com.factory.core.Animal;

public class Cat extends Animal {

    public Cat() {
        this.kind = "Cat";
    }

    @Override
    public void makeSound() {
        System.out.println("Cat says meow!");
    }
}