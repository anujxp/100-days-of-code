// FileName: WhileLoopExplained.java
//
// This file demonstrates the 'while' loop.
// A 'while' loop is used when you don't know the exact number of iterations beforehand.
// It continues to execute as long as its condition remains true.
// Syntax: while (condition) { ... }
// Real-world analogy: "Keep drinking water while you are thirsty."

import java.util.Scanner;
import java.util.Random;

public class WhileLoopExplained {

    public static void main(String[] args) {

        System.out.println("--- Welcome to the Number Guessing Game! ---");
        System.out.println("I'm thinking of a number between 1 and 20.");
        
        // Setup the game
        Random random = new Random();
        int secretNumber = random.nextInt(20) + 1; // Generates a random number between 1 and 20
        int userGuess = 0; // Initialize with a value that won't match the secret number
        int attempts = 0;
        
        Scanner scanner = new Scanner(System.in);

        // The 'while' loop starts here.
        // The condition 'userGuess != secretNumber' is checked BEFORE each iteration.
        // As long as the user's guess is NOT the secret number, the loop will continue.
        while (userGuess != secretNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++; // Increment the attempt counter inside the loop

            if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
            }
            // If the guess is correct, the loop condition (userGuess != secretNumber) will become false,
            // and the loop will terminate naturally.
        }
        
        // This code runs only after the loop has finished.
        System.out.println("\nCongratulations! You've guessed the number!");
        System.out.println("The secret number was: " + secretNumber);
        System.out.println("It took you " + attempts + " attempts.");
        
        scanner.close(); // Good practice to close the scanner
    }
}