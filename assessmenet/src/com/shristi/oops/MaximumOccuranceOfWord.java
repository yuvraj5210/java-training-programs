package com.shristi.oops;

import java.util.Scanner;

public class MaximumOccuranceOfWord {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word : ");
		String word=sc.next();
		char c ='\u0000';
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			int countTemp=0;
		   for(int j=0;j<word.length();j++)
		   {
			   if(word.charAt(i)==word.charAt(j))
			   {
				   countTemp++;
			   }
		   }
		  // word.charAt(i)='\0';
		   if(count<countTemp)
		   {
			   c=word.charAt(i);
			   
			   count=countTemp;
		   }
		}
		System.out.println(c);

	}

}
