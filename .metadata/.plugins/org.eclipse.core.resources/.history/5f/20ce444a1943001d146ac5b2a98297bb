package com.cab.repository;

import java.util.ArrayList;
import java.util.List;

import com.cab.model.Driver;

public class DriverRepository {
	
	static List<Driver> driverList = new ArrayList<>();

	public List<Driver> getDriverList() {
		return this.driverList;
	}

	public void setDriverList(ArrayList<Driver> driverList) {
		this.driverList = driverList;
	}
	
	public void addDriverInList(Driver driver)
	{
		this.driverList.add(driver);
	}
	
	public List<Driver> DisplayList()
	{
		return this.driverList;
	}
	
	public void setDriverUnavailable(String Name)
	{
		for(int i=0; i<driverList.size(); i++)
		{
			if(Name.equals(driverList.get(i).getDriverCarName()))
			{
				driverList.get(i).setDriverStatus(false);
			}
		}
	}
}
