/*
How the Call Stack Works in Recursion :
---------------------------------------
-- When a recursive function is called, a new frame is added (pushed) to the top of the call stack, containing the 
   function's parameters and local variables for that specific call.
-- If the function calls itself again (recursively), another frame is pushed on top, repeating this process until the 
   base case is reached.
-- Once the base case is hit, the function stops calling itself and begins returning a value.
-- As each function finishes, its frame is popped off the stack, and control returns to the previous function call, continuing 
   from where it left off.
-- The stack always works on a Last-In-First-Out (LIFO) principle.
*/

// Recursion Framework :

// 1. Define the recursive function with the parameters
void recursiveFunction(parameters) {
    // 2. Base case: when to stop
    if (stoppage condition) {
        // Do something (return a result/save a path, etc.)
        return;
    }
    
    // 3. Main logic: try all options/choices
    for (all possible options) {
        // Make a choice (e.g., add element to current path)
        
        // Recurse with the new state/updated parameters
        recursiveFunction(updated parameters);
        
        // Backtrack (undo the choice if needed)
    }
}
