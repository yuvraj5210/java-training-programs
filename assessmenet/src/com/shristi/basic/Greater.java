package com.shristi.basic;

import java.util.Scanner;

public class Greater {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int greater=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>greater)
			{
				greater=arr[i];
			}
		}
		System.out.println(greater);
		

	}

}
