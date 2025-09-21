// 1. Printing the output in Java
public class Main
{
	public static void main(String[] args) {
	  System.out.println("I love Chocolates");
		System.out.println("Hello World");
	}
}

// 2. Taking the input in Java
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num_1 = sc.nextInt();
	    int num_2 = sc.nextInt();
	    int num_3 = sc.nextInt();
	    
	    double average = (num_1 + num_2 + num_3) / 3;
	    
	    System.out.println("Average of the numbers is " + average);
	    
	    // For character :
	    // char ch = sc.nect().charAt(0);
	    // System.out.println(ch);
	    
	    // For strings :
	    // String name = sc.nextLine();
	    // System.out.println(name);
	    // (nextLine() is especially useful for reading input containing spaces, like sentences or names)
	}
}

