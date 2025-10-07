// FileName: NestedLoopsExplained.java
//
// This file demonstrates nested loops, which is a loop inside another loop.
// This is useful for working with two-dimensional data or creating patterns.
// Analogy: A clock. For every hour (outer loop), you go through 60 minutes (inner loop).

public class NestedLoopsExplained {

    public static void main(String[] args) {

        System.out.println("--- 1. Generating a Simple 2D Coordinate System ---");
        // The outer loop controls the rows (Y-axis)
        for (int y = 1; y <= 3; y++) {
            // The inner loop controls the columns (X-axis)
            // For EACH single iteration of the outer loop, the inner loop completes its ENTIRE run.
            for (int x = 1; x <= 4; x++) {
                // The print() method doesn't add a new line, keeping output on the same line.
                System.out.print("(" + x + ", " + y + ") "); 
            }
            // After the inner loop finishes, we print a new line to move to the next row.
            System.out.println(); 
        }
        System.out.println("Coordinate system generated.\n");

        // ---

        System.out.println("--- 2. Generating a Multiplication Table (1 to 10) ---");
        int tableSize = 10;
        
        // Print header row
        System.out.print("X |");
        for(int i = 1; i <= tableSize; i++) {
            System.out.printf("%4d", i); // printf for formatted output
        }
        System.out.println("\n--+----------------------------------------");

        // Outer loop for the rows of the table
        for (int i = 1; i <= tableSize; i++) {
            System.out.printf("%-2d|", i); // Print row header
            
            // Inner loop for the columns of the table
            // It calculates and prints the product of the outer loop's 'i' and inner loop's 'j'.
            for (int j = 1; j <= tableSize; j++) {
                // We use printf to format the output nicely in columns.
                // "%4d" means "print the integer in a space of 4 characters".
                System.out.printf("%4d", i * j);
            }
            // Move to the next line after completing a row
            System.out.println();
        }
        System.out.println("\nMultiplication table complete! 🔢");
    }
}