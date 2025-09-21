import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        
        int gcd = 1;
        for(int i = 1; i * i <= Math.min(num_1, num_2); i++) {
            if(num_1 % i == 0 && num_2 % i == 0) {
                gcd = i;
            }
        } // TC : O(sqrt(min(num_1, num_2)))
        
        int lcm = 0;
        for(int i = Math.max(num_1, num_2); i <= num_1 * num_2; i++) {
            if(i % num_1 == 0 && i % num_2 == 0) {
                lcm = i;
                break;
            }
        } // TC : O(num_1 * num_2)
        
        System.out.println("GCD : " + gcd);
        System.out.println("LCM : " + lcm);
    }
}
