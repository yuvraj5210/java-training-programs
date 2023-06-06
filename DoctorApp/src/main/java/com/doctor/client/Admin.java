package com.doctor.client;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

import com.doctor.exception.DoctorNotFoundException;
import com.doctor.model.Doctor;
import com.doctor.service.DoctorServiceImpl;
import com.doctor.service.IDoctorService;
import com.doctor.util.DbConnection;
import com.doctor.util.Queries;

public class Admin {

	public static void main(String[] args) {
		
//		Connection connection=DbConnection.openConnection();
//		try {
//			// creation of table 
//			Statement statement=connection.createStatement();
//			statement.execute(Queries.CREATEQUERY);
//			
//			
//			
			// inserting of data
//			Doctor doctor=new Doctor();
//			doctor.setDoctorId(03);
//			doctor.setDoctorName("priya");
//			doctor.setSpeciality("neurologist");
//			doctor.setExperience(5);
//			doctor.setFees(5000.0);
//			doctor.setStartTime(LocalDateTime.now());
//			doctor.setEndTime(LocalDateTime.now());
//			
			IDoctorService doctorService=new DoctorServiceImpl();
			doctorService.getAllDoctors();
		

		
	}
}
