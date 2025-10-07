// FileName: ForLoopExplained.java
//
// This file provides a comprehensive demonstration of the 'for' loop in Java.
// The 'for' loop is ideal when you know exactly how many times you want to iterate.
// Syntax: for (initialization; condition; increment/decrement) { ... }

public class ForLoopExplained {

    public static void main(String[] args) {
        
        System.out.println("--- 1. Basic 'for' Loop: Counting from 1 to 5 ---");
        // This is the most common use of a 'for' loop.
        // 1. Initialization: 'int i = 1' runs once at the very beginning. It declares our counter 'i'.
        // 2. Condition: 'i <= 5' is checked BEFORE each iteration. If it's true, the loop body runs.
        // 3. Increment: 'i++' runs AFTER each iteration. It increases the counter.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Current count is: " + i);
        }
        System.out.println("Basic 'for' loop finished!\n");

        // ---

        System.out.println("--- 2. 'for' Loop: Counting Down from 10 to 1 ---");
        // We can also decrement the counter.
        // Here, we start at 10 and go down as long as 'i' is greater than 0.
        for (int i = 10; i > 0; i--) {
            System.out.println("Time remaining: " + i);
        }
        System.out.println("Liftoff! 🚀\n");

        // ---

        System.out.println("--- 3. 'for' Loop: Skipping Numbers (e.g., printing even numbers) ---");
        // The increment part can be anything, not just '++'.
        // Here, 'i += 2' increments 'i' by 2 in each step.
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even number found: " + i);
        }
        System.out.println("Even number scan complete!\n");

        // ---

        System.out.println("--- 4. 'for' Loop: Calculating a Sum ---");
        // A 'for' loop is excellent for accumulating values.
        int totalSum = 0;
        int maxNumber = 100; // Let's sum numbers from 1 to 100
        
        // The loop will run 100 times, adding the current value of 'i' to 'totalSum'.
        for (int i = 1; i <= maxNumber; i++) {
            totalSum = totalSum + i; // or shorthand: totalSum += i;
            System.out.println("Added " + i + ", current sum is: " + totalSum);
        }
        System.out.println("\nFinal Sum of numbers from 1 to " + maxNumber + " is: " + totalSum);
    }
}