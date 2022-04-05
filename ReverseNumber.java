package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

//Program to reverse the number
		
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		int remainder;
		int reverse=0; 
		
		while (number != 0) {
			remainder = number %10;
			reverse = reverse*10+remainder;
			number = number/10;
			
		}
		System.out.println("Reverse of given number is: " + reverse);

//Program to reverse the characters
		String name = "RAJ";
		int length = name.length();
		String rev = "";
		
		for (int i=length-1; i>=0; i--) {
				rev = rev+name.charAt(i);
		}
		System.out.println("Reverse of the given name 'RAJ' is: " + rev);
		
	}

}
