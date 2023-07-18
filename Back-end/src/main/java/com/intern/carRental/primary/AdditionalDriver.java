package com.intern.carRental.primary;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.intern.primary.simplePOJO.Person;
import lombok.*;


@Getter
@Setter
@Entity
public class AdditionalDriver {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	private int id;
	
	@JsonBackReference(value = "addDriver")
	@ManyToOne(optional = false)
	private VehicleReservation vehicleReservation;
	
	private String driverID;
	
	@Embedded
	private Person person;

}
