    /*
    0 1 2 3 4
    
0       *
1       *
2   * * * * *
3       *
4       *
    
    Composition of lines concept :
    ------------------------------
    But for the above lines, equation is j = c for vertical line and i = c for horizontal line.
    
    Vertical line :
    j = c;
    2 = c; (In the above problem considering 5 as the input number, j = 2)
    
    So, j = number / 2;
    
    Horizontal line :
    i = c;
    2 = c;
    
    So, i = number / 2;
    
    If either of these conditions are true, stars should be printed.
    */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if((i == num / 2) || (j == num / 2)) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    } // TC : O(n * n), SC : O(1)


   /*
    0 1 2 3 4
    
0   *       *
1     *   *
2       *
3     *   *
4   *       *
    
    Composition of lines concept :
    ------------------------------
    Left to right diagonal :
    i = j + c;
    0 = 0 + c;
    c = 0;
    
    The equation is, i = j
    
    Right to left diagonal :
    i + j = c;
    0 + 4 = c;
    c = 4;
    
    The equation is i + j = number - 1;
    
    If either of these conditions are true, stars should be printed.
    */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if((i + j == num-1) || (i == j)) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    } // TC : O(n * n), SC : O(1)
