package lab1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Initialize the array
        int[] array = new int[size];
        
        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Sort the array
        Arrays.sort(array);
        
        // Calculate the sum and average
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / size;
        
        // Display the sorted array, sum, and average
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + average);
        
        scanner.close();
    }
}