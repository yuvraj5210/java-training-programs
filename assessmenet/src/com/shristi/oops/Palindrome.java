package com.shristi.oops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number :");
		int number=sc.nextInt();
		int tempNumber=number;
		int sum=0;
		while(tempNumber!=0)
		{
			int rem=tempNumber%10;
			sum=sum*10+rem;
			tempNumber=tempNumber/10;
		}
		if(sum==number)
		{
			System.out.println(number+" is a palindrome number");
		}
		else
		{
			System.out.println(number +" is not a palindrome number ");
		}

	}

}
