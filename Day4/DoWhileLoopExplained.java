// FileName: DoWhileLoopExplained.java
//
// This file demonstrates the 'do-while' loop.
// The 'do-while' loop is a variant of the 'while' loop where the loop body
// is guaranteed to execute AT LEAST ONCE.
// The condition is checked *after* the loop body runs.
// Syntax: do { ... } while (condition);

import java.util.Scanner;

public class DoWhileLoopExplained {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // The 'do' block starts here. Everything inside it will run once, guaranteed.
        do {
            // Display the menu
            System.out.println("\n--- Simple Menu System ---");
            System.out.println("1. Print Hello World");
            System.out.println("2. Tell a Joke");
            System.out.println("3. Calculate Square of a Number");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice: ");

            choice = scanner.nextInt();

            // Use a switch statement to handle the user's choice
            switch (choice) {
                case 1:
                    System.out.println("\nHello World! 🌍");
                    break;
                case 2:
                    System.out.println("\nWhy don't scientists trust atoms? Because they make up everything!");
                    break;
                case 3:
                    System.out.print("Enter a number to square: ");
                    int number = scanner.nextInt();
                    System.out.println("The square of " + number + " is " + (number * number));
                    break;
                case 4:
                    System.out.println("\nExiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("\nInvalid choice! Please select an option from 1 to 4.");
                    break;
            }

        // The 'while' condition is checked here, at the end of the iteration.
        // As long as the user has not chosen option 4, the loop will repeat.
        } while (choice != 4);

        scanner.close();
    }
}