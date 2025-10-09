package Day06_Arrays_Algorithms;

// LeetCode 53 — Maximum Subarray (Kadane's algorithm)
// Technique: Sliding window / dynamic tracking of current sum

public class LC_053_MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cur = Math.max(nums[i], cur + nums[i]);
            maxSoFar = Math.max(maxSoFar, cur);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] n = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(n)); // 6 (subarray [4,-1,2,1])
    }
}