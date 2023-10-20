package com.endava.tech.cources.java.names.rules;

public class MagicStrings {

    static class Example {

        public static void main(String[] args) {
            String message = "Hello";
            if (message == "Hello") {
                System.out.println("The message is Hello");
            } else {
                System.out.println("The message is not Hello");
            }
        }
    }

    static class BetterExample {

        private static final String HELLO_MESSAGE = "Hello";

        public static void main(String[] args) {
           checkMessage("some string");
        }

        private static void checkMessage(String message) {
            if (message == HELLO_MESSAGE) {
                System.out.println("The message is Hello");
            } else {
                System.out.println("The message is not Hello");
            }
        }
    }

}


