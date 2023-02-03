package com.endava.tech.cources.java.source.code.structure;

public class BetterExample {

    // class level variables
    private int x;
    private int y;

    // constructor
    public BetterExample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // public method
    public int add() {
        return x + y;
    }

    // main method
    public static void main(String[] args) {
        BetterExample ex = new BetterExample(10, 20);
        int sum = ex.add();
        System.out.println("The sum is: " + sum);
    }
}
