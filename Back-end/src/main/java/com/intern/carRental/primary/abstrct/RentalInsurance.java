package com.intern.carRental.primary.abstrct;

import javax.persistence.*;

import com.intern.carRental.primary.VehicleReservation;

import lombok.*;
@Getter
@Setter
@Entity
@Inheritance(strategy =InheritanceType.TABLE_PER_CLASS)
public abstract class RentalInsurance {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	private String insuranceId;
	
	@ManyToOne(optional = false)
	private VehicleReservation vehiclereservation;
	
	public abstract Boolean addInsurance();
}
