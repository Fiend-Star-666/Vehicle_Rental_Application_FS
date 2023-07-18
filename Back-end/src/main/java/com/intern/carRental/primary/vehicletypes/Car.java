package com.intern.carRental.primary.vehicletypes;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.intern.carRental.primary.abstrct.Vehicle;
import com.intern.primary.enums.CarType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@PrimaryKeyJoinColumn(name="id")  
//InheritanceType.TABLE_PER_CLASS
public class Car extends Vehicle {

	
	@Enumerated(EnumType.STRING)
	private CarType type;
	
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

	@Override
	public String toString() {
		return "Car [id=" + id + ", type=" + type + ", toString()=" + super.toString() + "]";
	}

	

}
