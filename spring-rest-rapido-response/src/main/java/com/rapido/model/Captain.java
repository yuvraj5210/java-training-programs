 package com.rapido.model;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Captain{

	private Integer captianId;
	private String captainName;
	private String vehicleNumber;
	private String drivingLicenseNumber;
	private String password;
	private Date captianSince;
	public Captain() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Captain(Integer captianId, String captainName, String vehicleNumber, String drivingLicenseNumber,
			String password, Date captianSince) {
		super();
		this.captianId = captianId;
		this.captainName = captainName;
		this.vehicleNumber = vehicleNumber;
		this.drivingLicenseNumber = drivingLicenseNumber;
		this.password = password;
		this.captianSince = captianSince;
	}
	public Integer getCaptianId() {
		return captianId;
	}
	public void setCaptianId(Integer captianId) {
		this.captianId = captianId;
	}
	public String getCaptainName() {
		return captainName;
	}
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}
	public void setDrivingLicenseNumber(String drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCaptianSince() {
		return captianSince;
	}
	public void setCaptianSince(Date captianSince) {
		this.captianSince = captianSince;
	}
	@Override
	public String toString() {
		return "Captain [captianId=" + captianId + ", captainName=" + captainName + ", vehicleNumber=" + vehicleNumber
				+ ", drivingLicenseNumber=" + drivingLicenseNumber + ", password=" + password + ", captianSince="
				+ captianSince + "]";
	}
	
	
}
