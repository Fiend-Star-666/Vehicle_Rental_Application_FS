package com.intern.primary.addonServices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.intern.carRental.primary.abstrct.Equipment;

//@PrimaryKeyJoinColumn(name="id")
@Entity
public class ChildSeat extends Equipment{


	
	@Override
	public Boolean addEquipment() {
		// TODO Auto-generated method stub
		return null;
	}

}
