package com.rapido.repository;


import com.rapido.model.User;

public interface IRapidoRepository {

	void Register(User user);
	void login(String username,String password);
	void UpdateDetails(String password,String userId);
	void DeleteAccount(String userId);
	User GetDetails(String userId);
}
