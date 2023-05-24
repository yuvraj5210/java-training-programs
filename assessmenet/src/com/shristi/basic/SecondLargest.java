package com.shristi.basic;

import java.util.Scanner;

public class SecondLargest
{
	public static int[] sorting(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		arr=sorting(arr);
		System.out.println(arr[arr.length-2]);
	}

}
