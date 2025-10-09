// SlidingWindowExamples.java
// Demonstrates fixed-size sliding window (max sum of k consecutive) and variable-size sliding window (min length with sum >= S)

import java.util.Arrays;

public class SlidingWindowExamples {
    // Fixed-size window: max sum of k consecutive elements
    public static int maxSumK(int[] arr, int k) {
        if (arr.length < k) return Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < k; i++) sum += arr[i];
        int max = sum;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }
        return max;
    }

    // Variable-size window: minimum length subarray with sum >= s (returns 0 if none)
    public static int minSubArrayLen(int s, int[] nums) {
        int left = 0, sum = 0, min = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= s) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        System.out.println("--- Sliding Window Examples ---");
        int[] a = {2,1,5,2,3,2};
        System.out.println("Array: " + Arrays.toString(a));
        System.out.println("maxSumK k=3 -> " + maxSumK(a,3)); // expected 10 (5+2+3)

        int[] b = {2,3,1,2,4,3};
        System.out.println("Array: " + Arrays.toString(b));
        System.out.println("minSubArrayLen s=7 -> " + minSubArrayLen(7,b)); // expected 2 ([4,3])
    }
}
