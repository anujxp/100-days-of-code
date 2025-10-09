package Day06_Arrays_Algorithms;

// LeetCode 34 — Find First and Last Position of Element in Sorted Array
// Technique: Binary search for left and right boundaries

import java.util.Arrays;

public class LC_034_FindFirstLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        return new int[] { findBound(nums, target, true), findBound(nums, target, false) };
    }

    private static int findBound(int[] nums, int target, boolean left) {
        int l = 0, r = nums.length - 1, ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                ans = m;
                if (left) r = m - 1;
                else l = m + 1;
            } else if (nums[m] < target) l = m + 1;
            else r = m - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 8))); // [3,4]
    }
}