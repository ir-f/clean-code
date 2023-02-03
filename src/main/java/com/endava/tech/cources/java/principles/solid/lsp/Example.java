package com.endava.tech.cources.java.principles.solid.lsp;

public class Example {

    public void playWithAnimal(Dog animal) {
        animal.makeSound();
    }

    public void playWithAnimal(Cat animal) {
        animal.makeSound();
    }

    class Dog {

        public void makeSound() {
            System.out.println("Bark");
        }
    }

    class Cat {

        public void makeSound() {
            System.out.println("Meow");
        }
    }

    public void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        playWithAnimal(cat);
        playWithAnimal(dog);
    }
}

