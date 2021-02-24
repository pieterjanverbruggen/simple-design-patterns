package com.farm.animals;

public class Fish extends Animal {

    public Fish() {
        this.kind = "Fish";
    }

    @Override
    public void makeSound() {
        System.out.println("Fish says blup-blup!");
    }

}
