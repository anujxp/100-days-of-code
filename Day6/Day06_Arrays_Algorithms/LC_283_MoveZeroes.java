package Day06_Arrays_Algorithms;

// LeetCode 283 — Move Zeroes
// Technique: Two pointers (fast-slow) to move non-zero elements forward

import java.util.Arrays;

public class LC_283_MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int j = 0; // position to place next non-zero
        // Copy non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) nums[j++] = nums[i];
        }
        // Fill the rest with zeros
        while (j < nums.length) nums[j++] = 0;
    }

    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        moveZeroes(a);
        System.out.println(Arrays.toString(a)); // [1,3,12,0,0]
    }
}