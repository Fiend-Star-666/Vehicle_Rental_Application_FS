package com.intern.carRental.primary;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.*;

@Getter
@Setter
@Entity
public class BillItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int amount;
	
	private String service;
	
	
	@JsonBackReference(value = "billItem")
	@ManyToOne(optional = false)
	private Bill bill;
}
