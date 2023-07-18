package com.intern.carRental.primary;

import com.intern.carRental.primary.abstrct.Account;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
//@PrimaryKeyJoinColumn(name="id")
public class Member extends Account {
    // a primary key is not needed in a table where a table inherits via primary key join column


    private String driverLicenseNumber;
    private Date driverLicenseExpiry;


    public List<VehicleReservation> getReservations() {
        //TODO getreservation
        return null;
    }

    @Override
    public Boolean resetPassword() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<String> searchByType(String type) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<String> searchByModel(String model) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean isAccActive() {
        return true;
    }

}