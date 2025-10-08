// Demonstrating that arrays are reference types in Java

public class ArrayReferenceExample {
    public static void main(String[] args) {
        int[] original = {10, 20, 30};
        int[] copy = original; // Both refer to the same array object

        copy[1] = 99;

        System.out.println("Original array after modification:");
        for (int num : original) {
            System.out.print(num + " ");
        }
    }
}