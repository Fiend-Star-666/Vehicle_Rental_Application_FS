package com.intern.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.intern.carRental.primary.Barcode;


public interface BarcodeRepository extends JpaRepository<Barcode, Integer> {

}
