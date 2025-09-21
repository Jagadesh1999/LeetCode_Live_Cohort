// 1. Check if positive, negative or zero
public class CheckPositiveOrNegative
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    
	    if(num > 0) System.out.println("Positive");
	    else if(num < 0) System.out.println("Negative");
	    else System.out.println("Zero");
	}
} // TC : O(1), SC : O(1)
