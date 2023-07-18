package com.intern.carRental.primary;

import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import com.intern.carRental.primary.abstrct.Vehicle;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.*;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Barcode {
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Id
	private int id;
	private String barcode;
	
	private Date issuedAt;
	private boolean active;
	
	@OneToOne(optional = false)
	private Vehicle vehicle;
	
	public Boolean isActive(){
		return active;
	}
}
