package com.intern.carRental.primary;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.intern.carRental.primary.abstrct.Account;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
//@PrimaryKeyJoinColumn(name="id")  
public class Receptionist extends Account{
	

	private Date dateJoined;
	
    private boolean active;	//security

	
	public void searchMember(String Member) {
		//TODO searchmember
	}

	@Override
	public Boolean resetPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> searchByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> searchByModel(String model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isAccActive() {
		return active;
	}

}