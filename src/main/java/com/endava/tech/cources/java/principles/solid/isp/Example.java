package com.endava.tech.cources.java.principles.solid.isp;

public class Example {

    interface Animal {

        void makeSound();

        void fly();
    }

    class Dog implements Animal {

        @Override
        public void makeSound() {
            System.out.println("Bark");
        }

        @Override
        public void fly() {
            throw new UnsupportedOperationException();
        }
    }

}
