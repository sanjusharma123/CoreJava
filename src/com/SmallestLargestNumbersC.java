package com;
import java.util.Scanner;

public class SmallestLargestNumbersC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of values
        System.out.print("Enter the number of values: ");
        int n = input.nextInt();

        // Prompt the user to enter the values
        System.out.print("Enter " + n + " values: ");
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = input.nextInt();
        }

        // Find the smallest and largest values
        int min = values[0];
        int max = values[0];
        for (int i = 1; i < n; i++) {
            if (values[i] < min) {
                min = values[i];
            }
            if (values[i] > max) {
                max = values[i];
            }
        }

        // Display the results
        System.out.println("Smallest value: " + min);
        System.out.println("Largest value: " + max);

        input.close();
    }
}
