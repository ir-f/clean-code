package com.endava.tech.cources.java.source.code.structure;

public class Example {

         private int x;
      public int y;

public int add(){
    return x + y;
    }
    public Example(int x, int y) {
        this.x = x;
        this.y = y;
        } public Example()
    {
    }





            public static void main(String[] args) {
    Example ex = new Example();
            ex.x = 10;
                    ex.y = 20;

int sum = ex.add();
            System.out.println("The sum is: " + sum);
    }
}




