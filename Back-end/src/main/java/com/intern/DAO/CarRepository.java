package com.intern.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.carRental.primary.vehicletypes.Car;
import com.intern.primary.enums.CarType;

public interface CarRepository extends JpaRepository<Car, Integer>{
	List<Car> findByType(CarType type);
}
