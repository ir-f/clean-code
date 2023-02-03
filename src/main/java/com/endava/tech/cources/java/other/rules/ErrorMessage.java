package com.endava.tech.cources.java.other.rules;

public class ErrorMessage {

    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int result = x / y;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: something went wrong!");
        }
    }
}

