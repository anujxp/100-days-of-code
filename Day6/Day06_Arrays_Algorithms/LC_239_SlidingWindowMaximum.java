package Day06_Arrays_Algorithms;

// LeetCode 239 — Sliding Window Maximum
// Technique: Deque to keep indices of useful elements (monotonic queue)

import java.util.*;

public class LC_239_SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];
        int n = nums.length;
        int[] res = new int[n - k + 1];
        // Deque stores indices
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            // Remove indices outside the window [i-k+1, i] from the front
            while (!dq.isEmpty() && dq.peekFirst() < i - k + 1) dq.pollFirst();
            // Remove indices of smaller elements from the back
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) dq.pollLast();
            
            dq.offerLast(i); // Add current index
            
            // The maximum element is always at the front of the deque
            if (i >= k - 1) res[i - k + 1] = nums[dq.peekFirst()];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] out = maxSlidingWindow(nums, 3);
        System.out.println(Arrays.toString(out)); // [3,3,5,5,6,7]
    }
}