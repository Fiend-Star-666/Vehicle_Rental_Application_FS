package com.intern.notification.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class Controller {
	
	private Service service;

	@Autowired
	public Controller(Service service) {
		this.service = service;
	}
	
	@PostMapping("/send/sms")
	public void sendSms(@RequestBody SmsRequest smsRequest) {
		service.sendSms(smsRequest);
	}

}
