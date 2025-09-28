import java.io.*;
import java.util.*;

// Framework : Right to Left with the carry
public class Main
{
	public static void solve(int[] nums_1, int[] nums_2) {
	    List <Integer> resultList = new ArrayList<>();
	    
	    int i = nums_1.length - 1;
	    int j = nums_2.length - 1;
	    int carry = 0;
	    
	    while(i >= 0 || j >= 0 || carry > 0) {
	        int sum = carry;
	        
	        if (i >= 0) {
                sum += nums_1[i];
                i--;
            }

            if (j >= 0) {
                sum += nums_2[j];
                j--;
            }
            
            // The new digit is sum % 10;
            resultList.add(sum % 10);
            
            // The quotient is the new carry
            carry = sum / 10;
	    }
	    
	    Collections.reverse(resultList); // Most important
	    
	    // Convert the List to an int array and return
        int[] resultNums = new int[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            resultNums[k] = resultList.get(k);
        }
        
        // Convert digits to single integer
        // long result = 0;
        // for (int digit : resultNums) {
        //     result = result * 10 + digit;
        // }

        for(int l = 0; l < resultNums.length; l++) {
	       System.out.print(resultNums[l] + " ");
	    }
        
	} // TC : O(n), SC : O(n)
	
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
