package com.endava.tech.cources.java.principles.solid.ocp;

public class Example {

    class Rectangle {

        private int width;
        private int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int calculateArea() {
            return width * height;
        }
    }

    class Circle {

        private int radius;

        public Circle(int radius) {
            this.radius = radius;
        }

        public int calculateArea() {
            return (int) (Math.PI * radius * radius);
        }
    }
}
