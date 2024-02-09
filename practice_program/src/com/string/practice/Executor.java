package com.string.practice;

import java.util.Scanner;

public class Executor {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter customer details
        System.out.println("Enter customer details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();

        // Create a new CustomerDetails object with user input
        CustomerDetails customer = new CustomerDetails(name, email, phoneNumber);

        // Display customer details
        System.out.println("\nCustomer Details:");
        customer.displayDetails();

        // Convert customer name to uppercase
        customer.convertNameToUpperCase();

        // Display updated customer details
        System.out.println("\nCustomer Details after converting name to uppercase:");
        customer.displayDetails();

        // Check if email contains "gmail.com"
        boolean hasGmail = customer.hasGmailEmail();
        if (hasGmail) {
            System.out.println("\nEmail contains 'gmail.com'.");
        } else {
            System.out.println("\nEmail does not contain 'gmail.com'.");
        }

        // Close the Scanner object
        scanner.close();
    }
}
