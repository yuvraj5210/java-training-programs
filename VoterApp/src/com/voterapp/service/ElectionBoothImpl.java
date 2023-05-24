package com.voterapp.service;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIdException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements ElectionBooth {

	String localities[]= {"whitefield","halasuru","kudlu gate","budigere cross","rajajinagar","basavanagudi"};
	ElectionBoothImpl boothImpl=null;

	private boolean checkAge(int age)
	{
		if(age>=18)
		{
			return true;
		}
		return false;

	}
	private boolean checkLocality(String locality)
	{
		for(String locality1:localities)
		{
			if(locality1.equals(locality))
			{
				return true;
			}
		}
		return false;

	}
	private boolean checkVoterId(int vid)
	{
		if(vid>=1000 && vid<=9999)
		{
			return true;
		}else
		{
			return false;
		}


	}

	@Override
	public boolean checkEligibility(int age, String locality, int vid) throws InValidVoterException
	{
		boolean flag=true;
		boothImpl =new ElectionBoothImpl();
		if(boothImpl.checkAge(age)==false)
		{
			flag=false;
			throw new UnderAgeException("you are under age");

		}
		else if(boothImpl.checkLocality(locality)==false)
		{
			flag=false;
		 throw new LocalityNotFoundException("locality not found");
		}
		else if(boothImpl.checkVoterId(vid)==false)
		{
			flag=false;
			throw new NoVoterIdException("voter id not found");

		}
		return flag;

	}



}
