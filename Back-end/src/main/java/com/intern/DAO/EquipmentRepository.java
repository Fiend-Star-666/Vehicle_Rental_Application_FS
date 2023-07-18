package com.intern.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.carRental.primary.abstrct.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment,Integer>{

}
