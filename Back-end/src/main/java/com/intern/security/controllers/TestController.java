package com.intern.security.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class TestController {
	
	  @GetMapping("/test/all")
	  public String allAccess() {
	    return "Public Content.";
	  }

	 @GetMapping("/test/user")
	 @PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
	  public String userAccess() {
	    return "User Content.";
	  }

	  @GetMapping("/test/admin")
	  @PreAuthorize("hasRole('ADMIN')")
	  public String adminAccess() {
	    return "Admin Board.";
	  }
}
