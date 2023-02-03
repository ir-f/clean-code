package com.endava.tech.cources.java.other.rules;

public class BetterErrorMessage {

    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int result = x / y;
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Two integers are required as command line arguments");
        } catch (NumberFormatException e) {
            System.out.println("Error: Command line arguments must be integers");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
    }
}
