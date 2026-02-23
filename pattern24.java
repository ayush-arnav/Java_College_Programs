/*
Heart Pattern
  ***   ***
 ***** *****
***********
 *********
  *******
   *****
    ***
     *
*/

import java.util.Scanner;

public class pattern24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of heart: ");
        int n = scanner.nextInt();
        
        for (int i = n/2; i <= n; i += 2) {
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
