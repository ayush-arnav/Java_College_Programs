/*
Wave Pattern
* * * * *
 * * * *
* * * * *
 * * * *
* * * * *
*/

import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 2 == 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                if (j < n) System.out.print(" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
