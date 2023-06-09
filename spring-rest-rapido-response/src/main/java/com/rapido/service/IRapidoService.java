package com.rapido.service;


import java.util.Optional;

import com.rapido.model.User;

public interface IRapidoService {

	void Register(User user);
	
	void UpdateDetails(String password,String userId);
	void DeleteAccount(String userId);
	User GetDetails(String userId);
	void login(String username,String password);
}
