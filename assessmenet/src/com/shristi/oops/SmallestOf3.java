package com.shristi.oops;

import java.util.Scanner;

public class SmallestOf3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers :");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		if(x<y && x<z)
		{
			System.out.println(x+" is the smallest number");
		}
		else if(y<z)
		{
			System.out.println(y+" is the smallest number ");
		}
		else
		{
			System.out.println(z+" is the smallest number");
		}

	}

}
