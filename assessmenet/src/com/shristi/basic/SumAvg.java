package com.shristi.basic;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("sum :"+sum);
		System.out.println("Average :"+(sum/size));
	}

}
