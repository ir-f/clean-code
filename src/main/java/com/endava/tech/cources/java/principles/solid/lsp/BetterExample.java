package com.endava.tech.cources.java.principles.solid.lsp;

public class BetterExample {

    public void playWithAnimal(Animal animal) {
        animal.makeSound();
    }

    public class Animal {

        public void makeSound() {
            System.out.println("Animal sound");
        }
    }

    class Dog extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Bark");
        }
    }

    class Cat extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
    }

    public void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal animal = new Animal();

        playWithAnimal(cat);
        playWithAnimal(dog);
        playWithAnimal(animal);
    }
}
