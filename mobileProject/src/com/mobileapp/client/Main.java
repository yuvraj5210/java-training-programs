package com.mobileapp.client;

import java.util.Scanner;

import com.mobileapp.exception.MobileNotFoundException;
import com.mobileapp.model.Mobile;
import com.mobileapp.service.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		MobileService mobileService=new MobileServiceImpl();
		
		for(Mobile mobile: mobileService.getAll())
		{
			System.out.println(mobile);
		}
		
		System.out.print("enter mobile id: ");
		int id=sc.nextInt();
		try {
			System.out.println(mobileService.getById(id));
		} catch (MobileNotFoundException e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.print("enter mobile brand :");
		String brand=sc.next();
		try {
			for(Mobile mobile:mobileService.getByBrand(brand))
			{
				System.out.println(mobile);
			}
		} catch (MobileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
