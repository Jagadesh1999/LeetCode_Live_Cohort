import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int k = scn.nextInt();

        // Counting the total digits
        int len = 0;
        int temp = num;
        
        while(temp != 0) {
            temp /= 10;
            len++;
        }
        
        // Normalise k value
        k = (k + len) % len;
        
        // Find 10^k and 10^len-k
        int divisor = (int)Math.pow(10,k);
        int mul = (int)Math.pow(10,len-k);
        
        int rem = num % divisor;
        int quo = num / divisor;
        
        int rotatedNumber = rem * mul + quo;

        System.out.println("Rotated number is " + rotatedNumber);
    }
} // TC : O(digits), SC : O(1)
