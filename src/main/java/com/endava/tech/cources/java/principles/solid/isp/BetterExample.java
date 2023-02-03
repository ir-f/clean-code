package com.endava.tech.cources.java.principles.solid.isp;

public class BetterExample {

    interface SoundMaker {

        void makeSound();
    }

    interface Flyer {

        void fly();
    }

    class Dog implements SoundMaker {

        @Override
        public void makeSound() {
            System.out.println("Bark");
        }
    }

}
