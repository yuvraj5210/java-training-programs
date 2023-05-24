package com.shristi.oops;

import java.util.Scanner;

public class ArraySumAvg {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array :");
		int size=sc.nextInt();
		int sum=0;
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("sum of array :"+sum);
		System.out.println("average of array :"+(sum/size));
	}

}
