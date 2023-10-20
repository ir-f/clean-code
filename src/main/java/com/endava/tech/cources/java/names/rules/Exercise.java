package com.endava.tech.cources.java.names.rules;

import java.time.LocalDate;

public class Exercise {

    public static void main(String[] args) {
        Class1 car = new Class1("BMW", "M4", 2023, "black", 320);
        int carAge= car.findOut();
        System.out.println(carAge);
    }

    static class Class1 {

        private String ab;
        private String bc;
        private int cd;
        private String de;
        private int ef;

        public Class1(String make, String model, int year, String color, int speed) {
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
