/*
1 
1 2 
3 5 8 
13 21 34 55 
89 144 233 377 610 
*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int count = 0; int a = 0; int b = 1;
        
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if(i >= j) {
                    if(count == 0) {
                        System.out.print("1 ");
                        count++;
                    } else {
                        int sum = a + b;
                        System.out.print(sum + " ");
                        a = b;
                        b = sum;
                    }
                } else {
                    System.out.print("  ");
                }
            } 
            System.out.println();
        }
    } // TC : O(n * n), SC : O(1)
} // TC : O(n * n), SC : O(1)
