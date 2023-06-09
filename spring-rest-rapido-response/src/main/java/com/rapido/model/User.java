package com.rapido.model;

import java.util.Date;

import org.springframework.stereotype.Component;


@Component
public class User{

	private String userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String city;
	private String email;
	private String password;
	private Date dOB;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userId, String firstName, String middleName, String lastName, String city, String email,
			String password, Date dOB) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.city = city;
		this.email = email;
		this.password = password;
		this.dOB = dOB;
	}



	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Date getdOB() {
		return dOB;
	}
	public void setdOB(Date dOB) {
		this.dOB = dOB;
	}
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", city=" + city + ", email=" + email + ", password=" + password + ", dOB=" + dOB + "]";
	}
	
}
