package com.intern.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.carRental.primary.abstrct.Notification;

public interface NotificationRepository extends JpaRepository<Notification,Integer>{

}
