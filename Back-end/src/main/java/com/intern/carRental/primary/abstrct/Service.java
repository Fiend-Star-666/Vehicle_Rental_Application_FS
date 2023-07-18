package com.intern.carRental.primary.abstrct;

import com.intern.carRental.primary.VehicleReservation;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String serviceId;

    @ManyToOne(optional = false)
    private VehicleReservation vehiclereservation;

    public abstract Boolean addService();
}
