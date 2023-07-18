package com.intern.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.carRental.primary.CarRentalSystem;

public interface CarRentalSystemRepository extends JpaRepository<CarRentalSystem, Integer>{

}
