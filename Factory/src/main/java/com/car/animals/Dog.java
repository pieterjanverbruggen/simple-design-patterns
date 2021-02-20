package com.car.animals;

public class Dog extends Animal {

    public Dog() {
        this.kind = "Dog";
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says woof-woof!");
    }

}