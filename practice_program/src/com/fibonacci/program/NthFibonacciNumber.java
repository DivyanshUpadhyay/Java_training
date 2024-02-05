package com.fibonacci.program;

public class NthFibonacciNumber {
	private int a;
	public  NthFibonacciNumber()
	{
		this.a = 0 ;
	}
	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}
	public void calculate(int n)
	{
		if(n<=1)
			setA(n);
		int prev =0;
		int curr = 1;
		for(int i = 2;i<=n;i++ )
		{
			int temp = curr;
			curr = prev + curr;
			prev = temp;
		}
		setA(curr);
			
	}
}
