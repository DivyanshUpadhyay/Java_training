package com.tnsif.day10;

public class MultiDimensionalArray {
	public static void main(String[] args)
	{
		int [][][] x= {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
		System.out.println(x[0][1][2]);
		System.out.println(x[1][0][1]);
		System.out.println(x[0][1][0]);
		System.out.println(x[1][1][0]);
	}
}
