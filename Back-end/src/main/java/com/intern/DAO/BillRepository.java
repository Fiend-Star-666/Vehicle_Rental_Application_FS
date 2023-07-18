package com.intern.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.carRental.primary.Bill;

public interface BillRepository extends JpaRepository<Bill,Integer>{

}
