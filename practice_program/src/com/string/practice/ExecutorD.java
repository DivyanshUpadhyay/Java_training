package com.string.practice;

import java.util.Scanner;

public class ExecutorD {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string to find duplicate characters: ");
        String inputString = scanner.nextLine();

        // Call the findDuplicateCharacters method from the DuplicateCharacterFinder class
        DuplicateCharacterFinder.findDuplicateCharacters(inputString);

        // Close the Scanner object
        scanner.close();
    }
}
