package com.intern.primary.addonServices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.intern.carRental.primary.abstrct.Payment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@PrimaryKeyJoinColumn(name="id")
@Entity
public class CashTransaction extends Payment{
	

	
	private double cashTendered;

	@Override
	public boolean initiateTransaction() {
		// TODO Auto-generated method stub
		return false;
	}

}
