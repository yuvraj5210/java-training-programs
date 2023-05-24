package com.shristi.basic;

import java.util.Scanner;

public class FibonnaciSeries 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a values :");
		int n=sc.nextInt();
		int n1=0,n2=1,n3=0;;
		while(n1<=n)
		{
			n3=n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=n3;
		}
		

	}

}
