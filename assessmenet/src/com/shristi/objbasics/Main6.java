package com.shristi.objbasics;

import java.util.*;
interface Calculator
{
	void calculate(int x,int y);
}

public class Main6 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter two values ");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
		Calculator calculator1 = (x, y) -> {
			System.out.println("sum :"+(x+y));
		};
		calculator1.calculate(a,b);
		calculator1 = (x, y) -> {
			System.out.println("difference :"+(x-y));
		};
		calculator1.calculate(a,b);
		calculator1 = (x, y) -> {
			System.out.println("product :"+(x*y));
		};
		calculator1.calculate(a,b);
	    calculator1 = (x, y) -> {
		   System.out.println("divison :"+(x/y));
		};
		calculator1.calculate(a,b);
	}

}
