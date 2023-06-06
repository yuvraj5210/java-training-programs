package com.doctor.service;

import java.util.List;
import com.doctor.exception.DoctorNotFoundException;
import com.doctor.model.Doctor;

public interface IDoctorService {

	void addDoctor(Doctor doctor);
	
	int updateDoctor(int doctorId,double fees);
	Doctor getById(int doctorId);
	void deleteDoctor(int doctorId);
	List<Doctor> getAllDoctors();
	
	List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException;
	List<Doctor> getBySpecialtiyAndExp(String sepciality, int experience) throws DoctorNotFoundException;
	List<Doctor> getBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException;
}
