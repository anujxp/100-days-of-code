// DPExamples.java
// Simple dynamic programming examples: Kadane's algorithm and Fibonacci (bottom-up) for clarity.

import java.util.Arrays;

public class DPExamples {
    // Kadane's algorithm: maximum subarray sum
    public static int maxSubArray(int[] nums) {
        int cur = nums[0], best = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cur = Math.max(nums[i], cur + nums[i]);
            best = Math.max(best, cur);
        }
        return best;
    }

    // Fibonacci bottom-up as DP example (array)
    public static int fib(int n) {
        if (n <= 1) return n;
        int[] dp = new int[n+1];
        dp[0] = 0; dp[1] = 1;
        for (int i = 2; i <= n; i++) dp[i] = dp[i-1] + dp[i-2];
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println("--- DP Examples ---");
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("maxSubArray -> " + maxSubArray(arr)); // 6
        System.out.println("fib(10) -> " + fib(10)); // 55
    }
}
