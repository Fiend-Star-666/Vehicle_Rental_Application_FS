package com.intern.primary.addonServices;

import com.intern.carRental.primary.abstrct.Notification;
import com.intern.notification.email.SimpleTryEmail;
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
public class EmailNotification extends Notification {



    private String email;

    @Override
    public Boolean sendNotification(String subject, String body) {
        SimpleTryEmail simpleTryEmail = new SimpleTryEmail();

        boolean result = simpleTryEmail.sending(email, subject, body);

        return result;
    }
}
