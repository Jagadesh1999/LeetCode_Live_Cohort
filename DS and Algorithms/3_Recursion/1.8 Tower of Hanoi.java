class Solution {
    // Assume 'from' tower is 1, to tower is 3, auxilliary tower is 2
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // Base case: If no disks to move, zero moves
        if (n == 0) {
            return 0;
        }
        
        // Step 1: Move top n-1 disks from 'from' rod to 'aux' rod using 'to' rod as auxiliary
        int moves1 = towerOfHanoi(n - 1, from, aux, to);
        
        // Step 2: Move nth disk from 'from' rod to 'to' rod (one move)
        System.out.println(Move nth disk from 'from' rod to 'to' rod (one move));
        int moves2 = 1;
        
        // Step 3: Move n-1 disks from 'aux' rod to 'to' rod using 'from' rod as auxiliary
        int moves3 = towerOfHanoi(n - 1, aux, to, from);
        
        // Total moves = moves in step 1 + 1 move in step 2 + moves in step 3
        return moves1 + moves2 + moves3;
    }
}

Dry run for n = 3 :

Call 1 (3, A, C, B) :
    if(3 == 0) - False
    moves1 = Call 2 (2, A, B, C) :
        if(2 == 0) - False
        moves1 = Call 3 (1, A, C, B) :
            if(1 == 0) - False :
            moves1 = Call 4 (0, A, B, C) :
                if(0 == 0) - True // returns 0
            System.out.println("Move disk 1 from rod A to rod C")
            moves2 = 1
            moves3 = Call 5 (0, B, C, A) :
                if(0 == 0) - True // returns 0
            return 1; (moves1 + moves2 + moves3)
        moves1 = 1
        System.out.println("Move disk 2 from rod A to rod B")
        moves2 = 1
        moves3 = Call 6 (1, C, B, A) :
            if(1 == 0) - False :
            moves1 = Call 7 (0, C, A, B) :
                if(0 == 0) - True // returns 0
            System.out.println("Move disk 1 from rod C to rod B")
            moves2 = 1
            moves3 = Call 8 (0, A, B, C) :
                if(0 == 0) - True // returns 0
            return 1;
        moves3 = 1
        return 3; (moves1 + moves2 + moves3)
    moves1 = 3
    System.out.println("Move disk 3 from rod A to rod C")
    moves2 = 1
    moves3 = Call 9 (2, B, C, A) :
        if(2 == 0) - False
        moves1 = Call 10 (1, B, A, C) :
            if(1 == 0) - False :
            moves1 = Call 11 (0, B, C, A) :
                if(0 == 0) - True // returns 0
            System.out.println("Move disk 1 from rod B to rod A")
            moves2 = 1
            moves3 = Call 12 (0, C, A, B) :
                if(0 == 0) - True // returns 0
            return 1;
        moves1 = 1
        System.out.println("Move disk 2 from rod B to rod C")
        moves2 = 1
        moves3 = Call 13 (1, A, C, B) :
            if(1 == 0) - False :
            moves1 = Call 14 (0, A, B, C) :
                if(0 == 0) - True // returns 0
            System.out.println("Move disk 1 from rod A to rod C")
            moves2 = 1
            moves3 = Call 15 (0, B, C, A) :
                if(0 == 0) - True // returns 0
            return 1;
        moves3 = 1
        return 3;
    moves3 = 3
    return 7; (moves1 + moves2 + moves3)
    
// TC : O(2^n), SC : O(n)
