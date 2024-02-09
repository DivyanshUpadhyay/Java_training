package com.armstrong.number;

import java.util.Scanner;

public class Executor {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();

        // Check if the number is an Armstrong number
        boolean isArmstrong = Armstrong.isArmstrong(number);

        // Display the result
        if (isArmstrong) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the Scanner object
        scanner.close();
    }
}
