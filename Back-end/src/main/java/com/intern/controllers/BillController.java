package com.intern.controllers;

import java.util.ArrayList;
import java.util.List;

import com.intern.carRental.primary.VehicleReservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intern.DAO.BillItemRepository;
import com.intern.DAO.BillRepository;
import com.intern.DAO.VehicleReservationRepository;
import com.intern.carRental.primary.Bill;
import com.intern.carRental.primary.BillItem;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class BillController {
	
	@Autowired
	BillRepository billRepo;
	
	@Autowired
	BillItemRepository billItemRepo;
	
	@Autowired
	VehicleReservationRepository vehicleReservationRepo;
	
	@GetMapping("/vehiclereservation/viewbill/{vrId}")
	public List<Object> getAllBillsViaVRId(@PathVariable int vrId){

		List<Object> obj= new ArrayList<>();
		VehicleReservation reservation = vehicleReservationRepo.getById(vrId);
		Bill bill = reservation.getBill();
		if(bill != null){
			obj.add(bill);
		}
		return obj;
	}
	
	@GetMapping("/vehiclereservation/viewbillItem/{vrId}/detailedview/")
	public List<BillItem> getAllBillItemsViaVRId(@PathVariable int vrId){
		List <BillItem> bitem = new ArrayList<>();
		VehicleReservation reservation = vehicleReservationRepo.getById(vrId);
		Bill bill = reservation.getBill();
		if(bill != null){
			bitem = bill.getBillitem();
		}
		return bitem;
	}

}
