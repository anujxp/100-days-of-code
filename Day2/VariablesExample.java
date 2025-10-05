// VariablesExample.java
// Simple examples of declaring and using variables in Java

public class VariablesExample {
    public static void main(String[] args) {
        // integer variable
        int age = 21;

        // floating point
        double price = 199.99;

        // character and boolean
        char grade = 'A';
        boolean isActive = true;

        // reference type (String)
        String name = "Anuj";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade + "  Active: " + isActive);

        // reassigning variable
        age = 22;
        System.out.println("Updated age: " + age);
    }
}
