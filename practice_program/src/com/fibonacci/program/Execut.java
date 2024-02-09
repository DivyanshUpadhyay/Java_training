package com.fibonacci.program;

import java.util.Scanner;

public class Execut {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to generate Fibonacci numbers up to the nth number: ");
        int n = sc.nextInt();

        // Create an instance of the NthFibonacciNumber class
        Nfibonaccinumber f = new Nfibonaccinumber();
        f.calculateUpToN(n);

        // Display Fibonacci numbers up to the nth number
        System.out.println("Fibonacci numbers up to " + n + ":");
        int[] fibSeries = f.getFibSeries();
        for (int i = 0; i < n; i++) {
            System.out.println("Fibonacci number " + (i + 1) + ": " + fibSeries[i]);
        }

        // Close the Scanner object
        sc.close();
    }
}
