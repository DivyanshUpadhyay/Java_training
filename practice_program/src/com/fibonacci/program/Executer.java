package com.fibonacci.program;

import java.util.Scanner;

public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		NthFibonacciNumber f = new NthFibonacciNumber();
		f.calculate(n);
		System.out.println("The "+ n + "th fibbonnaci number is : "+ f.getA());
		sc.close();
	}

}
