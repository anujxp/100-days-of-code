/*
ShapePolymorphism.java
Shows runtime polymorphism: Shape base class with Circle, Rectangle, Triangle.
Also demonstrates storing different subclasses in a Shape[] and iterating.
Compile:
  javac ShapePolymorphism.java
Run:
  java ShapePolymorphism
*/

abstract class Shape {
    public abstract double area();
    public abstract String name();
}

class Circle extends Shape {
    private double r;
    public Circle(double r) { this.r = r; }
    @Override public double area() { return Math.PI * r * r; }
    @Override public String name() { return "Circle"; }
}

class Rectangle extends Shape {
    private double w, h;
    public Rectangle(double w, double h) { this.w = w; this.h = h; }
    @Override public double area() { return w * h; }
    @Override public String name() { return "Rectangle"; }
}

class Triangle extends Shape {
    private double b, h;
    public Triangle(double b, double h) { this.b = b; this.h = h; }
    @Override public double area() { return 0.5 * b * h; }
    @Override public String name() { return "Triangle"; }
}

class ShapePolymorphism {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Circle(2.0),
            new Rectangle(3.0, 4.0),
            new Triangle(4.0, 5.0)
        };

        System.out.println("=== Shape Polymorphism Demo ===");
        for (Shape s : shapes) {
            System.out.printf("%s area = %.3f%n", s.name(), s.area());
        }
    }
}
