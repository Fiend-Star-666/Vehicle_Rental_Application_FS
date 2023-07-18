package com.intern.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intern.DAO.VehicleLogRepository;
import com.intern.DAO.VehicleRepository;
import com.intern.carRental.primary.VehicleLog;
import com.intern.carRental.primary.abstrct.Vehicle;
import com.intern.primary.enums.VehicleLogType;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class VehicleLogController {
	@Autowired
	VehicleLogRepository vehicleLogRepo;
	
	@Autowired
	VehicleRepository vehicleRepo;
	

	@GetMapping("/logs/vehicle/view/{id}")
	public List<VehicleLog> viewVehicleLogByVehicleId(@PathVariable int id){
		 List<VehicleLog> vehicleLogList=vehicleLogRepo.findAllByVehicleId(id);
		 //return
		return vehicleLogList;
	}
	

	@PostMapping("/vehicle/createvehiclelog")
	public VehicleLog createVehicleLogByVehicleId(@RequestBody Map<String, Object> payload) throws ParseException {


		VehicleLog vehicleLog = new VehicleLog();
		vehicleLog.setDescription((String)payload.get("description"));

		Optional<Vehicle> vehicleOptional = vehicleRepo.findById(Integer.parseInt((String)payload.get("vehicleId")));

		if(vehicleOptional.isPresent()) {
			Vehicle vehicle = vehicleOptional.get();
			vehicleLog.setVehicle(vehicle);
		}

		String data=(String)payload.get("creationDate");
		
		Date sdate=new SimpleDateFormat("yyyy-MM-dd").parse(data.substring(0, 10));
	
		
		vehicleLog.setCreationDate(sdate);
		
		String type = (String)payload.get("type");
		
		if(VehicleLogType.Accident.toString().contentEquals(type))
		{
				vehicleLog.setType(VehicleLogType.Accident);
		}
		
		else if(VehicleLogType.CleaningService.toString().contentEquals(type))
		{
			vehicleLog.setType(VehicleLogType.CleaningService);
		}
		
		else if(VehicleLogType.Refueling.toString().contentEquals(type))
		{
			vehicleLog.setType(VehicleLogType.Refueling);
		}
		
		else if(VehicleLogType.OilChange.toString().contentEquals(type))
		{
			vehicleLog.setType(VehicleLogType.OilChange);
		}
		
		else if(VehicleLogType.Repair.toString().contentEquals(type))
		{
			vehicleLog.setType(VehicleLogType.Repair);
		}
		else if(VehicleLogType.Other.toString().contentEquals(type))
		{
			vehicleLog.setType(VehicleLogType.Other);
		}
		
		
		vehicleLogRepo.save(vehicleLog);

		return vehicleLog;
	}
	

	@PutMapping("/updateVehicleLog/{id}")
	public VehicleLog updateVehicleLogByVehicleId(@RequestBody Map<String, Object> payload) throws ParseException 
	{

		Optional<VehicleLog> vehicleLogOptional = vehicleLogRepo.findById(Integer.parseInt((String)payload.get("vehicleLogId")));
		if(vehicleLogOptional.isPresent()) {
			VehicleLog updateVehicleLog = vehicleLogOptional.get();
			updateVehicleLog.setDescription((String) payload.get("description"));

			String data = (String) payload.get("creationDate");
			Date sdate = new SimpleDateFormat("yyyy-MM-dd").parse(data.substring(0, 10));
			updateVehicleLog.setCreationDate(sdate);

			String type = (String) payload.get("type");

			if (VehicleLogType.Accident.toString().contentEquals(type)) {
				updateVehicleLog.setType(VehicleLogType.Accident);
			} else if (VehicleLogType.CleaningService.toString().contentEquals(type)) {
				updateVehicleLog.setType(VehicleLogType.CleaningService);
			} else if (VehicleLogType.Refueling.toString().contentEquals(type)) {
				updateVehicleLog.setType(VehicleLogType.Refueling);
			} else if (VehicleLogType.OilChange.toString().contentEquals(type)) {
				updateVehicleLog.setType(VehicleLogType.OilChange);
			} else if (VehicleLogType.Repair.toString().contentEquals(type)) {
				updateVehicleLog.setType(VehicleLogType.Repair);
			} else if (VehicleLogType.Other.toString().contentEquals(type)) {
				updateVehicleLog.setType(VehicleLogType.Other);
			}

			vehicleLogRepo.save(updateVehicleLog);

			return updateVehicleLog;

		}
		return null;
	}
	
	@GetMapping("/vehicleLog/byID/{vehicleLogId}")
	public VehicleLog getVehicleLogByVehicleLogId(@PathVariable int vehicleLogId) {
		VehicleLog log = vehicleLogRepo.findById(vehicleLogId).orElse(null);
		return log;
	}
	
}

