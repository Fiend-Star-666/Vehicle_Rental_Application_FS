package com.intern.carRental.primary.abstrct;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.intern.carRental.primary.VehicleReservation;
import com.intern.carRental.primary.intrfces.Search;
import com.intern.primary.enums.AccountStatus;
import com.intern.primary.simplePOJO.Person;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Inheritance(strategy =InheritanceType.TABLE_PER_CLASS)
public abstract class Account implements Search{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	private String password;
	private Boolean accActive;
    
    private String securityRoles;	//security
	
	@Enumerated(EnumType.STRING)
	private AccountStatus ASstatus;

	@Embedded
	private Person person;
	
	
	//@JsonBackReference
	@OneToOne(targetEntity = Vehicle.class)
	private Vehicle vehicle;
	
	@JsonManagedReference(value = "accVehicle")
	@OneToMany(mappedBy = "account",fetch = FetchType.EAGER)
	private List<VehicleReservation> vehiclereservation;
	
	public abstract Boolean resetPassword();

	public abstract Boolean isAccActive();

	
}