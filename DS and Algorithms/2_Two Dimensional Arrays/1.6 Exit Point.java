// Framework :

// State Variables (The Core four) :
// 1. Row Index (i)
// 2. Column Index (j)
// 3. Direction Pointer (d): An integer representing the four cardinal directions 
//    (e.g., 0 for right, 1 for down, 2 for left, 3 for up).
// 4. Direction Vectors (Δi,Δj): Arrays or lists that map the direction pointer d to the corresponding change in 
//    row and column indices.
    // Right (d=0): Δi=0,Δj=+1
    // Down (d=1): Δi=+1,Δj=0
    // Left (d=2): Δi=0,Δj=−1
    // Up (d=3): Δi=−1,Δj=0
    
// Simulation Loop:
// -- Start the loop at (i,j)=(0,0) and initial direction d=0 (Right).
// -- Inside the loop, check the value of matrix[i][j].

// Transition Logic (The Rules):
    // If matrix[i][j] == 0: 
        // You simply move one step in the current direction.
        // i=i+Δi[d]; j=j+Δj[d]

    // If matrix[i][j] == 1:
        // Change the direction: Turn right. This means updating the direction pointer: d=(d+1)(mod4).
        // Change the matrix value: Set matrix[i][j] = 0. This is crucial as it prevents an infinite loop where the path keeps hitting the same '1' and turning.
        // Move one step: i=i+Δi[d], j=j+Δj[d]. (Note: The move is in the new direction)


// Termination Condition:
    // The loop continues as long as the current position (i,j) is within the matrix boundaries 
    // Once the position moves out of bounds, the simulation stops. The final in-bounds cell before the exit gives the coordinates of the exit point.
    
class Solution {
    public int[] FindExitPoint(int n, int m, int[][] matrix) {
        // Direction Vectors: maps direction 'd' to {delta_i, delta_j}
        // d=0: Right (0, 1)
        // d=1: Down  (1, 0)
        // d=2: Left  (0, -1)
        // d=3: Up    (-1, 0)
        int[] di = {0, 1, 0, -1}; // Change in row index
        int[] dj = {1, 0, -1, 0}; // Change in column index
        
        // Initial State
        int i = 0; // Current row index
        int j = 0; // Current column index
        int d = 0; // Current direction (0: Right)
        
        // Store the coordinates of the last valid cell (the exit point)
        int lastI = 0;
        int lastJ = 0;
        
        while (i >= 0 && i < n && j >= 0 && j < m) {
            // Save the current (valid) position before updating it
            lastI = i;
            lastJ = j;
            
            // Check the cell content
            if (matrix[i][j] == 1) {
                // Rule: Change direction (turn right)
                d = (d + 1) % 4; // Use modulo 4 to cycle 0 -> 1 -> 2 -> 3 -> 0

                // Rule: Change the cell value from 1 to 0
                matrix[i][j] = 0;
            }
            
            // Move one step in the *current* direction (it might be a newly updated one)
            i = i + di[d];
            j = j + dj[d];
        }
        
        // Return the coordinates of the last valid cell before the boundary check failed
        return new int[]{lastI, lastJ};
        
    }
} // TC : O(n ^ 2)
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
