package com.shristi.objbasics;

import java.util.Scanner;

class Student
{
	private String name;
	private String department;
	
	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	void printDetails()
	{
		System.out.println("Name of student :"+name);
		System.out.println("Department of student :"+department);
	}
	String getGrades(int marks[])
	{
		int sum=0;
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
		}
		int avg=sum/5;
		if(avg>75)
		{
			return "A grade";
		}
		else if(avg<75 && avg>50)
		{
			return "B grade";
		}
		else if (avg<50 && avg >36)
		{
			return "c grade";
		}
		else
		{
		   return "fail";
		}
		
		
	}
}
public class Mainc2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student name: ");
		String name=sc.next();
		System.out.print("Enter department name :");
		String department=sc.next();
		int marks[]=new int[5];
		Student student=new Student(name,department);
		for(int i=0;i<marks.length;i++)
		{
			System.out.print("Enter subject-"+(i+1)+ " marks:");
			marks[i]=sc.nextInt();
		}
		student.printDetails();
		System.out.println(student.getGrades(marks)); ;
		

	}

}
