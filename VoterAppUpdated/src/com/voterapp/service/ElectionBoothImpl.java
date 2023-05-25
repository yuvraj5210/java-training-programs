package com.voterapp.service;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIdException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements ElectionBooth {

	String localities[] = { "whitefield", "halasuru", "kudlu gate", "budigere cross", "rajajinagar", "basavanagudi" };

	private boolean checkAge(int age) throws UnderAgeException {
		if (age < 18) {
			throw new UnderAgeException("you are under age");
		}
		return true;

	}

	private boolean checkLocality(String locality) throws LocalityNotFoundException {
		for (String locality1 : localities) {
			if (locality1.equals(locality)) {
				return true;
			}
		}
		throw new LocalityNotFoundException("locality not found with name " + locality);

	}

	private boolean checkVoterId(int vid) throws NoVoterIdException {
		if (vid >= 1000 && vid <= 9999) 
			return true;
		
			throw new NoVoterIdException("voter id not found with id :" + vid);
		

	}

	@Override
	public boolean checkEligibility(int age, String locality, int vid) throws InValidVoterException {
		if (checkAge(age) && checkLocality(locality) && checkVoterId(vid)) {
			return true;
		}
		return false;

	}

}
