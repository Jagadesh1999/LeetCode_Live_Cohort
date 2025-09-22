/*
    
    N = 5,
    
    0 1 2 3 4 5 6 7 8 
    
0           *
1         *   *
2       *       *
3     *           *
4   *               *
5     *           *
6       *       *
7         *   *
8           *

   My input number is 5, the canvas size is 9 * 9 which is, (2 * number) - 1.
    Hence, my outer and inner loop ranges are(0, (2 * number) - 2)
    
    Composition of lines concept :
    ------------------------------
    (1) Left Top Diagonal (/) :
    i + j = c;
    
    Let's take (0,4)
    0 + number - 1 = c;
    c = number - 1;
    
    The equation is, i + j = number - 1;
    
    (2) Left Bottom Diagonal (\) :
    i = j + c;
    
    Let's take (7,3)
    2n - 3 = n - 2 + c;
    c = 2n - 3 - n + 2;
    c = n - 1
    
    The equation is, i = j + number - 1;
    
    (3) Right Top Diagonal (\) :
    i = j + c;
    
    Let's take (2,6)
    number - 3 = number + 1 + c;
    c = -4; (4 is number - 1, Hence -4 is -(number - 1). Hence, it becomes -number + 1)
    
    The equation is, i = j - number + 1;
    
    (4) Right Bottom Diagonal (/) :
    i + j = c;
    
    Let's take(7,5)
    2n - 3 + n = c;
    c = 3n - 3;
    
    The equation is, i + j = (3 * number) - 3;
    
    Think about one more variation, that is, filling the above boundary with stars.
                *             
              * * *           
            * * * * *         
          * * * * * * *       
        * * * * * * * * *     
      * * * * * * * * * * *   
    * * * * * * * * * * * * * 
      * * * * * * * * * * *   
        * * * * * * * * *     
          * * * * * * *       
            * * * * *         
              * * *           
                *      
                
    -- Use 'or' between conditions for composition of lines.
    -- Use 'and' between conditions for composition of portion between lines.
    */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < 2 * num - 1; i++) {
            for(int j = 0; j < 2 * num - 1; j++) {
                if((i + j >= num - 1) && (i <= j + num - 1) && (i >= j - num + 1) && (i + j <= (3 * num) - 3)) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    } // TC : O(n * n), SC : O(1)
