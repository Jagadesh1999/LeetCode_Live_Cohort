import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        
        // int gcd = 1;
        // for(int i = 1; i * i <= Math.min(num_1, num_2); i++) {
        //     if(num_1 % i == 0 && num_2 % i == 0) {
        //         gcd = i;
        //     }
        // } // TC : O(sqrt(min(num_1, num_2)))
        
        // int lcm = 0;
        // for(int i = Math.max(num_1, num_2); i <= num_1 * num_2; i++) {
        //     if(i % num_1 == 0 && i % num_2 == 0) {
        //         lcm = i;
        //         break;
        //     }
        // } // TC : O(num_1 * num_2)
        
        // The Euclidean algorithm is an efficient way to compute the HCF:
        // -- Repeatedly divide the larger number by the smaller number and replace the larger number by the smaller number and the smaller number by the remainder.
        // -- When the remainder becomes zero, the divisor at that step is the HCF.
        
        if(num_2 > num_1) {
            int temp = num_1;
            num_1 = num_2;
            num_2 = temp;
        }
        
        int temp_1 = num_1; int temp_2 = num_2;
        
        while(num_2 != 0) {
            int remainder = num_1 % num_2;
            num_1 = num_2;
            num_2 = remainder;
        }
        
        int gcd = num_1;
        int lcm = (temp_1 * temp_2) / gcd;
        
        System.out.println("GCD : " + gcd);
        System.out.println("LCM : " + lcm);
    }
} // TC : O(log(min(a,b))), SC : O(1)
