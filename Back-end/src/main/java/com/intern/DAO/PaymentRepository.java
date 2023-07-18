package com.intern.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.carRental.primary.abstrct.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
