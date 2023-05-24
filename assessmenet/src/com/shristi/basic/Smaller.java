package com.shristi.basic;

import java.util.Scanner;

public class Smaller {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		int smaller=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]<smaller)
			{
				smaller=arr[i];
			}
		}
		System.out.println(smaller);
		

	}

}
