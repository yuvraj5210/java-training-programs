package com.shristi.basic;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int temp=x;
		String y=temp+"";
		int numberOfDigits=y.length();
		int rem=0;
		double sum=0;
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+Math.pow(rem, numberOfDigits);
			temp=temp/10;
		}
		if(x==sum)
		{
			System.out.println(x+" is an armstrong number");
		}
		else
		{
			System.out.println(x+" not an armstrong number");
		}
		
	}

}
