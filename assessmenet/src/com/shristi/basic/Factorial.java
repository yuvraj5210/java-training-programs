package com.shristi.basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a value :");
		int n=sc.nextInt();
		int sum=1;
		while(n!=0)
		{
			sum*=n;
			n--;
		}
		System.out.println(sum);

	}

}
