
package com.userapp.client;

import java.util.*;

import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;
public class Register 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name :");
		String name=sc.next();
		System.out.print("Enter password :");
		String password=sc.next();
		
		IValidationService validationService=new ValidationServiceImpl();
		
		try
		{
			if(validationService.validateUserName(name))
			{
				System.out.println("you name is valid ");
			}
        }
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try
		{
			if(validationService.validatePassword(password))
			{
				System.out.println("you name is valid ");
			}
        }
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	    
	}

}
