/*
Observation - (The starting element of each row and the ending element of each column hold one diagonal each. Hence total diagonals = m + n - 1)
*/
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        for(int k = 0; k < mat.length; k++) {
            int i = k;
            int j = 0;

            while(i >= 0 && j < mat[0].length) { // Know the reason behind the while loop condition
                System.out.print(mat[i][j]);
                i = i - 1;
                j = j + 1;
            }
            System.out.println();
        }

        for(int k = 1; k < mat[0].length; k++) {
            int i = mat.length - 1;
            int j = k;

            while(j < mat[0].length && i >= 0) { // Know the reason behind the while loop condition
                System.out.print(mat[i][j]);
                i = i - 1;
                j = j + 1;
            }
            System.out.println();
        }
    }
} // TC : O(m * n), SC : O(1)
