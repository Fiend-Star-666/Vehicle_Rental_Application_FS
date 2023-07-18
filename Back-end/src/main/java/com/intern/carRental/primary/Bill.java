package com.intern.carRental.primary;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.*;


@Getter
@Setter
@Entity
public class Bill {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	
	private double totalAmount;
	
	@JsonManagedReference(value = "billItem")
	@OneToMany(mappedBy="bill")
	private List<BillItem> billitem;
	
	public Boolean addBillItem() {
		//TODO addBillItem
		return null;
	}
}
