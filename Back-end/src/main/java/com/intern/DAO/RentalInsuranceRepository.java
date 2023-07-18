package com.intern.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.carRental.primary.abstrct.RentalInsurance;

public interface RentalInsuranceRepository extends JpaRepository<RentalInsurance,Integer>{

}
