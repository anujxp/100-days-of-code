package Question;

// Explaining Methods in Java - Concept File
public class MethodsConcept {
    // Simple method with return type
    static int add(int a, int b) {
        return a + b;
    }

    // Method without return type
    static void greet() {
        System.out.println("Hello, welcome to Methods in Java!");
    }

    // Method with parameters and logic
    static int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        greet();
        System.out.println("Addition: " + add(5, 10));
        System.out.println("Multiplication: " + multiply(4, 7));
    }
}
