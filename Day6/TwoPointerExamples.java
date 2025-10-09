

import java.util.Arrays;

public class TwoPointerExamples {
    // 1) Pair with target sum in a sorted array (two pointers from ends)
    public static int[] pairSumSorted(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int s = arr[l] + arr[r];
            if (s == target) return new int[]{l, r};
            if (s < target) l++;
            else r--;
        }
        return new int[]{-1, -1};
    }

    // 2) Reverse array in-place (two pointers moving inward)
    public static void reverseInPlace(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++; r--;
        }
    }

    // 3) Remove duplicates in-place from sorted array (slow-fast two pointers)
    // returns new length
    public static int removeDuplicatesSorted(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0; // slow pointer
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) nums[++j] = nums[i];
        }
        return j + 1;
    }

    public static void main(String[] args) {
        System.out.println("--- Two Pointer Examples ---");

        int[] sorted = {1,2,3,4,6,8};
        System.out.println("pairSumSorted([1,2,3,4,6,8], target=10) -> indices: " + Arrays.toString(pairSumSorted(sorted, 10)));

        int[] rev = {1,2,3,4,5};
        System.out.println("Original rev: " + Arrays.toString(rev));
        reverseInPlace(rev);
        System.out.println("Reversed: " + Arrays.toString(rev));

        int[] dup = {1,1,2,2,3,3,3,4};
        int newLen = removeDuplicatesSorted(dup);
        System.out.println("After remove duplicates, new length = " + newLen + ", array = " + Arrays.toString(Arrays.copyOf(dup, newLen)));
    }
}
