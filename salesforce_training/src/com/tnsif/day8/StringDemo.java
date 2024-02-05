package com.tnsif.day8;

public class StringDemo {
	public static void main(String[] args)
	{
		String s = new String("Divyansh");//way1
		s.concat("Upadhyay");//immutable
		System.out.println(s);
		String s2 = new String(s.concat(" Upadhyay"));
//		String s2 = "Upadhyay";//way2
//		System.out.println(s2);
		System.out.println(s2);
		
		StringBuffer s1 = new StringBuffer("Divyansh ");
		s1.append("Upadhyay");
		System.out.println(s1);
		System.out.println(s1.length());//length of the string 
		String l = s.toLowerCase();
		String u = s.toUpperCase();
		System.out.println(l);
		System.out.println(u);
		
	}

}
