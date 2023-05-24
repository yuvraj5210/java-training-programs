package com.userapp.service;

import com.userapp.exception.*;

public class ValidationServiceImpl implements IValidationService {

	String userNames[] = {"yuvraj","amogh","divya","raj","abrar","rashmita"};

	@Override
	public boolean validateUserName(String userName) throws NameExistsException {
		for (String userName1 : userNames) {
			if (userName1.equals(userName)) {
				throw new NameExistsException("already name exists");
			}
		}

		return true;
	}

	@Override
	public boolean validatePassword(String password) throws TooLongException,TooShortException {
		if (password.length() < 6) {
			throw new TooShortException("password is too short");
		}

		if (password.length() > 15) {
			throw new TooLongException("password is too long");
		}

		return true;
	}

}
