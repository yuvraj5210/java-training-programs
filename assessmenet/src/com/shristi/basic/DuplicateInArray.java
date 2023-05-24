package com.shristi.basic;

import java.util.Scanner;

public class DuplicateInArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i!=j)
				{
					System.out.println(arr[i]+" is duplicate");
					arr[i]=Integer.MIN_VALUE;
					break;
				}
			}
		}
		

	}

}
