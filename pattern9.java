/*
Pascal's Triangle Pattern
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
*/

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(combination(i, j) + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
    
    public static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
