package com.endava.tech.cources.java.principles.dry;

public class Code {

    public static void printHelloWorld() {
        System.out.println("Hello, World");
    }

    public static void printHelloUniverse() {
        System.out.println("Hello, Universe");
    }

    public static void printGreeting(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        printHelloWorld();
        printHelloUniverse();
        printGreeting("John");
    }
}

class BetterCode {

    public static void printGreeting(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        printGreeting("Hello, World");
        printGreeting("Hello, Universe");
        printGreeting("Hello, John");
    }
}