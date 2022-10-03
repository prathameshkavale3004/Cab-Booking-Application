package com.cab.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {
	
	private String driverName;
	private String driverGender;
	private int DriverAge;
	private String driverCarName;
	private String driverCarNumber;
	private int[] driverCoordinate = new int[2];
	private boolean driverStatus;
	
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverGender() {
		return driverGender;
	}
	public void setDriverGender(String driverGender) {
		this.driverGender = driverGender;
	}
	public int getDriverAge() {
		return DriverAge;
	}
	public void setDriverAge(int driverAge) {
		DriverAge = driverAge;
	}
	public String getDriverCarName() {
		return driverCarName;
	}
	public void setDriverCarName(String driverCarName) {
		this.driverCarName = driverCarName;
	}
	public String getDriverCarNumber() {
		return driverCarNumber;
	}
	public void setDriverCarNumber(String driverCarNuber) {
		this.driverCarNumber = driverCarNuber;
	}
	public int[] getDriverCoordinate() {
		return driverCoordinate;
	}
	public void setDriverCoordinate(int[] driverCoordinate) {
		this.driverCoordinate = driverCoordinate;
	}
	public boolean isDriverStatus() {
		return driverStatus;
	}
	public void setDriverStatus(boolean driverStatus) {
		this.driverStatus = driverStatus;
	}
	
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Driver(String driverName, String driverGender, int driverAge, String driverCarName, String driverCarNumber,
			int[] driverCoordinate, boolean driverStatus) {
		super();
		this.driverName = driverName;
		this.driverGender = driverGender;
		DriverAge = driverAge;
		this.driverCarName = driverCarName;
		this.driverCarNumber = driverCarNumber;
		this.driverCoordinate = driverCoordinate;
		this.driverStatus = driverStatus;
	}
	
	@Override
	public String toString() {
		return "Driver [driverName=" + driverName + ", driverGender=" + driverGender + ", DriverAge=" + DriverAge
				+ ", driverCarName=" + driverCarName + ", driverCarNumber=" + driverCarNumber + ", driverCoordinate="
				+ Arrays.toString(driverCoordinate) + ", driverStatus=" + driverStatus + "]";
	}
	
}
