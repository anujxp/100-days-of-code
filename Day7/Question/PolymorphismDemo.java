package Question;

/*
 05_PolymorphismDemo.java
 Demonstrates method overriding and dynamic dispatch.
*/
class Shape {
    public double area() { return 0; }
}
class Rectangle extends Shape {
    double w,h; public Rectangle(double w,double h){this.w=w;this.h=h;}
    @Override public double area(){ return w*h; }
}
class Circle extends Shape {
    double r; public Circle(double r){this.r=r;}
    @Override public double area(){ return Math.PI * r * r; }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("--- 05_PolymorphismDemo ---");
        Shape s1 = new Rectangle(3,4);
        Shape s2 = new Circle(2);
        System.out.println("Area rect=" + s1.area());
        System.out.println("Area circ=" + s2.area());
    }
}
