package com.mobileapp.service;

import java.util.*;

import com.mobileapp.exception.MobileNotFoundException;
import com.mobileapp.model.Mobile;

public class MobileServiceImpl implements MobileService {

	MobileServiceImpl impl;
	private Mobile[] getDetails()
	{
		Mobile mobiles[]=new Mobile[5];
		mobiles[0]=new Mobile("x27",800000.0,"vivo",123);
		mobiles[1]=new Mobile("a20",390900.0,"oppo",456);
		mobiles[2]=new Mobile("pixel",2200000.0,"google",789);
		mobiles[3]=new Mobile("node",400000.0,"oneplus",101);
		mobiles[4]=new Mobile("14 pro",1400000.0,"apple",112);
		return mobiles;
	}
	
	
	
	@Override
	public Mobile[] getAll() {
		impl=new MobileServiceImpl();
		return impl.getDetails();
	}

	@Override
	public Mobile getById(int id) throws MobileNotFoundException {
		
		for(Mobile mobile:impl.getDetails())
		{
			if (mobile.getMobileId()==id)
			{
				return mobile;
			}
		}
		throw new MobileNotFoundException("mobile not found with id : "+id);
	}

	@Override
	public Mobile[] getByBrand(String brand) throws MobileNotFoundException {
		int count=0;
		boolean flag=false;
		for(Mobile mobile:impl.getDetails())
		{
			if(mobile.getBrand().equals(brand))
			{
				count++;
			}
		}
		Mobile mobiles[]=new Mobile[count];
		int i=0;
		for(Mobile mobile:impl.getDetails())
		{
			if(mobile.getBrand().equals(brand))
			{
				mobiles[i++]=mobile;
				flag=true;
			}
		}
		if(flag==true)
		{
			return mobiles;
		}
		throw new MobileNotFoundException("mobile not found with brand "+brand );
		
	}

}
