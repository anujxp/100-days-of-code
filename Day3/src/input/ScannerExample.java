package input;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age (int): ");
        int age = sc.nextInt();

        System.out.print("Enter your height (float): ");
        float height = sc.nextFloat();

        sc.nextLine(); // consume newline

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " ft");

        sc.close();
    }
}

