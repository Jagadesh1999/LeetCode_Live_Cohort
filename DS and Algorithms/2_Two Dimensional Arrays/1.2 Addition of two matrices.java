// Can only be performed if both matrices have the sime dimension.

public class MatrixAddition {
    public static void main(String[] args) {

        // Define two matrices with the same dimensions
        int[][] matrixA = {{1, 2, 3}, 
                           {4, 5, 6}};

        int[][] matrixB = {{7, 8, 9}, 
                           {10, 11, 12}};

        // Get dimensions
        int rows = matrixA.length;
        int columns = matrixA[0].length;

        // Create a result matrix to store the sum
        int[][] result = new int[rows][columns];

        // Perform element-wise addition using nested loops
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
                // For subtraction of 2 matrices : result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        // Print the result matrix
        System.out.println("Result of Matrix Addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // Move to the next line
        }
    }
} // TC : O(n ^ 2), SC : O(n ^ 2)
