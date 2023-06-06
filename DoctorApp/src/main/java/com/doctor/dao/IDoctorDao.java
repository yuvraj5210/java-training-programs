package com.doctor.dao;

import java.util.List;

import com.doctor.exception.DoctorNotFoundException;
import com.doctor.model.Doctor;

public interface IDoctorDao {

void addDoctor(Doctor doctor);
	
	int updateDoctor(int doctorId,double fees);
	Doctor getById(int doctorId);
	void deleteDoctor(int doctorId);
	List<Doctor> findAllDoctors() ;
	
	List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException;
	List<Doctor> finBySpecialtiyAndExp(String sepciality, int experience) throws DoctorNotFoundException;
	List<Doctor> findBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException;
}
