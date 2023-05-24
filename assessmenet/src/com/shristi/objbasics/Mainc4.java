package com.shristi.objbasics;

import java.util.*;
class Account
{
	double balance;
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	public void withdraw(double amount)
	{
	}
	public void deposit(double amount)
	{
	}
	public double getbalance()
	{
		return balance;
	}

}
class Savings extends Account 
{

	public Savings(double balance) {
		super(balance);
	}
	@Override
	public void withdraw(double amount)
	{
		if(balance>amount && balance>1500)
		{
			balance=balance-amount;
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
		balance=balance+amount;
		System.out.println("amount deposited successfully");

	}


}
class Current extends Account
{
	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withdraw(double amount)
	{
		if(balance>amount )
		{
			balance=balance-amount;
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
		balance=balance+amount;
		System.out.println("amount deposited successfully");

	}

}
public class Mainc4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while (true)
		{
			System.out.println("press 1: savings account");
			System.out.println("press 2: current account");
			System.out.println("press 3: to exit");
			System.out.print("enter your choice :");
			int choice =sc.nextInt();
			switch(choice)
			    {
			     case 1: Account account=new Savings(2000.0);
			     System.out.println("press a: for deposit");
			     System.out.println("press b: for withdraw");
			     System.out.print("enter your choice ");
			     System.out.println("press c: check balance");
			     char c=sc.next().charAt(0);
			    switch(c)
			    {
			       case 'a':System.out.println("enter amount to be deposited :");
			       double amount=sc.nextDouble();
			       account.deposit(amount );
			        break;
			        case 'b':System.out.println("enter amount to be withdrawn :");
			       double amount1=sc.nextDouble();
		         	account.withdraw(amount1 );
			      break;
			      case 'c':System.out.println("balance :"+account.getbalance());
			      break;
			      default:System.out.println("invalid choice");

			    }
			    break;
			    
			    
			     case 2: Account account2=new Current(2000.0);
			     System.out.println("press a: for deposit");
			     System.out.println("press b: for withdraw");
			     System.out.println("press c: check balance");
			     System.out.print("enter your choice ");
			     char c1=sc.next().charAt(0);
			    switch(c1)
			    {
			       case 'a':System.out.println("enter amount to be deposited :");
			       double amount=sc.nextDouble();
			       account2.deposit(amount );
			        break;
			        case 'b':System.out.println("enter amount to be withdrawn :");
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

		}

	}

}
