/*
  1
 212
32123
 212
  1
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int size = 2 * num - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j >= num - 1) && (i <= j + num - 1) && (i >= j - num + 1) && (i + j <= 3 * num - 3)) {
                    int top = num - 1;
                    int distance = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                    int numToPrint = num - 1 - distance;

                    // Print number (add 1 for 1-based numbers)
                    System.out.print((numToPrint + 1) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
} // TC : O(n * n), SC : O(1)

