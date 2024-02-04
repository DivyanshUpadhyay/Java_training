package com.tnsif.day1;
import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args)
	{
		System.out.println("Hello");
		float a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 Numbers that you want to add : ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c=a+b;
		System.out.println("Sum of " +a+ " and " +b+ " is : " + c);
		sc.close();
	}
}
