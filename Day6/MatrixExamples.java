// MatrixExamples.java
// Matrix techniques: search in sorted matrix (start top-right), basic traversal, transpose example.

import java.util.Arrays;

public class MatrixExamples {
    // Search in a matrix where rows and columns are sorted (LeetCode 240 style)
    public static boolean searchMatrix(int[][] mat, int target) {
        if (mat == null || mat.length==0) return false;
        int r = 0, c = mat[0].length - 1;
        while (r < mat.length && c >= 0) {
            int v = mat[r][c];
            if (v == target) return true;
            if (v > target) c--;
            else r++;
        }
        return false;
    }

    // Transpose a square matrix in-place
    public static void transposeInPlace(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int tmp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Matrix Examples ---");
        int[][] mat = {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24}
        };
        System.out.println("searchMatrix target=8 -> " + searchMatrix(mat,8));
        System.out.println("searchMatrix target=20 -> " + searchMatrix(mat,20));

        int[][] sq = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("Original square:\n" + Arrays.deepToString(sq));
        transposeInPlace(sq);
        System.out.println("Transposed:\n" + Arrays.deepToString(sq));
    }
}
