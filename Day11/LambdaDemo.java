// LambdaDemo.java
// Demonstrates lambda expressions for functional interfaces
// Run: javac LambdaDemo.java && java LambdaDemo

import java.util.Arrays;
import java.util.Comparator;

@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        System.out.println("=== Lambda Demo ===");

        // Calculator as lambda (addition)
        Calculator add = (a, b) -> a + b;
        Calculator mul = (a, b) -> a * b;

        System.out.println("5 + 3 = " + add.compute(5, 3));
        System.out.println("5 * 3 = " + mul.compute(5, 3));

        // Runnable using lambda (concise)
        Runnable r = () -> System.out.println("Running via lambda Runnable.");
        new Thread(r).start();

        // Lambda with Collections: sort strings by length
        String[] fruits = {"apple", "kiwi", "banana", "fig"};
        Arrays.sort(fruits, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("Sorted by length: " + Arrays.toString(fruits));
    }
}
