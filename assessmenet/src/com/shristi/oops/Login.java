package com.shristi.oops;

import java.util.*;
public class Login {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String userNames[]=new String[10];
		boolean flag=false;
		for(int i=0;i<userNames.length;i++)
		{
			userNames[i]=sc.next();
		}
		
		System.out.print("Enter username to login :");
		String name=sc.next();
		for(int i=0;i<userNames.length;i++)
		{
			if(name.equals(userNames[i]))
			{
				flag=true;
				System.out.println("you are logged in successfully");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("invalid username");
		}

	}

}
