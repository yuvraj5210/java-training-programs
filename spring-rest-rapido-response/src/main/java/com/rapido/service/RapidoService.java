package com.rapido.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.rapido.model.User;
import com.rapido.repository.IRapidoRepository;

@Component
public class RapidoService implements IRapidoService {

	@Autowired
	IRapidoRepository repository;
	
	@Autowired
	JdbcTemplate jdbcTemplate;


	@Override
	public void login(String username, String password) {
		repository.login(username, password);
	}



	@Override
	public void UpdateDetails(String password, String userId) {
		repository.UpdateDetails(password, userId);
	}

	@Override
	public void DeleteAccount(String userId) {
		repository.DeleteAccount(userId);		
	}


	@Override
	public User GetDetails(String userId) {
		return repository.GetDetails(userId);
	}



	@Override
	public void Register(User user) {
		
		String userId=GenerateId(user);
		User user1=GetDetails(userId);
		if(user1.getUserId()!=null)
		{
			userId=GenerateId(user);
		}
		
		String password="1234567890";
		user.setUserId(userId);
		user.setPassword(password);
		repository.Register(user);
	}
	
	
	private int count =0;
	private String GenerateId(User user)
	{
		if(count>9)
		{
			count=0;
		}
		String userId=null;
		String firstName=user.getFirstName();
		String middleName=user.getMiddleName();
		String lastName=user.getLastName();
		String city=user.getCity();
		
		if(middleName!=null)
		{
			 userId=""+city.charAt(0)+city.charAt(1)+firstName.charAt(0)+middleName.charAt(0)+lastName.charAt(0)+(count++);
			 userId=userId.toLowerCase();
		}
		else {
				 userId=""+city.charAt(0)+city.charAt(1)+firstName.charAt(0)+lastName.charAt(0)+(count++)+(count++);
				 userId=userId.toLowerCase();
		}
		
		
		return userId;
	}





}
