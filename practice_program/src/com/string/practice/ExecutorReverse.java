package com.string.practice;

import java.util.Scanner;

public class ExecutorReverse {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string to reverse: ");
        String inputString = scanner.nextLine();
        
        // Reverse the input string
        String reversedString = StringReverser.reverseString(inputString);
        
        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);
        
        // Close the Scanner object
        scanner.close();
    }
}
