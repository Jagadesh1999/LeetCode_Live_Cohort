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

// 3. Shopping Cart
class ShoppingCart {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        // write your code here
        System.out.print("Enter the price of pen: ");
        int penPrice = scn.nextInt();
        System.out.println();

        System.out.print("Enter the price of pencil: ");
        int pencilPrice = scn.nextInt();
        System.out.println();

        System.out.print("Enter the price of notebook: ");
        int notebookPrice = scn.nextInt();
        System.out.println();

        int totalPriceWithoutGST = penPrice + pencilPrice + notebookPrice;
        System.out.println("The total price is: " + totalPriceWithoutGST);

        double gstCost = totalPriceWithoutGST*0.18;
        System.out.println("GST for your item is: " + gstCost);

        double totalCost = totalPriceWithoutGST + gstCost;
        System.out.println("The total price to pay is: " + totalCost);
    }
}

