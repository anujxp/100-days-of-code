

/*
AbstractionExample.java
Demonstrates abstraction:
 - Abstract class (partial abstraction)
 - Interface (full abstraction)
Run:
  javac Question/AbstractionExample.java
  java Question.AbstractionExample
*/

interface Drawable {
    // Full abstraction (in older Java versions interfaces have abstract methods)
    void draw();
}

abstract class Shape {
    // Partial abstraction: some behavior defined, some abstract
    String color;
    public Shape(String color) { this.color = color; }

    // concrete method
    public void showColor() {
        System.out.println("Color: " + color);
    }

    // abstract method to be implemented by subclasses
    public abstract double area();
}

class Circle extends Shape implements Drawable {
    private double radius;
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        System.out.println("=== Abstraction Demo ===");

        Circle c = new Circle(2.5, "Blue");
        c.draw();           // Drawable interface method
        c.showColor();      // concrete method from Shape
        System.out.printf("Area = %.2f%n", c.area());

        // You can program to the abstract type or interface:
        Shape s = c;
        s.showColor();
        Drawable d = c;
        d.draw();
    }
}
