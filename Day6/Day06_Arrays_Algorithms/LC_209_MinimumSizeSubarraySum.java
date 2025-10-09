package Day06_Arrays_Algorithms;

// LeetCode 209 — Minimum Size Subarray Sum
// Technique: Sliding window (two pointers)

public class LC_209_MinimumSizeSubarraySum {
    public static int minSubArrayLen(int s, int[] nums) {
        int n = nums.length, min = Integer.MAX_VALUE, left = 0, sum = 0;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum >= s) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, nums)); // 2 (subarray [4,3])
    }
}