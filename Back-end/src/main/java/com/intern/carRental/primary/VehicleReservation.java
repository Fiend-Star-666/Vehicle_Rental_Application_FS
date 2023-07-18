package com.intern.carRental.primary;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.intern.carRental.primary.abstrct.Account;
import com.intern.carRental.primary.abstrct.Equipment;
import com.intern.carRental.primary.abstrct.Notification;
import com.intern.carRental.primary.abstrct.RentalInsurance;
import com.intern.carRental.primary.abstrct.Service;
import com.intern.carRental.primary.abstrct.Vehicle;
import com.intern.primary.enums.ReservationStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class VehicleReservation{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int id;
	private String reservationNumber;
	private Date creationDate;
	//reservationNumber
	@Enumerated(EnumType.STRING)
	private ReservationStatus RSstatus;
	
	private Date dueDate;
	private Date returnDate;
	private String pickupLocationName;
	private String returnLocationName;
	
	@JsonBackReference(value = "accVehicle")
	@ManyToOne
	private Account account;
	
	@JsonManagedReference(value = "addDriver")
	@OneToMany(mappedBy = "vehicleReservation")
	private List<AdditionalDriver> additionaldriver;
	
	@JsonBackReference(value = "Vehicle")
	@ManyToOne
	private Vehicle vehicle;
	
	@OneToOne
	private Bill bill;
	
	@JsonBackReference(value = "Notif")
	@OneToMany(mappedBy = "vehiclereservation") 
	private List<Notification> notification;
	
	@OneToMany(mappedBy = "vehiclereservation")
	private List<Service> service;
	
	@OneToMany(mappedBy = "vehiclereservation") 
	private List<RentalInsurance> rentalinsurance;
	
	@OneToMany(mappedBy= "vehiclereservation")
	private List<Equipment> equipment;
	
	public VehicleReservation fetchDetails() {
		// TODO fetchDetails
		return null;
	}

	/*
	@Override
	public String toString() {
		return "VehicleReservation [id=" + id + ", reservationNumber=" + reservationNumber + ", creationDate="
				+ creationDate + ", RSstatus=" + RSstatus + ", dueDate=" + dueDate + ", returnDate=" + returnDate
				+ ", pickupLocationName=" + pickupLocationName + ", returnLocationName=" + returnLocationName
				+ ", account=" + account + ", additionaldriver=" + additionaldriver + ", vehicle=" + vehicle + ", bill="
				+ bill + ", notification=" + notification + ", service=" + service + ", rentalinsurance="
				+ rentalinsurance + ", equipment=" + equipment + "]";
	}
	*/
	
	//Rates
		
	
	
	
}