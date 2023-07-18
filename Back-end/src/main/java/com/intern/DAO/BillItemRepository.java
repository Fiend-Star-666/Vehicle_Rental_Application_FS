package com.intern.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.carRental.primary.BillItem;

public interface BillItemRepository extends JpaRepository<BillItem,Integer>{

}
