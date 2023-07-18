package com.intern.carRental.primary.abstrct;

import com.intern.carRental.primary.VehicleReservation;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String equipmentId;


    public abstract Boolean addEquipment();

    @ManyToOne(optional = false)
    private VehicleReservation vehiclereservation;

}
