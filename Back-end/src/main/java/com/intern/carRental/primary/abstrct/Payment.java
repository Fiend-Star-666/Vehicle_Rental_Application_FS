package com.intern.carRental.primary.abstrct;

import java.util.*;

import javax.persistence.*;

import com.intern.carRental.primary.Bill;
import com.intern.primary.enums.PaymentStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy =InheritanceType.TABLE_PER_CLASS)
public abstract class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private Date creationDate;
	

	private double amount;
	
	@Enumerated(EnumType.STRING)
	private PaymentStatus status;
	
	public abstract boolean initiateTransaction();
	
	@OneToOne(optional = false)
	private Bill bill;
	

	 

}