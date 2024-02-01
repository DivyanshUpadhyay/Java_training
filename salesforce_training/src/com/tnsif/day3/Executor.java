package com.tnsif.day3;

import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration of variables
		int id;
		String name,address;
		try (//Creating new Scanner obj to read value
		Scanner sc = new Scanner(System.in)) {
			//input for the customer details
			System.out.println("Enter the Details of the Customer : ");
			System.out.println("Enter ID of the Customer : ");
			id=sc.nextInt();//storing value to the variable
			sc.nextLine();
			System.out.println("Enter Name of the Customer : ");
			name=sc.nextLine();//storing value to the variable
			System.out.println("Enter Address of the Customer : ");
			address=sc.nextLine();//storing value to the variable
			//setting value to the class where logic is written
			//Default Constructor is Called
			Customer c = new Customer();
			c.setCustomerId(id);
			c.setCustomerAddress(address);
			c.setCustomerName(name);
			//printing output
			System.out.println("The Customer Details are : "+c);
			
			//next execution
			System.out.println("Enter ID of the Customer : ");
			id=sc.nextInt();//storing value to the variable
			sc.nextLine();
			System.out.println("Enter Name of the Customer : ");
			name=sc.nextLine();//storing value to the variable
			System.out.println("Enter Address of the Customer : ");
			address=sc.nextLine();
		}
		//Parametrized Constructor is called
		Customer c1 = new Customer(id,name,address);
		System.out.println("Customer Details are : "+c1);
	}

}
