package com.intern.carRental.primary.abstrct;

import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.intern.carRental.primary.CarRentalLocation;
import com.intern.carRental.primary.ParkingStall;
import com.intern.carRental.primary.VehicleLog;
import com.intern.carRental.primary.VehicleReservation;
import com.intern.primary.enums.VehicleStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
@Inheritance(strategy =InheritanceType.TABLE_PER_CLASS)
public abstract class Vehicle {

	public Vehicle() {
		super();
	}

	@Id	
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public int id;
	
	private String numberPlate;
	private String stockNumber;
	private int passengerCapacity;

	private Boolean hasSunroof;

	private String model;	
	
	private String make;
	private int manufacturingYear;
	private int mileage;
	
	@Column(unique = true)
	private String barcode;
	
	@Enumerated(EnumType.STRING)
	private VehicleStatus status;
	
	@JsonBackReference(value="CRLocation") 
	@ManyToOne(optional = true)//,fetch = FetchType.LAZY)
	private CarRentalLocation carRentalLocation;
	
	@JsonManagedReference(value = "log")
	@OneToMany(mappedBy = "vehicle")
	private List<VehicleLog> vehicle_log;
	
	
	@JsonManagedReference(value = "Vehicle")
	@OneToMany(mappedBy="vehicle")//,fetch = FetchType.LAZY)
	private List<VehicleReservation> vehiclereservation;
	
	@OneToOne(targetEntity = ParkingStall.class)
	private ParkingStall parkingstall;
	
	public abstract Boolean reserveVehicle();
	
	public abstract Boolean returnVehicle();

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", numberPlate=" + numberPlate + ", stockNumber=" + stockNumber
				+ ", passengerCapacity=" + passengerCapacity + ", hasSunroof=" + hasSunroof + ", model=" + model
				+ ", make=" + make + ", manufacturingYear=" + manufacturingYear + ", mileage=" + mileage + ", barcode="
				+ barcode + ", status=" + status + ", carRentalLocation=" + carRentalLocation + ", vehicle_log="
				+ vehicle_log + ", vehiclereservation=" + vehiclereservation + ", parkingstall=" + parkingstall + "]";
	}
	
}
