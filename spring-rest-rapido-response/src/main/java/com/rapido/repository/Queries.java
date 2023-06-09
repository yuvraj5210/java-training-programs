package com.rapido.repository;

public class Queries {

	public static final String REGISTERQUERY="insert into myuser values(?,?,?,?,?,?,?,?)";
	public static final String UPDATEQUERY="update myuser set password=? where userid =?";
	public static final String DELETEQUERY="delete from myuser where UserId =?";
	public static final String GETQUERY="select * from myuser where userId=?";
	public static final String LOGINQUERY="select * from myuser where userId=? and passsword=?";
}
