package Day06_Arrays_Algorithms;
// LeetCode 1 — Two Sum
// Technique: Hash map for O(n) time

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class LC_001_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target))); // [0,1]
    }
}
