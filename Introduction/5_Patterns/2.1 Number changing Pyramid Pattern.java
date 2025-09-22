/* 2.1 Number changing Pyramid Pattern (Zero - One Triangle Pattern)

0         
1 0       
0 1 0     
1 0 1 0   
0 1 0 1 0 
*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if(i >= j) {
                    if((i + j) % 2 == 0) {
                        System.out.print("0 ");
                    } else {
                        System.out.print("1 ");
                    }
                } else {
                    System.out.print("  ");
                }
            } 
            System.out.println();
        }
    }
} // TC : O(n * n), SC : O(1)

