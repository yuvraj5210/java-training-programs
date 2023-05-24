package com.shristi.oops;

import java.util.*;
public class Registration {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String userNames[]=new String[10];
		
		for(int i=0;i<userNames.length;i++)
		{
			System.out.print("enter name to register : ");
			String name=sc.next();
			if(input(name,userNames))
			{
				System.out.println("name is not unique");
			}
			else
			{
				userNames[i]=name;
				System.out.println("you are registered");
			}
			System.out.println("________________x________________");
		}
		
	}
	public static boolean input(String name,String userNames[])
	{
		boolean flag=false;
		for(int i=0;i<userNames.length;i++)
		{
			if(name.equals(userNames[i]))
			{
				flag=true;
			}
		}
		return flag;
	}

}
