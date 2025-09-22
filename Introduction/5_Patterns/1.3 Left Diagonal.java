// Left Diagonal of a matrix

import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
		    for(int j = 0; j < num; j++) {
		        if(i == j) {
		            System.out.print("* ");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
		
	}
} // TC : O(n * n), SC : O(1)
