package com.bridgelabz;

public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
		//To start the series with 0 and 1
		int a=0, b=1;
		int c;
		System.out.println("The Value of a & b are: " + a +" & "+b);
		
		for (int i=1; i<=10; i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;		
		}	
	}
}
