import java.io.*;
import java.util.*;

public class Main
{
	public static void solve(int[] nums_1, int[] nums_2) {
	    List<Integer> list_1 = new ArrayList<>();
	    for(int digit : nums_1) {
	        list_1.add(digit);
	    }
	    
	    List<Integer> list_2 = new ArrayList<>();
	    for(int digit : nums_2) {
	        list_2.add(digit);
	    }
	    
	    // Padding to handle the differences
	    while(list_2.size() < list_1.size()) {
	        list_2.add(0, 0); // Adding 0 at the the index '0'
	    }
	    
	    int[] resultArray = new int[list_1.size()];
	    int borrow = 0;
	    
	    for(int i = list_1.size()-1; i >= 0; i--) {
	        int digit_1 = list_1.get(i);
	        int digit_2 = list_2.get(i);
	        
	        int difference = digit_1 - digit_2 - borrow;
	        
	        if(difference < 0) {
	            difference += 10;
	            borrow = 1;
	        } else {
	            borrow = 0;
	        }
	        
	        resultArray[i] = difference;
	    }
        // Removing the leading zeroes
        int firstNonZeroIndex = 0;
        while(firstNonZeroIndex < resultArray.length - 1 && resultArray[firstNonZeroIndex] == 0) {
            firstNonZeroIndex++;
        }
        
        // Print the output
        for(int i = firstNonZeroIndex; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
	} // TC : O(n), SC : O(1)
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int size_1 = sc.nextInt();
	    
	    int[] nums_1 = new int[size_1];
	    for(int i = 0; i < size_1; i++) {
	        nums_1[i] = sc.nextInt();
	    }
	    
	    int size_2 = sc.nextInt();
	    
	    int[] nums_2 = new int[size_2];
	    for(int i = 0; i < size_2; i++) {
	        nums_2[i] = sc.nextInt();
	    }
	    
	    solve(nums_1, nums_2);
	}
} 
