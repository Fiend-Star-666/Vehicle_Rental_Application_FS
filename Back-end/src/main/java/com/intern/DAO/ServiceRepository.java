package com.intern.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.carRental.primary.abstrct.Service;

public interface ServiceRepository extends JpaRepository<Service,Integer>{

}
