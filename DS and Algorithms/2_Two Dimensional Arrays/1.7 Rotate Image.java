class Solution {
    public void rotate(int[][] matrix) {
        int N = matrix.length;

        // 1. Transpose the matrix
        // We iterate only over the upper triangle (j >= i) to avoid double-swapping.
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) { // Remember the reasoning behind this condition
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // 2. Reverse each row of the matrix (imp : the framework actually differs for a matrix)
        // This is done using a two-pointer approach (left and right).
        for (int i = 0; i < N; i++) {
            int left = 0;
            int right = N - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
        return matrix;
    }
} // TC : O(n^2)
