package com.shristi.basic;

import java.util.Scanner;

public class ReverseInArrays {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(" array is ");
		for(int i=0;i<arr.length;i++)
		{
		  System.out.println(arr[i]);
		}
		for(int i=0,j=arr.length-1;i<=j;i++,j--)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.println("after reverse ");
		for(int i=0;i<arr.length;i++)
		{
		  System.out.println(arr[i]);
		}


	}

}
