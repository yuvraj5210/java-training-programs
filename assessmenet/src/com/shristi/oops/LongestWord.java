package com.shristi.oops;

import java.util.*;
public class LongestWord {

	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter a sentence :");
	   String sentence=sc.nextLine();
	   String temp="";
	   String arr[]=sentence.split(" ");
	   for(int i=0;i<arr.length;i++)
	   {
		   if(temp.length()<arr[i].length())
		   {
			   temp=arr[i];
		   }

	   }
	   System.out.println(temp);
	}

}
