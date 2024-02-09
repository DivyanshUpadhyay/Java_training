package com.palindrome.program;

import java.util.Scanner;

public class Executor {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number to check if it's a palindrome number: ");
        int inputNumber = scanner.nextInt();
        
        // Check if the input number is a palindrome number
        boolean isPalindrome = PalindromeNumberChecker.isPalindrome(inputNumber);
        
        // Display the result
        if (isPalindrome) {
            System.out.println("The input number is a palindrome number.");
        } else {
            System.out.println("The input number is not a palindrome number.");
        }
        
        // Close the Scanner object
        scanner.close();
    }
}
