/*
Algorithm :
Observation - (The starting element of each row and the ending element of each column hold one diagonal each. Hence total diagonals = m + n - 1)
*/
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // Handle empty or invalid input immediately
        if (mat == null || mat.length == 0 || mat[0].length == 0) return new int[0];

        int[] result = new int[mat.length * mat[0].length];
        int resIndex = 0;

        // This flag tracks the direction. true for Up-Right, false for Down-Left.
        // The first diagonal is the 0th diagonal, which should be  Up-Right.
        boolean upDirection = true; // Use a boolean to alternate direction

        for(int k = 0; k < mat.length; k++) {
            int i = k;
            int j = 0;

            List<Integer> currentDiagonal = new ArrayList<>();

            while(i >= 0 && j < mat[0].length) { // Know the reason behind the while loop condition
                currentDiagonal.add(mat[i][j]);
                i = i - 1;
                j = j + 1;
            }

            // Apply ZIG-ZAG pattern: Reverse the list if the current diagonal if needed.
            if (!upDirection) {
                Collections.reverse(currentDiagonal);
            }

            // Add it to the resultant array
            for(int val : currentDiagonal) {
                result[resIndex] = val;
                resIndex++;
            }

            // Flip the boolean
            upDirection = !upDirection;
        }

        for(int k = 1; k < mat[0].length; k++) {
            int i = mat.length - 1;
            int j = k;

            List<Integer> currentDiagonal = new ArrayList<>();

            while(j < mat[0].length && i >= 0) { // Know the reason behind the loop condition
                currentDiagonal.add(mat[i][j]);
                i = i - 1;
                j = j + 1;
            }
            
            // Apply ZIG-ZAG pattern: Reverse the list if the current diagonal if needed.
            if (!upDirection) {
                Collections.reverse(currentDiagonal);
            }

            // Add it to the resultant array
            for(int val : currentDiagonal) {
                result[resIndex] = val;
                resIndex++;
            }

            // Flip the boolean
            upDirection = !upDirection;
        }
        return result;
    }
} // TC : O(m * n), SC : O(m * n)
