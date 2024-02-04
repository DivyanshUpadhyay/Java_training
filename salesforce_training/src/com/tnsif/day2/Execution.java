package com.tnsif.day2;
import java.util.Scanner;
public class Execution {
	public static void main(String[] args)
	{
		EncapsulationDemo obj = new EncapsulationDemo();
		System.out.println("Enter Laptop Details : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Laptop Name : ");
		obj.setName(sc.nextLine());
		System.out.println("Enter the Laptop Price : ");
		obj.setPrice(sc.nextFloat());
		System.out.println("Enter the Laptop Serial Number : ");
		obj.setSerialNumber(sc.nextInt());
		System.out.println("Laptop Details Are : "+obj);
		sc.close();
	}
	
}
