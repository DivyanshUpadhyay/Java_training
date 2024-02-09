package com.string.practice;

public class CustomerDetails {
    private String name;
    private String email;
    private String phoneNumber;

    // Constructor
    public CustomerDetails(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Method to display customer details
    public void displayDetails() {
        System.out.println("Customer Details:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }

    // Method to convert name to uppercase
    public void convertNameToUpperCase() {
        name = name.toUpperCase();
    }

    // Method to check if email contains "gmail.com"
    public boolean hasGmailEmail() {
        return email.toLowerCase().contains("gmail.com");
    }
}
