package com.endava.tech.cources.java.principles.solid.srp;

public class BetterExample {

    class Employee {

        private String name;
        private String address;

        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    class EmployeeChangeLogger {

        public static void logChange(String message) {
            // log change to file
        }
    }
}
