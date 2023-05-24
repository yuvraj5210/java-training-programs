package com.shristi.basic;

import java.util.Scanner;

public class PrimeNUmber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number :");
		int num=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.println(num+" is not a prime number");
		}
		else
		{
			System.out.println(num+" is a prime number");
		}
			
	}

}
