package com.doctor.util;

public class Queries {

	public static final String CREATEQUERY=
			"create table doctor(doctorName varchar(20),doctorId number primary key ,speciality varchar(30),experience number,fees real,startTime timeStamp,endTime timeStamp)";
	public static final String INSERTQUERY="insert into doctor (doctorName,doctorId,speciality,experience,fees,startTime,endTime) values(?,?,?,?,?,?,?)";
	public static final String UPDATEQUERY="update doctor set fees =? where docotorId=?";
	public static final String QUERYBYID=" select * from doctor where id=?";
	public static final String QUERYBYSPECIALITY="select * from doctor where speciality=? ";
	public static final String QUERYBYSPECIALITYEXP="select * from doctor where speciality=? and experience>=?";
	public static final String DELETEQUERY="delete from doctor where doctorId=?";
	public static final String GETALL="select * from doctor";
	public static final String QUERYBYSPECIALITYFEES="select * from doctor where speciality=? and fees=?";
}

