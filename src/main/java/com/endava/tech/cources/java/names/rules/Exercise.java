package com.endava.tech.cources.java.names.rules;

public class Exercise {

    public static void main(String[] args) {

    }

    class Car {

        private String a;
        private String b;
        private int c;
        private String d;
        private int e;

        public Car(String make, String model, int year, String color, int speed) {
            this.a = make;
            this.b = model;
            this.c = year;
            this.d = color;
            this.e = speed;
        }

        public int retrieve() {
            return c;
        }
    }

}
