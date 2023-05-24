package com.shristi.oops;

import java.util.Scanner;

public class GreaterThan3
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers :");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		System.out.println("greatest number is "+(x>y?(x>z?x:z):(y>z?y:z)));
		
	}

}
