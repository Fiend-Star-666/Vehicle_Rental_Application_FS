package com.intern.carRental.primary;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

@Getter
@Setter
@ToString
@Entity
public class BarcodeReader {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date registeredAt;
	private Boolean active;
	
	@OneToOne(targetEntity = Barcode.class) 
	private Barcode barcode;
	
	public Boolean isActive() {
		//TODO isActive
		return null;
	}
}
