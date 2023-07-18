package com.intern.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.DAO.BillItemRepository;
import com.intern.DAO.BillRepository;
import com.intern.DAO.EquipmentRepository;
import com.intern.DAO.NotificationRepository;
import com.intern.DAO.PaymentRepository;
import com.intern.DAO.RentalInsuranceRepository;
import com.intern.DAO.ServiceRepository;
import com.intern.DAO.VehicleReservationRepository;
import com.intern.carRental.primary.VehicleReservation;
import com.intern.services.VehicleReservationServices;

@Transactional
@Service
public class VehicleReservationImpl implements VehicleReservationServices {
	
	@Autowired
	private VehicleReservationRepository vehicleReservationRepo;
	
	@Autowired
	private NotificationRepository notificationRepo;
	
	@Autowired
	private BillRepository billRepo;
	
	@Autowired
	private BillItemRepository billItemRepo;
	
	@Autowired
	private PaymentRepository paymentRepo;
	
	@Autowired
	private ServiceRepository serviceRepo;
	
	@Autowired
	private EquipmentRepository equipmentRepo;
	
	@Autowired
	private RentalInsuranceRepository rentalInsuranceRepo;
	
	@Override
	public void makeReservation(VehicleReservation vehiclereservation){
		
		vehicleReservationRepo.save(vehiclereservation);
		System.out.println("save");
	}
	
	@Override
	public void updateReservation(VehicleReservation updatedVehicleReservation){
		
		
		VehicleReservation oldReservation = vehicleReservationRepo.findByreservationNumber(updatedVehicleReservation.getReservationNumber());
		oldReservation.setAccount(updatedVehicleReservation.getAccount());
		oldReservation.setAdditionaldriver(updatedVehicleReservation.getAdditionaldriver());
		oldReservation.setBill(updatedVehicleReservation.getBill());
		oldReservation.setCreationDate(updatedVehicleReservation.getCreationDate());
		oldReservation.setDueDate(updatedVehicleReservation.getDueDate());//Access to be decided
		oldReservation.setEquipment(updatedVehicleReservation.getEquipment());
		oldReservation.setNotification(updatedVehicleReservation.getNotification());
		oldReservation.setPickupLocationName(updatedVehicleReservation.getPickupLocationName());
		oldReservation.setRentalinsurance(updatedVehicleReservation.getRentalinsurance());
		oldReservation.setReturnDate(updatedVehicleReservation.getReturnDate());
		oldReservation.setReturnLocationName(updatedVehicleReservation.getReturnLocationName());
		oldReservation.setRSstatus(updatedVehicleReservation.getRSstatus());
		oldReservation.setService(updatedVehicleReservation.getService());
		oldReservation.setVehicle(updatedVehicleReservation.getVehicle());
		
		vehicleReservationRepo.save(oldReservation);
	}
	
	@Override
	public void cancelReservation(String vehicleReservationNumber){
		
		VehicleReservation vehicleReservation=vehicleReservationRepo.findByreservationNumber(vehicleReservationNumber);

		billItemRepo.deleteAll(vehicleReservation.getBill().getBillitem());
		
		billRepo.deleteById(vehicleReservation.getBill().getId());
		notificationRepo.deleteAll(vehicleReservation.getNotification());
		
		serviceRepo.deleteAll(vehicleReservation.getService());
		equipmentRepo.deleteAll(vehicleReservation.getEquipment());
		rentalInsuranceRepo.deleteAll(vehicleReservation.getRentalinsurance());
		
		vehicleReservationRepo.deleteById(vehicleReservation.getId());
	}
	

	
}

