package com.intern.services;

import com.intern.carRental.primary.VehicleReservation;

public interface VehicleReservationServices {
	
		void makeReservation(VehicleReservation vehicleReservation);
		void updateReservation(VehicleReservation vehicleReservation);
		void cancelReservation(String vehicleReservationNumber);
	
	
	

}
