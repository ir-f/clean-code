package com.endava.tech.cources.java.names.rules;

import java.time.LocalDate;

public class Exercise {

    public static void main(String[] args) {

    }

    class Car {

        private String ab;
        private String bc;
        private int cd;
        private String de;
        private int ef;

        public Car(String make, String model, int year, String color, int speed) {
            this.ab= make;
            this.bc = model;
            this.cd = year;
            this.de = color;
            this.ef = speed;
        }

        public int findOut() {
            return LocalDate.now().getYear() - cd;
        }
    }

}
