package com.intern.services.impl;


import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.intern.DAO.CarRentalLocationRepository;
import com.intern.DAO.CarRentalSystemRepository;
import com.intern.DAO.ParkingStallRepository;
import com.intern.DAO.VehicleRepository;
import com.intern.carRental.primary.abstrct.Vehicle;
import com.intern.carRental.primary.vehicletypes.Car;
import com.intern.carRental.primary.vehicletypes.Motorcycle;
import com.intern.carRental.primary.vehicletypes.SUV;
import com.intern.carRental.primary.vehicletypes.Truck;
import com.intern.carRental.primary.vehicletypes.Van;
import com.intern.services.VehicleServices;

@Transactional
@Service
public class VehicleServiceImpl implements VehicleServices {
	
	@Autowired
	private VehicleRepository vehicleRepo;
	
	@Autowired
	private CarRentalSystemRepository carRentalSystemRepo;
	
	@Autowired
	private CarRentalLocationRepository carRentalLocationRepo;
	
	@Autowired
	private ParkingStallRepository parkingStallRepo;
	
	
	
	/* autowired works
	public VehicleServiceImpl(CarRentalLocationRepository carRentalLocationRepo,
			  				  CarRentalSystemRepository carRentalSystemRepo,
			  				  ParkingStallRepository parkingStallRepo,
			  				  VehicleRepository vehicleRepo) 
	{
		super();
		
		this.carRentalLocationRepo = carRentalLocationRepo;
		this.carRentalSystemRepo = carRentalSystemRepo;
		this.parkingStallRepo = parkingStallRepo;
		
		this.vehicleRepo = vehicleRepo;
	}*/

	@Override
	public void addVehicle(Vehicle vehicle) {
		// Object keyword used to generalize
		vehicleRepo.save(vehicle);
		/*
		if (vehicle instanceof Car) {
			Car newVehicle = (Car) vehicle;
			vehicleRepo.save(newVehicle);
			
		}

		if (vehicle instanceof Motorcycle) {
			Motorcycle newVehicle = (Motorcycle) vehicle;
			vehicleRepo.save(newVehicle);
		}

		if (vehicle instanceof Truck) {
			Truck newVehicle = (Truck) vehicle;
			vehicleRepo.save(newVehicle);
		}

		if (vehicle instanceof SUV) {
			SUV newVehicle = (SUV) vehicle;
			vehicleRepo.save(newVehicle);
		}

		if (vehicle instanceof Van) {
			Van newVehicle = (Van) vehicle;
			vehicleRepo.save(newVehicle);
		}
		*/
	}

	// TODO correct it
	@Override
	public void updateVehicle(Vehicle updatedVehicle) {
		//when id is given
		vehicleRepo.save(updatedVehicle);
		
		
		
		//when id is not given
		//Vehicle vehicleOld = vehicleRepo.findByBarcode(updatedVehicle.getBarcode());

		/*
		if(updatedVehicle instanceof Car){
			
			Car vehicleLatest = (Car) updatedVehicle;
			Car vehicleOld = (Car)vehicleRepo.findByBarcode(updatedVehicle.getBarcode());
			vehicleOld=vehicleLatest;
			/*vehicleOld.setNumberPlate(vehicleLatest.getNumberPlate());
			vehicleOld.setStockNumber(vehicleLatest.getStockNumber());
			vehicleOld.setPassengerCapacity(vehicleLatest.getPassengerCapacity());
			vehicleOld.setHasSunroof(vehicleLatest.getHasSunroof());
			vehicleOld.setModel(vehicleLatest.getModel());
			vehicleOld.setMake(vehicleLatest.getMake());
			vehicleOld.setManufacturingYear(vehicleLatest.getManufacturingYear());
			vehicleOld.setMileage(vehicleLatest.getMileage());
			vehicleOld.setBarcode(vehicleLatest.getBarcode());
			vehicleOld.setStatus(vehicleLatest.getStatus());
			vehicleOld.setCarRentalLocation(vehicleLatest.getCarRentalLocation());
			vehicleOld.setParkingstall(vehicleLatest.getParkingstall());
			
			*-/
			vehicleRepo.save(vehicleOld);
			
			System.out.println("car updated");
		}
		
		if(updatedVehicle instanceof SUV){
			
			SUV vehicleLatest = (SUV) updatedVehicle;
			SUV vehicleOld = (SUV)vehicleRepo.findByBarcode(updatedVehicle.getBarcode());

			vehicleOld.setNumberPlate(vehicleLatest.getNumberPlate());
			vehicleOld.setStockNumber(vehicleLatest.getStockNumber());
			vehicleOld.setPassengerCapacity(vehicleLatest.getPassengerCapacity());
			vehicleOld.setHasSunroof(vehicleLatest.getHasSunroof());
			vehicleOld.setModel(vehicleLatest.getModel());
			vehicleOld.setMake(vehicleLatest.getMake());
			vehicleOld.setManufacturingYear(vehicleLatest.getManufacturingYear());
			vehicleOld.setMileage(vehicleLatest.getMileage());
			vehicleOld.setBarcode(vehicleLatest.getBarcode());
			vehicleOld.setStatus(vehicleLatest.getStatus());
			vehicleOld.setCarRentalLocation(vehicleLatest.getCarRentalLocation());
			vehicleOld.setParkingstall(vehicleLatest.getParkingstall());
			vehicleRepo.save(vehicleOld);
			
		}
		
		if(updatedVehicle instanceof Motorcycle){
			Motorcycle vehicleLatest = (Motorcycle) updatedVehicle;
			Motorcycle vehicleOld = (Motorcycle)vehicleRepo.findByBarcode(updatedVehicle.getBarcode());

			vehicleOld.setNumberPlate(vehicleLatest.getNumberPlate());
			vehicleOld.setStockNumber(vehicleLatest.getStockNumber());
			vehicleOld.setPassengerCapacity(vehicleLatest.getPassengerCapacity());
			vehicleOld.setHasSunroof(vehicleLatest.getHasSunroof());
			vehicleOld.setModel(vehicleLatest.getModel());
			vehicleOld.setMake(vehicleLatest.getMake());
			vehicleOld.setManufacturingYear(vehicleLatest.getManufacturingYear());
			vehicleOld.setMileage(vehicleLatest.getMileage());
			vehicleOld.setBarcode(vehicleLatest.getBarcode());
			vehicleOld.setStatus(vehicleLatest.getStatus());
			vehicleOld.setCarRentalLocation(vehicleLatest.getCarRentalLocation());
			vehicleOld.setParkingstall(vehicleLatest.getParkingstall());
			vehicleRepo.save(vehicleOld);

			}
			
			
		if(updatedVehicle instanceof Truck){

			Truck vehicleLatest = (Truck) updatedVehicle;
			Truck vehicleOld = (Truck)vehicleRepo.findByBarcode(updatedVehicle.getBarcode());

			vehicleOld.setNumberPlate(vehicleLatest.getNumberPlate());
			vehicleOld.setStockNumber(vehicleLatest.getStockNumber());
			vehicleOld.setPassengerCapacity(vehicleLatest.getPassengerCapacity());
			vehicleOld.setHasSunroof(vehicleLatest.getHasSunroof());
			vehicleOld.setModel(vehicleLatest.getModel());
			vehicleOld.setMake(vehicleLatest.getMake());
			vehicleOld.setManufacturingYear(vehicleLatest.getManufacturingYear());
			vehicleOld.setMileage(vehicleLatest.getMileage());
			vehicleOld.setBarcode(vehicleLatest.getBarcode());
			vehicleOld.setStatus(vehicleLatest.getStatus());
			vehicleOld.setCarRentalLocation(vehicleLatest.getCarRentalLocation());
			vehicleOld.setParkingstall(vehicleLatest.getParkingstall());
			vehicleRepo.save(vehicleOld);
			}
			
		if(updatedVehicle instanceof Van){
			Van vehicleLatest = (Van) updatedVehicle;
			Van vehicleOld = (Van)vehicleRepo.findByBarcode(updatedVehicle.getBarcode());

			vehicleOld.setNumberPlate(vehicleLatest.getNumberPlate());
			vehicleOld.setStockNumber(vehicleLatest.getStockNumber());
			vehicleOld.setPassengerCapacity(vehicleLatest.getPassengerCapacity());
			vehicleOld.setHasSunroof(vehicleLatest.getHasSunroof());
			vehicleOld.setModel(vehicleLatest.getModel());
			vehicleOld.setMake(vehicleLatest.getMake());
			vehicleOld.setManufacturingYear(vehicleLatest.getManufacturingYear());
			vehicleOld.setMileage(vehicleLatest.getMileage());
			vehicleOld.setBarcode(vehicleLatest.getBarcode());
			vehicleOld.setStatus(vehicleLatest.getStatus());
			vehicleOld.setCarRentalLocation(vehicleLatest.getCarRentalLocation());
			vehicleOld.setParkingstall(vehicleLatest.getParkingstall());
			vehicleRepo.save(vehicleOld);
			}
			*/
	}

	@Override
	public void removeVehicle(String barcode) {
		Object vehicle= vehicleRepo.findByBarcode(barcode);
		
		if (vehicle instanceof Car) {
			
			Car newVehicle = (Car) vehicle;
			/*
			ParkingStall parkingStall= newVehicle.getParkingstall();
			CarRentalLocation carRentalLocation= newVehicle.getCarRentalLocation();
			CarRentalSystem carRentalSystem = carRentalLocation.getCarRentalSystem();
			*/
		//for testing
		
			//System.out.println("ID:"+parkingStall.getId());
			vehicleRepo.deleteById(newVehicle.getId());
			
			//System.out.println("ID_location:"+carRentalLocation.getId());
			//carRentalLocationRepo.deleteById(carRentalLocation.getId());
			
			//System.out.println("ID_system:"+carRentalSystem.getId());
		//carRentalSystemRepo.deleteById(carRentalSystem.getId());
			
			//System.out.println("ID_parkingStall:"+parkingStall.getId());
			//parkingStallRepo.deleteById(parkingStall.getId());
			
		}

		if (vehicle instanceof Motorcycle) {
			Motorcycle newVehicle = (Motorcycle) vehicle;
			vehicleRepo.deleteById(newVehicle.getId());
			/*
			ParkingStall parkingStall= newVehicle.getParkingstall();
			CarRentalLocation carRentalLocation= newVehicle.getCarRentalLocation();
			CarRentalSystem carRentalSystem = carRentalLocation.getCarRentalSystem();
			
			vehicleRepo.deleteById(newVehicle.getId());
			carRentalLocationRepo.deleteById(carRentalLocation.getId());
			//carRentalSystemRepo.deleteById(carRentalSystem.getId());
			parkingStallRepo.deleteById(parkingStall.getId());*/
		}

		if (vehicle instanceof Truck) {
			Truck newVehicle = (Truck) vehicle;
			vehicleRepo.deleteById(newVehicle.getId());
			/*
			ParkingStall parkingStall= newVehicle.getParkingstall();
			CarRentalLocation carRentalLocation= newVehicle.getCarRentalLocation();
			CarRentalSystem carRentalSystem = carRentalLocation.getCarRentalSystem();
			
			vehicleRepo.deleteById(newVehicle.getId());
			carRentalLocationRepo.deleteById(carRentalLocation.getId());
			//carRentalSystemRepo.deleteById(carRentalSystem.getId());
			parkingStallRepo.deleteById(parkingStall.getId());
			*/
		}

		if (vehicle instanceof SUV) {
			SUV newVehicle = (SUV) vehicle;
			vehicleRepo.deleteById(newVehicle.getId());
			/*
			ParkingStall parkingStall= newVehicle.getParkingstall();
			CarRentalLocation carRentalLocation= newVehicle.getCarRentalLocation();
			CarRentalSystem carRentalSystem = carRentalLocation.getCarRentalSystem();
			
			vehicleRepo.deleteById(newVehicle.getId());
			carRentalLocationRepo.deleteById(carRentalLocation.getId());
			//carRentalSystemRepo.deleteById(carRentalSystem.getId());
			parkingStallRepo.deleteById(parkingStall.getId());
			*/
		}

		if (vehicle instanceof Van) {
			Van newVehicle = (Van) vehicle;
			vehicleRepo.deleteById(newVehicle.getId());
			/*
			ParkingStall parkingStall= newVehicle.getParkingstall();
			CarRentalLocation carRentalLocation= newVehicle.getCarRentalLocation();
			CarRentalSystem carRentalSystem = carRentalLocation.getCarRentalSystem();
			
			vehicleRepo.deleteById(newVehicle.getId());
			carRentalLocationRepo.deleteById(carRentalLocation.getId());
			//carRentalSystemRepo.deleteById(carRentalSystem.getId());
			parkingStallRepo.deleteById(parkingStall.getId());
			*/
		}		
	}


	
	@Override
	public ArrayList<Vehicle> searchByModel(String model) {
		ArrayList<Vehicle> modelVehicles = (ArrayList<Vehicle>) vehicleRepo.findAllByModel(model);
		/*
			Vehicle modelvehicle=
			modelVehicles.add(modelvehicle);
		*/
		ArrayList<Vehicle> searchedVehicles = new ArrayList<>();
		
		for(Vehicle vehicle: modelVehicles)
		{
			if (vehicle instanceof Car) {
				Car newVehicle = (Car) vehicle;
				searchedVehicles.add(newVehicle);
				continue;
			}

			if (vehicle instanceof Motorcycle) {
				Motorcycle newVehicle = (Motorcycle) vehicle;
				searchedVehicles.add(newVehicle);
			}

			if (vehicle instanceof Truck) {
				Truck newVehicle = (Truck) vehicle;
				searchedVehicles.add(newVehicle);
			}

			if (vehicle instanceof SUV) {
				SUV newVehicle = (SUV) vehicle;
				searchedVehicles.add(newVehicle);
			}

			if (vehicle instanceof Van) {
				Van newVehicle = (Van) vehicle;
				searchedVehicles.add(newVehicle);
			}
		}
		return searchedVehicles;
	}
	
}

/*
 * @Override public Employee updateEmployee(Employee employee, long id) {
 * 
 * // we need to check whether employee with given id is exist in DB or not
 * Employee existingEmployee = employeeRepository.findById(id).orElseThrow( ()
 * -> new ResourceNotFoundException("Employee", "Id", id));
 * 
 * existingEmployee.setFirstName(employee.getFirstName());
 * existingEmployee.setLastName(employee.getLastName());
 * existingEmployee.setEmail(employee.getEmail()); // save existing employee to
 * DB employeeRepository.save(existingEmployee); return existingEmployee; }
 */