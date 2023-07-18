package com.intern.controllers;

import com.intern.DAO.CarRentalLocationRepository;
import com.intern.DAO.ParkingStallRepository;
import com.intern.DAO.VehicleRepository;
import com.intern.carRental.primary.ParkingStall;
import com.intern.carRental.primary.VehicleLog;
import com.intern.carRental.primary.abstrct.Vehicle;
import com.intern.carRental.primary.vehicletypes.*;
import com.intern.exception.ResourceNotFoundException;
import com.intern.primary.enums.CarType;
import com.intern.primary.enums.VanType;
import com.intern.primary.enums.VehicleStatus;
import com.intern.services.impl.VehicleServiceImpl;
import freemarker.core.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class VehicleController {

    @Autowired
    VehicleRepository vehicleRepo;

    @Autowired
    VehicleServiceImpl vehicleServiceImpl;

    @Autowired
    CarRentalLocationRepository carRentalLocationRepo;

    @Autowired
    ParkingStallRepository parkingStallRepo;

    @PostMapping("/vehicle/add")
    public Vehicle addVehicleNow(@RequestBody Map<String, Object> payload) throws ParseException {
        Vehicle vehicle = null;
        String vtype = (String) payload.get("vtype");

        if (vtype.contentEquals("Car")) {
            vehicle = new Car();
        } else if (vtype.contentEquals("Truck")) {
            vehicle = new Truck();
        } else if (vtype.contentEquals("SUV")) {
            vehicle = new SUV();
        } else if (vtype.contentEquals("Van")) {
            vehicle = new Van();
        } else if (vtype.contentEquals("Motorcycle")) {
            vehicle = new Motorcycle();
        }


        vehicle.setNumberPlate((String) payload.get("numberPlate"));
        vehicle.setStockNumber((String) payload.get("stockNumber"));
        vehicle.setPassengerCapacity(Integer.parseInt((String) payload.get("passengerCapacity")));
        vehicle.setBarcode((String) payload.get("barcode"));
        vehicle.setHasSunroof(Boolean.parseBoolean((String) payload.get("hasSunroof")));


        String data = (String) payload.get("status");


        if (VehicleStatus.Available.toString().equals(data)) {
            vehicle.setStatus(VehicleStatus.Available);
        } else if (VehicleStatus.Reserved.toString().equals(data)) {
            vehicle.setStatus(VehicleStatus.Reserved);
        } else if (VehicleStatus.Loaned.toString().equals(data)) {
            vehicle.setStatus(VehicleStatus.Loaned);
        } else if (VehicleStatus.Lost.toString().equals(data)) {
            vehicle.setStatus(VehicleStatus.Lost);
        } else if (VehicleStatus.BeingServiced.toString().equals(data)) {
            vehicle.setStatus(VehicleStatus.BeingServiced);
        } else if (VehicleStatus.Other.toString().equals(data)) {
            vehicle.setStatus(VehicleStatus.Other);
        }


        vehicle.setModel((String) payload.get("model"));
        vehicle.setMake((String) payload.get("make"));
        vehicle.setManufacturingYear(Integer.parseInt((String) payload.get("manufacturingYear")));
        vehicle.setMileage(Integer.parseInt((String) payload.get("mileage")));
        vehicle.setCarRentalLocation(carRentalLocationRepo.findByName((String) payload.get("carRentalLocation")));
        vehicle.setVehicle_log(new ArrayList<VehicleLog>());
        vehicle.setVehiclereservation(new ArrayList<>());

        if (payload.get("parkingstall").toString().contentEquals("None")) {
            vehicle.setParkingstall(null);
        } else if (payload.get("parkingstall").toString().contentEquals("Add a Value")) {
            vehicle.setParkingstall(new ParkingStall());
            vehicle.getParkingstall().setStallNumber((String) payload.get("stallNumber"));
            vehicle.getParkingstall().setLocationIdentifier((String) payload.get("locationIdentifier"));
            parkingStallRepo.save(vehicle.getParkingstall());
        }

        String data1 = (String) payload.get("type");

        if (vehicle instanceof Car) {

            if (CarType.Compact.toString().equals(data1)) {
                ((Car) vehicle).setType(CarType.Compact);
            } else if (CarType.Economy.toString().equals(data1)) {
                ((Car) vehicle).setType(CarType.Economy);
            } else if (CarType.FullSize.toString().equals(data1)) {
                ((Car) vehicle).setType(CarType.FullSize);
            } else if (CarType.Intermediate.toString().equals(data1)) {
                ((Car) vehicle).setType(CarType.Intermediate);
            } else if (CarType.Luxury.toString().equals(data1)) {
                ((Car) vehicle).setType(CarType.Luxury);
            } else if (CarType.Premium.toString().equals(data1)) {
                ((Car) vehicle).setType(CarType.Premium);
            } else if (CarType.Standard.toString().equals(data1)) {
                ((Car) vehicle).setType(CarType.Standard);
            }

        } else if (vehicle instanceof Van) {
            if (VanType.Cargo.toString().equals(data1)) {
                ((Van) vehicle).setType(VanType.Cargo);
            }
            if (VanType.Passenger.toString().equals(data1)) {
                ((Van) vehicle).setType(VanType.Cargo);
            }
        } else if (vehicle instanceof SUV) {
            ((SUV) vehicle).setType(data1);
        } else if (vehicle instanceof Motorcycle) {
            ((Motorcycle) vehicle).setType(data1);
        } else if (vehicle instanceof Truck) {
            ((Truck) vehicle).setType(data1);
        }

        //parkingStallRepo.save()
        vehicleServiceImpl.addVehicle(vehicle);

        return vehicle;
    }

	/*
	returning a object and working with it is easier 
	than response entity because of the child objects
	can easily be accessed. 
	 
	@GetMapping("/vehicle/view/") 
	public ResponseEntity<List <Vehicle>> getAllVehicles(){
		List<Vehicle> vehicleList = vehicleRepo.findAll();
		return ResponseEntity.ok(vehicleList);
		}
	*/


    @GetMapping("/vehicle/view")
    public List<Vehicle> getAllVehicles() {
        return vehicleRepo.findAll();
    }


    @GetMapping("/vehicle/view/{id}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable int id) {
        Vehicle vehicle = vehicleRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException(" Vehicle not exist id: " + id));
        return ResponseEntity.ok(vehicle);
    }


    @DeleteMapping("/vehicle/delete/{id}")
    public String removeVehicle(@PathVariable int id) {
        vehicleRepo.deleteById(id);
        return "deleted";
    }

    @PutMapping("/vehicle/edit/{id}")
    public ResponseEntity<Vehicle> editVehicleById(@PathVariable int id, @RequestBody Map<String, Object> payload) {
        Vehicle vehicle = vehicleRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException(" Vehicle not exist id: " + id));

        if (payload.containsKey("numberPlate")) {
            vehicle.setNumberPlate((String) payload.get("numberPlate"));
        }

        if (payload.containsKey("stockNumber")) {
            vehicle.setStockNumber((String) payload.get("stockNumber"));
        }

        if (payload.containsKey("passengerCapacity")) {
            vehicle.setPassengerCapacity(Integer.parseInt((String) payload.get("passengerCapacity")));
        }

        if (payload.containsKey("barcode")) {
            vehicle.setBarcode((String) payload.get("barcode"));
        }

        if (payload.containsKey("hasSunroof")) {
            vehicle.setHasSunroof(Boolean.parseBoolean((String) payload.get("hasSunroof")));
        }

        // Continue with the rest of the attributes...

        vehicleRepo.save(vehicle);  // Save the updated vehicle to the repository

        return ResponseEntity.ok(vehicle);  // Return the updated vehicle
    }

}
/*
	@Autowired
	VehicleRepository vehicleRepo;
	
	@Autowired
	VehicleServiceImpl vehicleServiceImpl;
	
    @PostMapping("/vehicle/add") 
    public Vehicle addVehicleNow(@RequestBody Vehicle vehicle) {
    	
    	//System.out.println(vehicle.toString());
     vehicleServiceImpl.addVehicle(vehicle);
     
     return vehicle;
     	//return vehicleRepo.save(vehicle);
        //return ("<h1>Vehicle added</h1>");    
        //Vehicle vehicle, @RequestParam String numberPlate,@RequestParam String stockNumber, @RequestParam int passangerCapacity,@RequestParam boolean hasSunroof
    }
    
    @GetMapping("/vehicle/view/")
    public List<Vehicle> getAllVehicles(){
    	return vehicleRepo.findAll();
    }
    
    @PutMapping("/vehicle/edit/{id}")
    public ResponseEntity<Vehicle> editVehicleById(@PathVariable int id){
    	//TODO
    	
    	//Vehicle vehicle = vehicleRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException(" Vehicle not exist id: " + id));
        return null;
        //ResponseEntity.ok(vehicle);

    }
    
    
   
    @GetMapping("/vehicle/view/{id}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable int id){
       Vehicle vehicle = vehicleRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException(" Vehicle not exist id: " + id));
       //ystem.out.println(vehicle.toString());
       return ResponseEntity.ok(vehicle);
    }   
    
    
    /*
    @GetMapping("/vehicle/view/{id}")
    public String getVehicleById(@PathVariable int id){
       Vehicle vehicle = vehicleRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException(" Vehicle not exist id: " + id));
       
       return vehicle.toString();
    }   
    *-/
    
    @DeleteMapping("/vehicle/delete/{id}")
    public String removeVehicle(@PathVariable int id)
    {
		vehicleRepo.deleteById(id);
		//vehicleServiceImpl.removeVehicle(id);
		return "deleted";
	}
	
*/