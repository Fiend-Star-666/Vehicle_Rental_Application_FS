package com.intern.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.intern.DAO.CarRentalLocationRepository;
import com.intern.DAO.CarRentalSystemRepository;
import com.intern.DAO.VehicleRepository;
import com.intern.carRental.primary.CarRentalLocation;
import com.intern.carRental.primary.VehicleReservation;
import com.intern.carRental.primary.abstrct.Vehicle;
import com.intern.primary.simplePOJO.Location;
import com.intern.services.impl.VehicleServiceImpl;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class CarRentalLocationController {
	@Autowired
	VehicleRepository vehicleRepo;

	@Autowired
	CarRentalLocationRepository carRentalLocationRepo;
	
	@Autowired
	VehicleServiceImpl vehicleServiceImpl;
	
	@Autowired
	CarRentalSystemRepository carRentalSystemRepo;
	

	@GetMapping("/carrentallocation/vehicle/view/{id}")
	public ResponseEntity<CarRentalLocation> getCRLocationForVehicle(@PathVariable int id) {
		CarRentalLocation carRentalLocation=vehicleRepo.findById(id).get().getCarRentalLocation();
		return ResponseEntity.ok(carRentalLocation);
	}
	

	@GetMapping("/carrentallocation/{id}/vehicles")
	public List<Vehicle> getVehiclesOfCRlLocation(@PathVariable int id) {
		List<Vehicle> vehicleList=vehicleRepo.findAllByCarRentalLocationId(id);
		return vehicleList;	
	}
	

	@GetMapping("/carrentallocations/view")
	public List<CarRentalLocation> getCRLocations() {
		List<CarRentalLocation> carRentalLocations=carRentalLocationRepo.findAll();
		return carRentalLocations;
	}
	

	@GetMapping("/admin/vehiclereservation/carrentallocation/view/vehicle/{vehicleId}")
	public List<VehicleReservation> getVehicleReservationPerLocation(@PathVariable int vehicleId) {
		List<VehicleReservation> vehicleReservationAtCRLocations=vehicleRepo.findById(vehicleId).get().getVehiclereservation();
		return vehicleReservationAtCRLocations;
	}
	
	@PostMapping("/admin/carrentallocation/add")
	public CarRentalLocation addCRLocation(@RequestBody Map<String, Object> payload)
    {	
		
		CarRentalLocation crLocation=new CarRentalLocation();
		
		crLocation.setName((String)payload.get("name"));
		
		Location address = new Location();
    
		address.setStreetAddress((String)payload.get("streetAddress"));
    	address.setCity((String)payload.get("city"));
    	address.setZipcode((String)payload.get("zipcode"));
    	address.setState((String)payload.get("state"));
    	address.setCountry((String)payload.get("country"));
      
    	crLocation.setAddress(address);
    	

		crLocation.setCarRentalSystem(carRentalSystemRepo.getById(1));	//hardCode
		
		crLocation.setVehicle(new ArrayList<>());
		
		carRentalLocationRepo.save(crLocation);
		
		return crLocation;
    }	

}
