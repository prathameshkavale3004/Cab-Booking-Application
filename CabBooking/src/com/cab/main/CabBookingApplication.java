package com.cab.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cab.model.Driver;
import com.cab.service.BookCab;
import com.cab.service.DriverService;
import com.cab.service.UserService;



public class CabBookingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Cab Booking System");
		
		Scanner scanner = new Scanner(System.in);
		
		
		UserService userservice = new UserService();
		DriverService driverservice = new DriverService();
		BookCab bookcab = new BookCab();
		
		
		int choice=0;
		while(choice!=6) {
			System.out.println();
			System.out.println("Enter your choice: ");
			System.out.println("1. Add User\n2. Add Driver\n3. Book a Cab\n4. Display Users\n5. Display Drivers\n6. exit");
			choice = scanner.nextInt();
			

			switch(choice) {
			
			case 1:
				try {
					System.out.println("Enter user name:");
					String userName = scanner.next();	
					String userGender;
					do {
						System.out.println("please choose valid option");
						System.out.println("Enter gender (M/F):");
						userGender = scanner.next();
					} while (userGender=="M" || userGender=="F" || userGender=="m" || userGender=="f");
					System.out.println("Enter age:");
					int userAge = scanner.nextInt();
					
					userservice.add_user(userName, userGender, userAge);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case 2: 
				try {
					System.out.println("Enter driver name:");
					String driverName = scanner.next();
					String driverGender;
					do {
						System.out.println("please choose valid option");
						System.out.println("Enter gender (M/F):");
						driverGender = scanner.next();
					} while (driverGender=="M" || driverGender=="F" || driverGender=="M" || driverGender=="M");
					System.out.println("Enter driver age:");
					int driverAge = scanner.nextInt();
					System.out.println("Enter Car Name:");
					String driverCarName = scanner.next();
					System.out.println("Enter Car Number:");
					String driverCarNumber = scanner.next();
					System.out.println("Enter Driver X Coordiante: ");
					int driverXCoordinate = scanner.nextInt();
					System.out.println("Enter Driver Y Coordiante: ");
					int driverYCoordinate = scanner.nextInt();
					int[] driverCoordinate = {driverXCoordinate, driverYCoordinate};
					/*System.out.println("Enter Driver status: ");
					boolean driverStatus = scanner.nextBoolean();*/
					
					driverservice.add_driver(driverName, driverGender, driverAge, driverCarName, driverCarNumber, driverCoordinate, true);
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
				
			case 3:
				try {
					System.out.println("Enter name: ");
					String key = scanner.next();
					boolean ans = userservice.search_User(key);
					if(ans==true) {
						System.out.println("User Found");
						System.out.println("Enter source X-Coordinate: ");
						int sourceX = scanner.nextInt();
						System.out.println("Enter source Y-Coordinate: ");
						int sourceY = scanner.nextInt();
						
						int[] source = {sourceX, sourceY};
						
						System.out.println("Enter destination X-Coordinate: ");
						int destinationX = scanner.nextInt();
						System.out.println("Enter destination Y-Coordinate: ");
						int destinationY = scanner.nextInt();
						
						int[] destination = {destinationX, destinationY};
						
						
						List<Driver> listOfAvailableDriver = bookcab.find_ride(key, source, destination);
						
						if(listOfAvailableDriver.size()>0)
						{
							System.out.println();
							System.out.println("List of available cabs");
							//System.out.println("Name\t Gender\t Age\t Car 5name\t car number\t X-Coordinate\t Y-Coordinate ");
							for(int i=0; i<listOfAvailableDriver.size(); i++)
							{
								System.out.println("Driver"+(i+1));
								System.out.println("Driver Name: "+listOfAvailableDriver.get(i).getDriverName() +"\nDriver Gender: "+ listOfAvailableDriver.get(i).getDriverGender() +"\nDriver Age: "+ listOfAvailableDriver.get(i).getDriverAge() +"\nCar Name: " +listOfAvailableDriver.get(i).getDriverCarName() +"\nCar Number"+ listOfAvailableDriver.get(i).getDriverCarNumber() +"\nCar Coordinates: ["+ listOfAvailableDriver.get(i).getDriverCoordinate()[0] +" , "+ listOfAvailableDriver.get(i).getDriverCoordinate()[1]+"]\n");
							}
							System.out.println();
							System.out.println("Enter name of cab driver which you want to book:");
							String name = scanner.next();
							bookcab.choose_ride(key, name);
						}
						else {
							System.out.println("No ride found");
						}
					}
					else {
						System.out.println("User not find. Please try Again");
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				
				
				break;
			case 4:
				try {
					userservice.displayList();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				try {
					driverservice.display_drivers();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				
				break;
			default:
				System.out.println("Enter correct choice");
			}
		}

	}

}
