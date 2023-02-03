package com.endava.tech.cources.java.principles.solid.srp;

public class Examlpe {

    class Employee {

        private String name;
        private String address;

        public void setName(String name) {
            this.name = name;
            logChange("Employee name changed to: " + name);
        }

        public void setAddress(String address) {
            this.address = address;
            logChange("Employee address changed to: " + address);
        }

        private void logChange(String message) {
            // log change to file
        }
    }
}
