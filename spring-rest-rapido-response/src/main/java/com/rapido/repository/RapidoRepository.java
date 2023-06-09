package com.rapido.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.rapido.model.User;


@Repository
public class RapidoRepository implements IRapidoRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void login(String username, String password) {
	}

	
	@Override
	public void Register(User user) {
		Object userDetails[]= {user.getUserId(),user.getFirstName(),user.getMiddleName(),user.getLastName(),user.getCity(),user.getEmail(),user.getPassword(),user.getdOB()};
      jdbcTemplate.update(Queries.REGISTERQUERY,userDetails);
	}


	@Override
	public void UpdateDetails(String password, String userId) {
		jdbcTemplate.update(Queries.UPDATEQUERY,password,userId);
	}


	@Override
	public void DeleteAccount(String userId) {
		jdbcTemplate.update(Queries.DELETEQUERY	,userId);
	}


	@Override
	public User GetDetails(String userId) {
		return jdbcTemplate.queryForObject(Queries.GETQUERY,new RapidoMapper(),userId );
	}

}
