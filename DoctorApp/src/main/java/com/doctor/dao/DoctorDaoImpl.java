package com.doctor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.doctor.exception.DoctorNotFoundException;
import com.doctor.model.Doctor;
import com.doctor.util.DbConnection;
import com.doctor.util.Queries;

public class DoctorDaoImpl implements IDoctorDao {

	@Override
	public void addDoctor(Doctor doctor) {
		Connection connection = DbConnection.openConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.INSERTQUERY);
			preparedStatement.setString(1, doctor.getDoctorName());
			preparedStatement.setInt(2, doctor.getDoctorId());
			preparedStatement.setString(3, doctor.getSpeciality());
			preparedStatement.setInt(4, doctor.getExperience());
			preparedStatement.setDouble(5, doctor.getFees());
			preparedStatement.setTimestamp(6, Timestamp.valueOf(doctor.getStartTime()));
			preparedStatement.setTimestamp(7, Timestamp.valueOf(doctor.getEndTime()));
			preparedStatement.execute();
			System.out.println("values inserted...");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbConnection.closeConnection();
		}

	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		int x = 0;
		Connection connection = DbConnection.openConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.UPDATEQUERY);
			preparedStatement.setDouble(1, fees);
			preparedStatement.setInt(2, doctorId);
			x = preparedStatement.executeUpdate();
			System.out.println("updated.....");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbConnection.closeConnection();
			return x;
		}
	}

	@Override
	public Doctor getById(int doctorId) {
		ResultSet resultSet = null;
		Connection connection = DbConnection.openConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.QUERYBYID);
			preparedStatement.setInt(1, doctorId);
			resultSet = preparedStatement.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbConnection.closeConnection();
			return (Doctor) resultSet;
		}
	}

	@Override
	public void deleteDoctor(int doctorId) {
		Connection connection = DbConnection.openConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.DELETEQUERY);
			preparedStatement.setInt(1, doctorId);
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbConnection.closeConnection();
			System.out.println("data deleted...");
		}

	}

	@Override
	public List<Doctor> findAllDoctors() {
		List<Doctor> doctors = new ArrayList<>();
		ResultSet resultSet = null;
		Connection connection = DbConnection.openConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETALL);
			resultSet = preparedStatement.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbConnection.closeConnection();
		}

		if (resultSet != null) {
			try {
				while (resultSet.next()) {
//					String doctorName, Integer doctorId, String speciality, double fees, int experience,
					// LocalDateTime startTime, LocalDateTime endTime
					String name = resultSet.getString("doctorName");
					Integer exp = resultSet.getInt("experience");
					String speciality = resultSet.getString("speciality");

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;

	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException {
		List<Doctor> doctors = new ArrayList<>();
		ResultSet rs = null;
		Connection connection = DbConnection.openConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.QUERYBYSPECIALITY);
			preparedStatement.setString(1, speciality);
			rs = preparedStatement.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbConnection.closeConnection();
		}

		if (rs != null) {
			try {
				while (rs.next()) {
                   //String doctorName, Integer doctorId, String speciality, double fees, int experience,
					// LocalDateTime startTime, LocalDateTime endTime

					String doctorname = rs.getString("doctorName");
					int doctorid = rs.getInt("doctorId");
					String speciality1 = rs.getString("speciality");
					int experience = rs.getInt("experience");
					double fees = rs.getDouble("fees");
					LocalDateTime startTime = rs.getTimestamp("startTime").toLocalDateTime();
					LocalDateTime endtime = rs.getTimestamp("endTime").toLocalDateTime();
					Doctor doctor = new Doctor(doctorname, doctorid, speciality1, fees, experience, startTime, endtime);
					doctors.add(doctor);

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return doctors;
	}

	@Override
	public List<Doctor> finBySpecialtiyAndExp(String speciality, int experience) throws DoctorNotFoundException {
		Connection connection;
		List<Doctor> doctors = null;
		Doctor doctor = null;
		try {
			connection = DbConnection.openConnection();
			PreparedStatement statement = connection.prepareStatement(Queries.QUERYBYSPECIALITYEXP);
			statement.setString(1, speciality);
			statement.setInt(2, experience);
			ResultSet rs = statement.executeQuery();
			while (rs.next())

			{
				String doctorname = rs.getString("doctorName");
				int doctorid = rs.getInt("doctorId");
				String specialityCopy = rs.getString("speciality");
				int experienceCopy = rs.getInt("experience");
				double fees = rs.getDouble("fees");
				LocalDateTime startTime = rs.getTimestamp("startTime").toLocalDateTime();
				LocalDateTime endtime = rs.getTimestamp("endTime").toLocalDateTime();
				doctor = new Doctor(doctorname, doctorid, speciality, fees, experience, startTime, endtime);
				doctors.add(doctor);
			}

		} catch (SQLException e)
		{

			e.printStackTrace();
		} finally
		{

			DbConnection.closeConnection();
		}

		return doctors;
	}

	@Override
	public List<Doctor> findBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException {
	
		Connection connection;
		List<Doctor> doctors = null;
		Doctor doctor = null;
		try {
			connection = DbConnection.openConnection();
			PreparedStatement statement = connection.prepareStatement(Queries.QUERYBYSPECIALITYFEES);
			statement.setString(1, speciality);
			statement.setDouble(2, fees);
			ResultSet rs = statement.executeQuery();
			while (rs.next())

			{
				String doctorname = rs.getString("doctorName");
				int doctorid = rs.getInt("doctorId");
				String specialityCopy = rs.getString("speciality");
				int experienceCopy = rs.getInt("experience");
				double feesCopy = rs.getDouble("fees");
				LocalDateTime startTime = rs.getTimestamp("startTime").toLocalDateTime();
				LocalDateTime endtime = rs.getTimestamp("endTime").toLocalDateTime();
				doctor = new Doctor(doctorname, doctorid, speciality, fees, experienceCopy, startTime, endtime);
				doctors.add(doctor);
			}

		} catch (SQLException e)
		{

			e.printStackTrace();
		} finally
		{

			DbConnection.closeConnection();
		}

		return doctors;
	}

}
