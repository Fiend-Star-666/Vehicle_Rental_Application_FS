package com.intern.carRental.primary;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.intern.carRental.primary.abstrct.Vehicle;
import com.intern.primary.simplePOJO.Location;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CarRentalLocation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@Embedded
	private Location address;
	
	@JsonManagedReference(value="CRLocation") 
	@OneToMany(mappedBy = "carRentalLocation")//, fetch = FetchType.LAZY)
	private List<Vehicle> vehicle;
	
	@JsonBackReference(value="CRSystem")
	@ManyToOne(optional = false)
	private CarRentalSystem carRentalSystem;

	@Override
	public String toString() {
		return "CarRentalLocation [id=" + id + ", name=" + name + ", address=" + address + ", vehicle=" + vehicle
				+ ", carRentalSystem=" + carRentalSystem + "]";
	}


}