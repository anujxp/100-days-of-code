package Day06_Arrays_Algorithms;

// LeetCode 240 — Search a 2D Matrix II
// Technique: Start from top-right and move left/down (matrix two-pointer)

public class LC_240_SearchA2DMatrixII {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int r = 0, c = matrix[0].length - 1; // Start at top-right corner
        while (r < matrix.length && c >= 0) {
            int v = matrix[r][c];
            if (v == target) return true;
            if (v > target) c--; // Current value is too large, move left
            else r++; // Current value is too small, move down
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30}
        };
        System.out.println(searchMatrix(mat, 5)); // true
        System.out.println(searchMatrix(mat, 20)); // false
    }
}