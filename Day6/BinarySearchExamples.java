// BinarySearchExamples.java
// Classic binary search and finding left/right boundaries in a sorted array.

import java.util.Arrays;

public class BinarySearchExamples {
    // Standard binary search (returns index or -1)
    public static int binarySearch(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) return m;
            if (nums[m] < target) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    // Find leftmost index >= target (lower_bound)
    public static int lowerBound(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] < target) l = m + 1;
            else r = m;
        }
        return l; // could be nums.length
    }

    public static void main(String[] args) {
        System.out.println("--- Binary Search Examples ---");
        int[] a = {1,2,4,4,5,7};
        System.out.println("Array: " + Arrays.toString(a));
        System.out.println("binarySearch(4) -> index " + binarySearch(a,4));
        System.out.println("lowerBound(4) -> " + lowerBound(a,4));
        System.out.println("lowerBound(6) -> " + lowerBound(a,6)); // first >=6 -> index of 7
    }
}
