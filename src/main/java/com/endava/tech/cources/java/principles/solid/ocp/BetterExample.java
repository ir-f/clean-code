package com.endava.tech.cources.java.principles.solid.ocp;

public class BetterExample {

    interface Shape {

        int calculateArea();
    }

    class BetterRectangle implements Shape {

        private int width;
        private int height;

        public BetterRectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int calculateArea() {
            return width * height;
        }
    }

    class BetterCircle implements Shape {

        private int radius;

        public BetterCircle(int radius) {
            this.radius = radius;
        }

        public int calculateArea() {
            return (int) (Math.PI * radius * radius);
        }
    }

}
