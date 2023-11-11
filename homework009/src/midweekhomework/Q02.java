package midweekhomework;/*-Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.*/

import java.util.Scanner;

public class Q02 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt user to enter numbers
            System.out.println("Enter numbers (enter a non-number to finish):");

            // Initialize min and max with the first number entered
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            // Read and find min/max numbers using while loop
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                min = Math.min(min, number);
                max = Math.max(max, number);
            }

            // Check if any numbers were entered
            if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE) {
                System.out.println("No valid numbers entered.");
            } else {
                // Print the min and max numbers
                System.out.println("Minimum number: " + min);
                System.out.println("Maximum number: " + max);
            }

            // Close the scanner to prevent resource leak
            scanner.close();
        }}








