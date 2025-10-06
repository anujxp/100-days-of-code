package decision;
import java.util.Scanner;

public class DecisionMakingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 85) {
            System.out.println("Grade: A (Excellent!)");
        } else if (marks >= 60) {
            System.out.println("Grade: B (Good Job!)");
        } else if (marks >= 40) {
            System.out.println("Grade: C (Keep Improving)");
        } else {
            System.out.println("Grade: F (Better Luck Next Time)");
        }

        sc.close();
    }
}
