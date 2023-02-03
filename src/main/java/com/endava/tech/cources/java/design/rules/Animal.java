package com.endava.tech.cources.java.design.rules;

public class Animal {

    void makeSound(String type) {
        if (type.equals("Dog")) {
            System.out.println("Bark");
        } else if (type.equals("Cat")) {
            System.out.println("Meow");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound("Dog");
        animal.makeSound("Cat");
    }
}