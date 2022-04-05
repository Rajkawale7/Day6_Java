package com.bridgelabz;

import java.util.Scanner;

public class PrimeNo 
{

	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		
		int temp = 0; //temporary variable to store the data
		
		System.out.println("Enter any number to check: ");
		int number = Scan.nextInt();
		
		for (int i=2; i<=number-1; i++)
		{
			if (number%i == 0) 
			{
				temp = temp + 1;
			}
		if (temp > 0)
		{
			System.out.println("The Given number is not a Prime Number: " + number);
		}
		else 
		{
			System.out.println("The Given number is a Prime Number: " + number);
		}
		}
		
	}

}
