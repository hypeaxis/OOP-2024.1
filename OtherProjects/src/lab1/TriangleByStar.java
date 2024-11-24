package lab1;

import java.util.Scanner;

public class TriangleByStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        int n = scanner.nextInt();
        
        // Display the centered triangle
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}