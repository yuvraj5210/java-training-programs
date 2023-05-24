package com.shristi.objbasics;

interface BasicCalculator
{
	 void add(int x,int y);
	 void difference(int x,int y);
	 void product(int x, int y);
	 void divide(int x, int y);
}
interface ScientificCalculator
{
	void square(int x);
	void cube(int y);
}
class Basic implements BasicCalculator
{

	@Override
	public void add(int x, int y) {
		System.out.println("sum :"+(x+y));
		
	}

	@Override
	public void difference(int x, int y) {
		System.out.println("difference :"+(x-y));
	}

	@Override
	public void product(int x, int y) {
		System.out.println("product :"+(x*y));
	}

	@Override
	public void divide(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("division :"+(x/y));
	}

		
}
class Scientific extends Basic implements ScientificCalculator
{
	@Override
	public void square(int x) {
		// TODO Auto-generated method stub
		System.out.println("square :"+(x*x));
		
	}

	@Override
	public void cube(int y) {
		// TODO Auto-generated method stub
		System.out.println("cube :"+(y*y*y));
	}

}
public class Mainc7 {

	public static void main(String[] args) 
	{
		ScientificCalculator scientificCalculator=new Scientific();
		scientificCalculator.cube(3);
		scientificCalculator.square(2);
		
		Scientific scientific=(Scientific)scientificCalculator;
		scientific.add(10, 02);
		scientific.difference(10, 02);
		scientific.divide(10, 02);
		scientific.product(10, 02);
	}

}
