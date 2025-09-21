import java.util.*;
class CheckPrimesTillN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // Edge Case :
        if(num == 1) {
            System.out.println("1 is neither Prime nor Composite");
            return;
        }
        
        boolean isPrime = true;

        for(int i = 2; i <= num; i++) {
            // for(int j = 2; j < num; j++){
            //     if(num % j == 0){
            //         isPrime = false;
            //         break;
            //     }
            // }
    
            // 64 -> 1*64, 2*32, 4*16, 8*8, 16*4 
            for(int j = 2; j * j <= num; j++){ // i <= root(num) = i*i <= num
                if(num % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime == true){
                System.out.println(i + " is a prime number.");
            } else {
                System.out.println(i + " is not a prime number.");
            }
        }
    }
} // TC : O(n * n), SC : O(1)
