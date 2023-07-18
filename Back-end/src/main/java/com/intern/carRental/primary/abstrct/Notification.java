package com.intern.carRental.primary.abstrct;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.intern.carRental.primary.Bill;
import com.intern.carRental.primary.VehicleReservation;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    //notificationId is replaces by auto generated id
    //private int notificationId;
    private Date createdOn;
    private String content;

    private String phoneNumber;


    @OneToOne
    private Bill bill;

    @JsonManagedReference(value = "Notif")
    @ManyToOne
    private VehicleReservation vehiclereservation;

    public abstract Boolean sendNotification(String str1, String str2);


}
    