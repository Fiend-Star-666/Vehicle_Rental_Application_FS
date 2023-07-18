package com.intern.carRental.primary;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.intern.carRental.primary.abstrct.Vehicle;
import com.intern.primary.enums.VehicleLogType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class VehicleLog {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Enumerated(EnumType.STRING)
	private VehicleLogType type;
	
	private String description;
	private Date creationDate;
	
	@JsonBackReference(value = "log")
	@ManyToOne(optional = false)
	private Vehicle vehicle;
	
	
	public ArrayList<VehicleLogType> searchByLogtype(){
		//TODO searchByLogType
		return null;
	}

}
