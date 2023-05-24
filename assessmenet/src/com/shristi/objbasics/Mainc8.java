package com.shristi.objbasics;


interface Addition
{
	int performAddition(int x, int y);
}
public class Mainc8 {

	public static void main(String[] args) {
		Addition add=(a,b)->a+b;
		int number1=5; int number2=15;
		int result=add.performAddition(number1, number2);
		System.out.println("the addition of "+number1+" and "+number2+" is "+result);

	}

}
