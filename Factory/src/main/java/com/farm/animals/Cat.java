package com.farm.animals;

public class Cat extends Animal {

    public Cat() {
        this.kind = "Cat";
    }

    @Override
    public void makeSound() {
        System.out.println("Cat says meow!");
    }
}