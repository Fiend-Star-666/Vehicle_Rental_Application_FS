package com.intern.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.carRental.primary.BarcodeReader;

public interface BarcodeReaderRepository extends JpaRepository<BarcodeReader, Integer>{

}
