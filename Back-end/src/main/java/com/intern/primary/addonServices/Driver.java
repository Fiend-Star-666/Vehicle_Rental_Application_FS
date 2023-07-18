package com.intern.primary.addonServices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.intern.carRental.primary.abstrct.Service;

//@PrimaryKeyJoinColumn(name="id")
@Entity
public class Driver extends Service{
	

	
	@Override
	public Boolean addService() {
		// TODO Auto-generated method stub
		return null;
	}

}
