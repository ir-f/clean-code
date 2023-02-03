package com.endava.tech.cources.java.names.rules;

public class HardCodedValues {

    static class Example {

        public static void main(String[] args) {
            int x = 10;
            int y = 20;
            int result = x + y;
            System.out.println("The result is: " + result);
        }
    }

    static class BetterExample {

        private static final int X_VALUE = 10;
        private static final int Y_VALUE = 20;

        public static void main(String[] args) {
            int x = X_VALUE;
            int y = Y_VALUE;
            int result = x + y;
            System.out.println("The result is: " + result);
        }
    }
}
