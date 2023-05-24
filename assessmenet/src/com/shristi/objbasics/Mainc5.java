package com.shristi.objbasics;

import java.util.Scanner;

abstract class Account1
{
	double balance;
	public Account1(double balance) {
		super();
		this.balance = balance;
	}



	abstract void withdraw(double amount);
	abstract void deposit(double amount);
	public double getbalance()
	{
		return balance;
	}

}


class Current1 extends Account
{

	public Current1(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount)
	{
		if(super.balance>amount )
		{
			super.balance=super.balance-amount;
			System.out.println("amount withdrawn successfully");
		}
		else
		{
			System.out.println("not enough balance");
		}

	}
	@Override
	public void deposit(double amount)
	{
		super.balance=super.balance+amount;
		System.out.println("amount deposited successfully");

	}

}


class Savings1 extends Account 
{


	public Savings1(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withdraw(double amount)
	{
		if(super.balance>amount && super.balance>1500)
		{
			super.balance=super.balance-amount;
			System.out.println("amount withdrawn successfully");
		}
		else
		{
			System.out.println("not enough balance");
		}

	}
	@Override
	public void deposit(double amount)
	{
		super.balance=super.balance+amount;
		System.out.println("amount deposited successfully");

	}


}
public class Mainc5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Savings1 account = null;
		Current1 account2=null;
		while (true)
		{
			System.out.println("________________________Welcome_________________________");
			System.out.println("\npress 1: savings account");
			System.out.println("press 2: current account");
			System.out.println("press 3: to exit");
			System.out.print("\nenter your choice :");
			int choice =sc.nextInt();
			switch(choice)
			{
			case 1: if(account==null)
				{
				account=new Savings1(2000.0);
				}
			System.out.println("\npress a: for deposit");
			System.out.println("press b: for withdraw");	
			System.out.println("press c: check balance");
			System.out.print("\nenter your choice :");
			char c=sc.next().charAt(0);
			switch(c)
			{
			case 'a':System.out.print("\nenter amount to be deposited :");
			double amount=sc.nextDouble();
			account.deposit(amount );
			break;
			case 'b':System.out.print("\nenter amount to be withdrawn :");
			double amount1=sc.nextDouble();
			account.withdraw(amount1 );
			break;
			case 'c':System.out.println("balance :"+account.getbalance());
			break;
			default:System.out.println("\ninvalid choice");

			}
			break;


			case 2: 
			if(account2==null)
			{
				account2=new Current1(130000.0);
			}
			System.out.println("\npress a: for deposit");
			System.out.println("press b: for withdraw");
			System.out.println("press c: check balance");
			System.out.print("\nenter your choice :");
			char c1=sc.next().charAt(0);
			switch(c1)
			{
			case 'a':System.out.print("\nenter amount to be deposited :");
			double amount=sc.nextDouble();
			account2.deposit(amount );
			break;
			case 'b':System.out.print("\nenter amount to be withdrawn :");
			double amount1=sc.nextDouble();
			account2.withdraw(amount1 );
			break;
			case 'c':System.out.println("balance :"+account2.getbalance());
			break;
			default:System.out.println("invalid choice");

			}
			break;
			case 3: System.exit(0);
			default:System.out.println("invalid choice");
			} 
			System.out.println("_______________________________________________________");
		}
		

	}

}
