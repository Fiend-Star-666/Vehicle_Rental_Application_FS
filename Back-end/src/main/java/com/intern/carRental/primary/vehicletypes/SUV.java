package com.intern.carRental.primary.vehicletypes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.intern.carRental.primary.abstrct.Vehicle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@PrimaryKeyJoinColumn(name="id")  
@Entity
public class SUV extends Vehicle {
	

	
	private String type;
	
	@Override
	public Boolean reserveVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean returnVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

}
