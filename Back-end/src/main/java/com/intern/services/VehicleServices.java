package com.intern.services;

import java.util.ArrayList;

import com.intern.carRental.primary.abstrct.Vehicle;

public interface VehicleServices {
	//add
	//modify or update
	//remove
	//search inventory
	
	void addVehicle(Vehicle vehicle);
	void updateVehicle(Vehicle vehicle);
	void removeVehicle(String barcode);
	ArrayList<Vehicle> searchByModel(String model);
	
	
	
}

/*
 * 
Employee saveEmployee(Employee employee);
List<Employee> getAllEmployees();
Employee getEmployeeById(long id);
Employee updateEmployee(Employee employee, long id);
void deleteEmployee(long id);
 */