package com.intern.DAO;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.intern.carRental.primary.abstrct.Vehicle;

//public interface VehicleRepository extends AbstractVehicleRepository<Vehicle>
public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{
	Vehicle findByBarcode(String barcode);
	Vehicle deleteByBarcode(String barcode);
	List<Vehicle> findAllByModel(String model);
	//Vehicle findById(int id);
	//List<Vehicle> findByType(String type);
	Optional<Vehicle> findById(int id);
	List<Vehicle> findAllByCarRentalLocationId(int id);
	
}
