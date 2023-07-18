package com.intern.controllers;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.intern.DAO.CarRentalSystemRepository;
import com.intern.carRental.primary.CarRentalSystem;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class CarRentalSystemController {
	@Autowired
	CarRentalSystemRepository carRentalSystemRepo;


	@GetMapping("/home/system")
	public List<CarRentalSystem> getCRSystems() {
		List<CarRentalSystem> carRentalSystems = Optional.ofNullable(carRentalSystemRepo.findAll()).orElse(Collections.emptyList());
		return carRentalSystems;
	}
}
