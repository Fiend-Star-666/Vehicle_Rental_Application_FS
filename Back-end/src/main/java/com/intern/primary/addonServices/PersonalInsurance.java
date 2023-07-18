package com.intern.primary.addonServices;

import com.intern.carRental.primary.abstrct.RentalInsurance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@PrimaryKeyJoinColumn(name="id")
@Entity
public class PersonalInsurance extends RentalInsurance {


    @Override
    public Boolean addInsurance() {
        // TODO Auto-generated method stub
        return null;
    }

}
