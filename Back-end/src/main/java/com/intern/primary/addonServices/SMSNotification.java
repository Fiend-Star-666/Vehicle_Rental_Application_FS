package com.intern.primary.addonServices;

import com.intern.carRental.primary.abstrct.Notification;
import com.intern.primary.simplePOJO.Location;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
//@PrimaryKeyJoinColumn(name="id")
@Entity
public class SMSNotification extends Notification {



    private String phonenum;
    private Location address;

    @Override
    public Boolean sendNotification(String Subject, String Body) {
        // TODO Auto-generated method stub
        return null;
    }
}
