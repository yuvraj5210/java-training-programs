package com.shristi.basic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number :");
		int num=sc.nextInt();
		int temp=0;
		while(num!=0)
		{
			int rem=num%10;
			temp=temp*10+rem;
			num=num/10;
		}
		System.out.println(temp);

	}

}
