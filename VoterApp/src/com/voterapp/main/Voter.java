package com.voterapp.main;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.service.ElectionBooth;
import com.voterapp.service.ElectionBoothImpl;

import java.util.*;
public class Voter {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ElectionBooth booth=new ElectionBoothImpl();
		System.out.print("\nenter age : ");
		int age=sc.nextInt();
		System.out.println("enter locality :");
		String locality=sc.next();
		System.out.println("enter voter id : ");
		int vid=sc.nextInt();
		
		try {
			if(booth.checkEligibility(age, locality, vid))
			{
				System.out.println("voter eligble");
			}
		} catch (InValidVoterException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
