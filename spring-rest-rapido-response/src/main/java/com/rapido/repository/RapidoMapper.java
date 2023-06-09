package com.rapido.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.rapido.model.User;

public class RapidoMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user =new User();
		user.setUserId(rs.getString("userId"));
		user.setFirstName(rs.getNString("firstName"));
		user.setLastName(rs.getString("lastName"));
		user.setMiddleName(rs.getString("middleName"));
		user.setCity(rs.getString("city"));
		user.setEmail(rs.getString("email"));
		user.setPassword(rs.getString("password"));
		user.setdOB(rs.getDate("DOB"));
		return user;
	}

}
