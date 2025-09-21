import java.util.*;

class Prime {
    public static void CheckPrime(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if(num == 1) {
            System.out.println("1 is neither Prime nor Composite");
            return;
        }
        
        boolean isPrime = true;

        // for(int i = 2; i < num; i++){
        //     if(num % i == 0){
        //         isPrime = false;
        //         break;
        //     }
        // }

        // 64 -> 1*64, 2*32, 4*16, 8*8, 16*4 
        for(int i = 2; i*i <= num; i++){ // i <= root(num) = i*i <= num
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime == true){
            System.out.println("This is a prime number.");
        } else {
            System.out.println("This is not a prime number.");
        }
    }
} // TC : O(sqrt(n)), SC : O(1)
