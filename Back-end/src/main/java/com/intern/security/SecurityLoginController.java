package com.intern.security;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class SecurityLoginController {
	

    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome User</h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome Admin</h1>");
    }
   
    
}

/*
@PostMapping("/employees")
public Vehicle createEmployee(@RequestBody Vehicle vehicle){
    return vehicleRepo.save(vehicle);
}*/

/*
@GetMapping("/vehicle/{id}")
public Vehicle getVehicleById(@PathVariable int id){

   Optional<Vehicle> vehicle = vehicleRepo.findById(id);

	  if(vehicle.isPresent()) {
		  return vehicle.get();
	  }
	  
	  else{ 
		  	return null;
	   }
}
*/

