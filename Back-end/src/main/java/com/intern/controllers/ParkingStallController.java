package com.intern.controllers;

import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.intern.DAO.ParkingStallRepository;
import com.intern.DAO.VehicleRepository;
import com.intern.carRental.primary.ParkingStall;
import com.intern.services.impl.VehicleServiceImpl;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class ParkingStallController {
	@Autowired
	VehicleRepository vehicleRepo;

	@Autowired
	ParkingStallRepository parkingStallRepo;
	
	@Autowired
	VehicleServiceImpl vehicleServiceImpl;
	

	@GetMapping("/parkingstall/vehicle/view/{id}")
	public ResponseEntity<ParkingStall> getVehicleParkingStall(@PathVariable int id) {
		var vehicleOptional = vehicleRepo.findById(id);
		if (vehicleOptional.isPresent()) {
			ParkingStall parkingStall = vehicleOptional.get().getParkingstall();
			return ResponseEntity.ok(parkingStall);
		} else {
			// Vehicle not found, return a 404 status
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}