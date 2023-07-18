package com.intern.carRental.primary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.intern.primary.enums.CarType;
import com.intern.primary.enums.VanType;
import com.intern.primary.enums.VehicleLogType;
import com.intern.primary.enums.VehicleStatus;

public class Rates {
	static Map<String,Integer> ratesObjects= new HashMap<>();
	static Map<String,Integer> ratesVehicles= new HashMap<>();
	static HashSet<String> setReservationID = new HashSet<>();
	static HashSet<String> setServicesID = new HashSet<>();
	static HashSet<String> setEquipmentID = new HashSet<>();
	static HashSet<String> setRentalInsuranceID = new HashSet<>();
	static HashSet<String> setAdditionalDriverID = new HashSet<>();
	
	public static Map<String,Integer> ratesVehicles(){		
			
			ratesVehicles.put(CarType.Compact.toString(), 900);
			ratesVehicles.put(CarType.Economy.toString(), 1000);
			ratesVehicles.put(CarType.Standard.toString(), 1750);
			ratesVehicles.put(CarType.FullSize.toString(), 3500);
			ratesVehicles.put(CarType.Premium.toString(), 4500);
			ratesVehicles.put(CarType.Luxury.toString(), 6000);

			ratesVehicles.put(VanType.Cargo.toString(), 2000);
			ratesVehicles.put(VanType.Passenger.toString(), 1500);
			
			ratesVehicles.put("SUV", 2800);
			
			ratesVehicles.put("Motorcycle", 800);
			
			ratesVehicles.put("Truck", 4000);
					
			
		
		return ratesVehicles;
	}
	
	public static Map<String, Integer> ratesObjects(){
		
		/*
		Services
		    driver
		    roadside assistance
		    wifi
		Equipment   
		    navigation
		    ChildSeat
		    SkiRack
		RentalInsurance
		    PersonalInsurance
		    BelongingInsurance
		    Liability Insurance
		Additional Driver
		
		*/	
		
		
			ratesObjects.put("driver", 1200);
			ratesObjects.put("roadsideAssistance", 500);
			ratesObjects.put("wifi", 100);
			
			ratesObjects.put("navigation", 300);
			ratesObjects.put("childSeat", 600);
			ratesObjects.put("skiRack", 1000);
			
			ratesObjects.put("personalInsurance", 1250);
			ratesObjects.put("belongingInsurance", 5000);
			ratesObjects.put("liabilityInsurance", 1250);
			
			
			ratesObjects.put("additionalDriver", 2000);
			
	
		return ratesObjects;
	}

	public static String reservationIDs(){
		int min=1;
		int max=Integer.MAX_VALUE;
		
		String reservationID=("RID"+(int)(Math.random()*(max-min+1)+min));
		
		setReservationID.add(reservationID);
		
		while(setReservationID.contains(reservationID)){          
			reservationID=("RID"+(int)(Math.random()*(max-min+1)+min));
		}
		
		setReservationID.add(reservationID);
	
	return reservationID;
	}

	public static String servicesIDs(){
		int min=1;
		int max=Integer.MAX_VALUE;
		
		String serviceID=("SID"+(int)(Math.random()*(max-min+1)+min));
		
		setServicesID.add(serviceID);
		
		while(setServicesID.contains(serviceID)){          
			serviceID=("EID"+(int)(Math.random()*(max-min+1)+min));
		}
		
		setServicesID.add(serviceID);
	
		return serviceID;
	}
	
	public static String equipmentIDs(){
		//randomiser
			int min=1;
			int max=Integer.MAX_VALUE;
			
			String equipmentID=("EID"+(int)(Math.random()*(max-min+1)+min));
			
			setEquipmentID.add(equipmentID);
			
			while(setEquipmentID.contains(equipmentID)){          
				equipmentID=("EID"+(int)(Math.random()*(max-min+1)+min));
			}
			
			setEquipmentID.add(equipmentID);
		
		return equipmentID;
	}

	public static String rentalInsuranceIDs(){
		//randomiser
			int min=1;
			int max=Integer.MAX_VALUE;
			
			String rentalInsuranceID=("RIID"+(int)(Math.random()*(max-min+1)+min));
			
			setRentalInsuranceID.add(rentalInsuranceID);
			
			while(setRentalInsuranceID.contains(rentalInsuranceID)){          
				rentalInsuranceID=("RIID"+(int)(Math.random()*(max-min+1)+min));
			}
			
			setRentalInsuranceID.add(rentalInsuranceID);
		
		return rentalInsuranceID;
	}
			
	public static String additionalDriverIDs(){
		//randomiser
			int min=1;
			int max=Integer.MAX_VALUE;
			
			String additionalDriverID=("ADID"+(int)(Math.random()*(max-min+1)+min));
			
			setAdditionalDriverID.add(additionalDriverID);
			
			while(setAdditionalDriverID.contains(additionalDriverID)){          
				additionalDriverID=("ADID"+(int)(Math.random()*(max-min+1)+min));
			}
			
			setAdditionalDriverID.add(additionalDriverID);
		
		return additionalDriverID;
	}	
	
}