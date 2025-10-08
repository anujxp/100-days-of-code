// ArrayTraversal.java
// Traversing arrays using for, enhanced for, and while loops

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] nums = {5, 10, 15, 20};

        System.out.println("Classic for-loop:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("index " + i + " -> " + nums[i]);
        }

        System.out.println("\nEnhanced for-loop:");
        for (int value : nums) {
            System.out.println("value -> " + value);
        }

        System.out.println("\nWhile loop:");
        int i = 0;
        while (i < nums.length) {
            System.out.println("nums[" + i + "] = " + nums[i]);
            i++;
        }
    }
}
