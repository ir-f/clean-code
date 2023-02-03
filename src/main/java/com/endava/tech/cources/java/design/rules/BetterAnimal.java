package com.endava.tech.cources.java.design.rules;

abstract class BetterAnimal {

    abstract void makeSound();
}

class Dog extends BetterAnimal {

    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends BetterAnimal {

    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

class BetterExample {

    public static void main(String[] args) {
        BetterAnimal[] betterAnimals = {new Dog(), new Cat()};
        for (BetterAnimal animal : betterAnimals) {
            animal.makeSound();
        }
    }
}