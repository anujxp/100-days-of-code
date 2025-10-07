// FileName: BreakAndContinueExplained.java
//
// This file demonstrates how to use the 'break' and 'continue' statements
// to control the flow within a loop.
//
// 'continue': Skips the rest of the current iteration and proceeds to the next one.
// 'break':    Immediately terminates the entire loop and proceeds to the code after it.

public class BreakAndContinueExplained {

    public static void main(String[] args) {

        System.out.println("--- Using 'continue' to skip even numbers ---");
        System.out.println("This loop will process numbers from 1 to 10 but will skip printing the even ones.");
        
        for (int i = 1; i <= 10; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                // If 'i' is even, the 'continue' statement is executed.
                // This immediately stops the current iteration and jumps to the next one (i++).
                // The System.out.println below will not be executed for even numbers.
                continue; 
            }
            // This line only runs for odd numbers
            System.out.println("Processing odd number: " + i);
        }
        System.out.println("'continue' demonstration finished.\n");
        
        // ---

        System.out.println("--- Using 'break' to find the first number divisible by 7 ---");
        System.out.println("This loop will search for the first number divisible by 7 between 1 and 100.");
        
        int foundNumber = -1; // Initialize with a default value

        for (int i = 1; i <= 100; i++) {
            System.out.println("Checking number: " + i);
            
            // Check if 'i' is divisible by 7
            if (i % 7 == 0) {
                foundNumber = i;
                // We found what we were looking for!
                // The 'break' statement immediately exits the 'for' loop.
                // There is no need to check the rest of the numbers up to 100.
                System.out.println("Found a number divisible by 7! It's " + foundNumber + ". Breaking the loop.");
                break;
            }
        }
        
        System.out.println("\n'break' demonstration finished.");
        if (foundNumber != -1) {
            System.out.println("The search stopped. The first number found was: " + foundNumber);
        } else {
            System.out.println("No number divisible by 7 was found in the range.");
        }
    }
}