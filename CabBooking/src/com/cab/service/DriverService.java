package com.cab.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cab.model.Driver;
import com.cab.model.User;
import com.cab.repository.DriverRepository;

public class DriverService {

	
	Scanner scanner = new Scanner(System.in);
	DriverRepository driverrepository = new DriverRepository();
	
	public void add_driver(String driverName, String driverGender, int driverAge, String driverCarName, String driverCarNumber, int[] driverCoordinate, boolean driverStatus)
	{
		try {
			Driver driver = new Driver(driverName, driverGender, driverAge, driverCarName, driverCarNumber, driverCoordinate, driverStatus);
			
			driverrepository.addDriverInList(driver);
			System.out.println("Driver added successfully");
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}
	
	public void display_drivers()
	{
		List <Driver> driverList =driverrepository.getDriverList();
		System.out.println("Name\t Gender\t Age\t Car 5name\t car number\t X-Coordinate\t Y-Coordinate \tAvailability");
		for(int i=0; i<driverList.size(); i++)
		{
			System.out.println(driverList.get(i).getDriverName() +"\t"+ driverList.get(i).getDriverGender() +"\t"+ driverList.get(i).getDriverAge() +"\t" +driverList.get(i).getDriverCarName() +"\t"+ driverList.get(i).getDriverCarNumber() +"\t"+ driverList.get(i).getDriverCoordinate()[0] +"\t"+ driverList.get(i).getDriverCoordinate()[1]+"\t" +driverList.get(i).isDriverStatus());
		}
	}
}
