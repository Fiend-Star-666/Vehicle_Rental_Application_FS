package com.intern.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.carRental.primary.CarRentalLocation;

public interface CarRentalLocationRepository extends JpaRepository<CarRentalLocation, Integer>{
	CarRentalLocation findByName(String name);
}
