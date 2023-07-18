package com.intern.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.intern.DAO.AccountRepository;
import com.intern.DAO.CarRentalLocationRepository;
import com.intern.DAO.CarRentalSystemRepository;
import com.intern.DAO.MemberRepository;
import com.intern.DAO.ParkingStallRepository;
import com.intern.DAO.ReceptionistRepository;
import com.intern.DAO.VehicleRepository;
import com.intern.carRental.primary.Member;
import com.intern.carRental.primary.Receptionist;
import com.intern.carRental.primary.abstrct.Account;
import com.intern.services.AccountServices;

@Transactional
@Service
public class AccountServiceImpl implements AccountServices {
	
	@Autowired
	private AccountRepository accountRepo;
	@Autowired
	private MemberRepository memberRepo;
	@Autowired
	private ReceptionistRepository receptionistRepo;
	
	//supplementary
	@Autowired
	private VehicleRepository vehicleRepo;
	@Autowired
	private CarRentalSystemRepository carRentalSystemRepo;
	@Autowired
	private CarRentalLocationRepository carRentalLocationRepo;
	@Autowired
	private ParkingStallRepository parkingStallRepo;
	
	@Override
	public void createAccount(Account account) {
		if (account instanceof Member) {
			Member member = (Member) account;
			memberRepo.save(member);
			
		}
		
		if (account instanceof Receptionist) {
			Receptionist receptionist = (Receptionist) account;
			receptionistRepo.save(receptionist);
		}
	}


	@Override
	public void updateAccount(Account updatedAccount) {
		// TODO use this to create these services
		
		if (updatedAccount instanceof Member) {
			Member oldMember =(Member) accountRepo.findByPersonEmail(updatedAccount.getPerson().getEmail());
			
			Member newMember = (Member) updatedAccount;
			
			oldMember.setPerson(newMember.getPerson());
			
			oldMember.setDriverLicenseNumber(newMember.getDriverLicenseNumber());
			oldMember.setDriverLicenseExpiry(newMember.getDriverLicenseExpiry());
			
			oldMember.setPassword(newMember.getPassword());
			
			oldMember.setVehicle(newMember.getVehicle());
			oldMember.setVehiclereservation(newMember.getVehiclereservation());
			
			oldMember.setASstatus(newMember.getASstatus());
			
			memberRepo.save(oldMember);
			System.out.println("Member saved");

		}
		
		if (updatedAccount instanceof Receptionist) {
			
			Receptionist newReceptionist = (Receptionist) updatedAccount;
			Receptionist oldReceptionist =(Receptionist) accountRepo.findByPersonEmail(updatedAccount.getPerson().getEmail());
			

			oldReceptionist.setPerson(newReceptionist.getPerson());
			
			oldReceptionist.setDateJoined(newReceptionist.getDateJoined());
			
			oldReceptionist.setPassword(newReceptionist.getPassword());
			
			oldReceptionist.setVehicle(newReceptionist.getVehicle());
			oldReceptionist.setVehiclereservation(newReceptionist.getVehiclereservation());
			
			oldReceptionist.setASstatus(newReceptionist.getASstatus());
			
			receptionistRepo.save(oldReceptionist);
			System.out.println("Receptionist saved");
		}
			
	}
	
	
	@Override
	public void cancelAccount(String accountEmail) {
		

		Object account = accountRepo.findByPersonEmail(accountEmail);
		
		if (account instanceof Member) {
			Member member = (Member) account;
			accountRepo.deleteById(member.getId());
		}
		if (account instanceof Receptionist) {
			Receptionist receptionist = (Receptionist) account;
			accountRepo.deleteById(receptionist.getId());
		}
		System.out.println("Account Cancelled");		
	}

}