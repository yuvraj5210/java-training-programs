package com.doctor.service;

import java.util.List;
import com.doctor.dao.DoctorDaoImpl;
import com.doctor.dao.IDoctorDao;
import com.doctor.exception.DoctorNotFoundException;
import com.doctor.model.Doctor;
import com.doctor.util.DbConnection;
import com.doctor.util.Queries;

public class DoctorServiceImpl implements IDoctorService {

	IDoctorDao dao =new DoctorDaoImpl();
	@Override
	public void addDoctor(Doctor doctor) {
		 
		dao.addDoctor(doctor);
	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		return dao.updateDoctor(doctorId, fees);
		
		
	}

	@Override
	public Doctor getById(int doctorId) {
		return dao.getById(doctorId);
		
	}

	@Override
	public void deleteDoctor(int doctorId) {
		
		dao.deleteDoctor(doctorId);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialtiyAndExp(String sepciality, int experience) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
