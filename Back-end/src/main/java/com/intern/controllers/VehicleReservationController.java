package com.intern.controllers;

import com.intern.DAO.*;
import com.intern.carRental.primary.*;
import com.intern.carRental.primary.abstrct.Vehicle;
import com.intern.notification.email.SimpleTryEmail;
import com.intern.primary.addonServices.*;
import com.intern.primary.enums.BillItemType;
import com.intern.primary.enums.ReservationStatus;
import com.intern.primary.enums.VehicleLogType;
import com.intern.primary.enums.VehicleStatus;
import com.intern.services.impl.AccountServiceImpl;
import com.intern.services.impl.VehicleReservationImpl;
import com.intern.services.impl.VehicleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class VehicleReservationController {


    @Autowired
    AccountRepository accountRepo;

    @Autowired
    VehicleReservationRepository vehicleReservationRepo;

    @Autowired
    CarRentalLocationRepository carRentalLocationRepo;

    @Autowired
    VehicleRepository vehicleRepo;

    @Autowired
    VehicleReservationImpl vehicleReservationImpl;

    @Autowired
    VehicleServiceImpl vehicleServiceImpl;

    @Autowired
    AccountServiceImpl accountServiceImpl;

    @Autowired
    BillItemRepository billItemRepo;

    @Autowired
    BillRepository billRepo;

    @Autowired
    ServiceRepository serviceRepo;

    @Autowired
    EquipmentRepository equipmentRepo;

    @Autowired
    RentalInsuranceRepository rentalInsuranceRepo;

    @Autowired
    AdditionalDriverRepository additionalDriverRepo;

    @Autowired
    ParkingStallRepository parkingStallRepo;

    @Autowired
    NotificationRepository notificationRepo;


    @PostMapping("/CreateVehicleReservation")
    public VehicleReservation createVehicleReservation(@RequestBody Map<String, Object> payload) throws ParseException {

        int sum = 0;

        System.out.println(payload);

        VehicleReservation vehicleReservation = new VehicleReservation();
        vehicleReservationRepo.save(vehicleReservation);

        vehicleReservation.setReservationNumber(Rates.reservationIDs());

        vehicleReservation.setAccount(accountRepo.getById((int) payload.get("accId")));

        String data = (String) payload.get("vehicleId");

        String vehicleID = data.substring(0, 1);
        String vehicletype = data.substring(1);


        vehicleReservation.setVehicle(vehicleRepo.getById(Integer.parseInt(vehicleID)));

        CarRentalLocation pickup = carRentalLocationRepo.getById((Integer) payload.get("pickupLocation"));
        vehicleReservation.setPickupLocationName(pickup.getName());

        CarRentalLocation dropoff = carRentalLocationRepo.getById((Integer) payload.get("returnLocation"));

        vehicleReservation.setReturnLocationName(dropoff.getName());


        String crdata = (String) payload.get("creationDate");
        Date crsdate = new SimpleDateFormat("yyyy-MM-dd").parse(LocalDate.parse(crdata.substring(0, 10)).plusDays(1).toString().substring(0, 10));

        String duedata = (String) payload.get("dueDate");
        Date duesdate = new SimpleDateFormat("yyyy-MM-dd").parse(LocalDate.parse(duedata.substring(0, 10)).plusDays(1).toString().substring(0, 10));


        Bill bill = new Bill();
        bill.setBillitem(new ArrayList<>());
        billRepo.save(bill);

        vehicleReservation.setCreationDate(crsdate);
        vehicleReservation.setDueDate(duesdate);

        long diffInMillies = Math.abs(duesdate.getTime() - crsdate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);


        int duration = (int) diff;
        if (duration <= 0) return null;
        if (vehicleRepo.getById(Integer.parseInt(vehicleID)).getPassengerCapacity() == 5) {

            BillItem billItem = new BillItem();
            int amount = Rates.ratesVehicles().get(vehicletype) * duration;


            billItem.setAmount(amount);
            sum += amount;
            billItem.setBill(bill);
            billItem.setService(BillItemType.BaseCharge.toString());
            billItemRepo.save(billItem);

        } else if (vehicleRepo.getById(Integer.parseInt(vehicleID)).getPassengerCapacity() == 5 && vehicleRepo.getById(Integer.parseInt(vehicleID)).getModel().equalsIgnoreCase("omni")) {
            BillItem billItem = new BillItem();
            int amount = Rates.ratesVehicles().get(vehicletype.toString()) * duration;

            billItem.setAmount(amount);
            billItem.setBill(bill);
            billItem.setService(BillItemType.BaseCharge.toString());
            billItemRepo.save(billItem);
            sum += billItem.getAmount();
        } else if (vehicleRepo.getById(Integer.parseInt(vehicleID)).getPassengerCapacity() == 2) {
            BillItem billItem = new BillItem();
            billItem.setAmount(Rates.ratesVehicles().get("Motorcycle") * duration);

            billItem.setBill(bill);
            billItem.setService(BillItemType.BaseCharge.toString());
            billItemRepo.save(billItem);
            sum += billItem.getAmount();
        } else if (vehicleRepo.getById(Integer.parseInt(vehicleID)).getPassengerCapacity() == 7) {
            BillItem billItem = new BillItem();
            billItem.setAmount(Rates.ratesVehicles().get("SUV") * duration);
            billItem.setBill(bill);
            billItem.setService(BillItemType.BaseCharge.toString());
            billItemRepo.save(billItem);
            sum += billItem.getAmount();
        } else if (vehicleRepo.getById(Integer.parseInt(vehicleID)).getPassengerCapacity() == 3) {
            BillItem billItem = new BillItem();
            billItem.setAmount(Rates.ratesVehicles().get("Truck") * duration);
            billItem.setBill(bill);
            billItem.setService(BillItemType.BaseCharge.toString());
            billItemRepo.save(billItem);

            sum += billItem.getAmount();
        }

        if (Boolean.parseBoolean((String) payload.get("services"))) {
            vehicleReservation.setService(new ArrayList<>());

            if (Boolean.parseBoolean((String) payload.get("driver"))) {
                Driver driver = new Driver();
                driver.setVehiclereservation(vehicleReservation);
                vehicleReservation.getService().add(driver);
                driver.setServiceId(Rates.servicesIDs());

                BillItem billItem = new BillItem();
                billItem.setAmount(Rates.ratesObjects().get("driver") * duration);
                billItem.setBill(bill);
                billItem.setService(BillItemType.AdditionalService.toString());

                billItemRepo.save(billItem);

                serviceRepo.save(driver);

                sum += billItem.getAmount();
            }

            if (Boolean.parseBoolean((String) payload.get("roadsideAssistance"))) {
                RoadsideAssistance roadsideAssistance = new RoadsideAssistance();
                roadsideAssistance.setVehiclereservation(vehicleReservation);
                vehicleReservation.getService().add(roadsideAssistance);
                roadsideAssistance.setServiceId(Rates.servicesIDs());

                BillItem billItem = new BillItem();
                billItem.setAmount(Rates.ratesObjects().get("roadsideAssistance"));
                billItem.setBill(bill);

                billItem.setService(BillItemType.AdditionalService.toString());
                billItemRepo.save(billItem);

                serviceRepo.save(roadsideAssistance);

                sum += billItem.getAmount();
            }

            if (Boolean.parseBoolean((String) payload.get("wifi"))) {
                WiFi wifi = new WiFi();
                wifi.setVehiclereservation(vehicleReservation);
                vehicleReservation.getService().add(wifi);
                wifi.setServiceId(Rates.servicesIDs());


                BillItem billItem = new BillItem();
                billItem.setAmount(Rates.ratesObjects().get("wifi") * duration);
                billItem.setBill(bill);

                billItem.setService(BillItemType.AdditionalService.toString());
                billItemRepo.save(billItem);

                serviceRepo.save(wifi);

                sum += billItem.getAmount();
            }

        } else vehicleReservation.setService(null);

        if (Boolean.parseBoolean((String) payload.get("equipment"))) {
            vehicleReservation.setEquipment(new ArrayList<>());

            if (Boolean.parseBoolean((String) payload.get("navigation"))) {

                Navigation navigation = new Navigation();
                navigation.setVehiclereservation(vehicleReservation);
                vehicleReservation.getEquipment().add(navigation);
                navigation.setEquipmentId(Rates.equipmentIDs());

                BillItem billItem = new BillItem();
                billItem.setAmount(Rates.ratesObjects().get("navigation"));
                billItem.setBill(bill);

                billItem.setService(BillItemType.AdditionalService.toString());
                billItemRepo.save(billItem);

                equipmentRepo.save(navigation);

                sum += billItem.getAmount();
            }

            if (Boolean.parseBoolean((String) payload.get("childSeat"))) {

                ChildSeat childSeat = new ChildSeat();
                childSeat.setVehiclereservation(vehicleReservation);
                vehicleReservation.getEquipment().add(childSeat);
                childSeat.setEquipmentId(Rates.equipmentIDs());

                BillItem billItem = new BillItem();
                billItem.setAmount(Rates.ratesObjects().get("childSeat"));
                billItem.setBill(bill);

                billItem.setService(BillItemType.AdditionalService.toString());
                billItemRepo.save(billItem);

                equipmentRepo.save(childSeat);

                sum += billItem.getAmount();
            }

            if (Boolean.parseBoolean((String) payload.get("skiRack"))) {

                SkiRack skiRack = new SkiRack();
                skiRack.setVehiclereservation(vehicleReservation);
                vehicleReservation.getEquipment().add(skiRack);
                skiRack.setEquipmentId(Rates.equipmentIDs());

                BillItem billItem = new BillItem();
                billItem.setAmount(Rates.ratesObjects().get("skiRack"));
                billItem.setBill(bill);

                billItem.setService(BillItemType.AdditionalService.toString());
                billItemRepo.save(billItem);

                equipmentRepo.save(skiRack);

                sum += billItem.getAmount();
            }

        } else vehicleReservation.setEquipment(null);

        if (Boolean.parseBoolean((String) payload.get("rentalInsurance"))) {
            vehicleReservation.setRentalinsurance(new ArrayList<>());

            if (Boolean.parseBoolean((String) payload.get("personalInsurance"))) {

                PersonalInsurance personalInsurance = new PersonalInsurance();
                personalInsurance.setVehiclereservation(vehicleReservation);
                vehicleReservation.getRentalinsurance().add(personalInsurance);
                personalInsurance.setInsuranceId(Rates.rentalInsuranceIDs());


                BillItem billItem = new BillItem();
                billItem.setAmount(Rates.ratesObjects().get("personalInsurance"));
                billItem.setBill(bill);

                billItem.setService(BillItemType.AdditionalService.toString());
                billItemRepo.save(billItem);

                rentalInsuranceRepo.save(personalInsurance);

                sum += billItem.getAmount();
            }

            if (Boolean.parseBoolean((String) payload.get("belongingInsurance"))) {

                BelongingInsurance belongingInsurance = new BelongingInsurance();
                belongingInsurance.setVehiclereservation(vehicleReservation);
                vehicleReservation.getRentalinsurance().add(belongingInsurance);
                belongingInsurance.setInsuranceId(Rates.rentalInsuranceIDs());

                BillItem billItem = new BillItem();
                billItem.setAmount(Rates.ratesObjects().get("belongingInsurance"));
                billItem.setBill(bill);

                billItem.setService(BillItemType.AdditionalService.toString());
                billItemRepo.save(billItem);

                rentalInsuranceRepo.save(belongingInsurance);

                sum += billItem.getAmount();
            }

            if (Boolean.parseBoolean((String) payload.get("liabilityInsurance"))) {

                LiabilityInsurance liabilityInsurance = new LiabilityInsurance();
                liabilityInsurance.setVehiclereservation(vehicleReservation);
                vehicleReservation.getRentalinsurance().add(liabilityInsurance);

                liabilityInsurance.setInsuranceId(Rates.rentalInsuranceIDs());

                BillItem billItem = new BillItem();
                billItem.setAmount(Rates.ratesObjects().get("liabilityInsurance"));

                billItem.setBill(bill);

                billItem.setService(BillItemType.AdditionalService.toString());
                billItemRepo.save(billItem);

                rentalInsuranceRepo.save(liabilityInsurance);

                sum += billItem.getAmount();
            }

        } else vehicleReservation.setRentalinsurance(null);

        if (Boolean.parseBoolean((String) payload.get("additionalDriver"))) {
            AdditionalDriver additionalDriver = new AdditionalDriver();


            additionalDriver.setPerson(null);    //idk

            additionalDriver.setDriverID(Rates.additionalDriverIDs());

            additionalDriver.setVehicleReservation(vehicleReservation);
            vehicleReservation.setAdditionaldriver(new ArrayList<>());
            vehicleReservation.getAdditionaldriver().add(additionalDriver);

            BillItem billItem = new BillItem();
            billItem.setAmount(Rates.ratesObjects().get("additionalDriver"));

            billItem.setBill(bill);

            billItem.setService(BillItemType.AdditionalService.toString());
            billItemRepo.save(billItem);

            additionalDriverRepo.save(additionalDriver);

            sum += billItem.getAmount();
        } else vehicleReservation.setAdditionaldriver(null);

        vehicleReservation.setBill(bill);    //idk


        bill.setTotalAmount(sum);

        billRepo.save(bill);

        vehicleReservation.setRSstatus(ReservationStatus.Confirmed);

        vehicleReservation.setReturnDate(null);    //tbd


        EmailNotification emailNotif = new EmailNotification();

        emailNotif.setBill(bill);
        emailNotif.setContent("Your Reservation with Id: " + vehicleReservation.getReservationNumber() + " has been created for Vehicle" + vehicleReservation.getVehicle().getMake() + vehicleReservation.getVehicle().getModel()
                + " for the dates between " + crdata + " and " + duedata + " with the total billing amount of " + bill.getTotalAmount());

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();

        Date emaildate = date;


        emailNotif.setCreatedOn(emaildate);

        emailNotif.setPhoneNumber(vehicleReservation.getAccount().getPerson().getPhone());

        emailNotif.setVehiclereservation(vehicleReservation);

        vehicleReservation.setNotification(new ArrayList<>());    //idk

        vehicleReservation.getNotification().add(emailNotif);

        SimpleTryEmail emailsending = new SimpleTryEmail();

        emailsending.sending(emailNotif.getEmail(), "Reservation of Vehicle", emailNotif.getContent());

        vehicleReservationImpl.makeReservation(vehicleReservation);

        vehicleReservation.getAccount().setVehicle(vehicleReservation.getVehicle());

        accountRepo.save(vehicleReservation.getAccount());


        vehicleReservation.getVehicle().setStatus(VehicleStatus.Reserved);

        vehicleReservation.getVehicle().getVehiclereservation().add(vehicleReservation);

        if (vehicleReservation.getVehicle().getParkingstall() != null) {
            int parkingStallId = vehicleReservation.getVehicle().getParkingstall().getId();

            vehicleReservation.getVehicle().setParkingstall(null);

            parkingStallRepo.deleteById(parkingStallId);
        }

        vehicleRepo.save(vehicleReservation.getVehicle());

        return vehicleReservation;
    }

    @DeleteMapping("/RemoveReservation/{VRid}")
    public String removeVehicleReservation(@PathVariable int VRid) throws ParseException {

        vehicleReservationRepo.getById(VRid).getVehicle().setStatus(VehicleStatus.Available);


        vehicleReservationRepo.getById(VRid).getVehicle().setVehiclereservation(null);

        vehicleRepo.save(vehicleReservationRepo.getById(VRid).getVehicle());
		
		/*
		billItemRepo.deleteAll(vehicleReservationRepo.getById(VRid).getBill().getBillitem());
		
		billRepo.deleteById(vehicleReservationRepo.getById(VRid).getBill().getId());
		
		vehicleReservationRepo.deleteById(VRid);
		*/

        SimpleTryEmail emailsending = new SimpleTryEmail();
		/*
		emailsending.sending(emailNotif.getEmail(), "Reservation of Vehicle", emailNotif.getContent());
		*/
        vehicleReservationRepo.getById(VRid).getAccount().setVehicle(null);
        vehicleReservationRepo.getById(VRid).getAccount().getVehiclereservation().remove(vehicleReservationRepo.getById(VRid));


        accountRepo.save(vehicleReservationRepo.getById(VRid).getAccount());
		
		/*
		int parkingStallId=vehicleReservation.getVehicle().getParkingstall().getId();
		
		vehicleReservation.getVehicle().setParkingstall(null);
		
		parkingStallRepo.deleteById(parkingStallId);
		
		
		vehicleRepo.save(vehicleReservation.getVehicle());
		*/
        vehicleReservationImpl.cancelReservation(vehicleReservationRepo.getById(VRid).getReservationNumber());

        return "Cancelled";

    }

    @GetMapping("/vehiclereservation/account/view/{accId}")
    public List<VehicleReservation> getVehicleReservationList(@PathVariable int accId) {

        List<VehicleReservation> vehicleReservation = accountRepo.findById(accId).get().getVehiclereservation();
        return vehicleReservation;
    }

    @GetMapping("/admin/vehiclereservations/view/all")
    public List<VehicleReservation> getVehicleReservationAll() {
        List<VehicleReservation> vehicleReservation = vehicleReservationRepo.findAll();
        return vehicleReservation;
    }

    @GetMapping("/account/vehiclereservation/vehicle/{VRid}")
    public int getVehicleByVRid(@PathVariable int VRid) {
        Vehicle vehicle = vehicleReservationRepo.getById(VRid).getVehicle();
        return vehicle.getId();
    }


	
	/*
	@GetMapping("/vehiclereservations/Locations/all")
	public List<String> getVehicleReservationForCRLoaction(){
			List<String> crLocationNames=new ArrayList<>();
					for(CarRentalLocation x:carRentalLocationRepo.findAll()) {
						crLocationNames.add(x.getName());
						}
		return crLocationNames;
	}
	*/

    @GetMapping("/vehiclereservations/Locations/all")
    public List<CarRentalLocation> getVehicleReservationForCRLoaction() {
        List<CarRentalLocation> crLocations = carRentalLocationRepo.findAll();
					/*for(CarRentalLocation x:carRentalLocationRepo.findAll()) {
						crLocationNames.add(x.getName());
						}*/
        return crLocations;
    }

    @GetMapping("/vehiclereservations/Location/{name}/Vehicles")
    public List<Vehicle> getVehicleViaLocation(String name) {
        List<Vehicle> vehicles = carRentalLocationRepo.findByName(name).getVehicle();
        return vehicles;
    }

    @GetMapping("/account/vehiclereservation/vehicle/pickup/{VRid}")
    public String pickupVehicleByVRId(@PathVariable int VRid) {
        VehicleReservation vehicleReservation = vehicleReservationRepo.findById(VRid).get();

        if (vehicleReservation.getVehicle().getStatus().toString().equalsIgnoreCase("Reserved")) {

            //real: vehicleReservation id
            //		 se vehicle chakki then usse account nikala, fir vehicle status update kra loaned pe and reservation krdi completed and notification
            vehicleReservation.getVehicle().setStatus(VehicleStatus.Loaned);

            vehicleReservation.setRSstatus(ReservationStatus.Completed);

            vehicleServiceImpl.updateVehicle(vehicleReservation.getVehicle());

            vehicleReservationImpl.updateReservation(vehicleReservation);

            EmailNotification emailNotif = new EmailNotification();

            emailNotif.setBill(vehicleReservation.getBill());

            emailNotif.setContent("Hi " + vehicleReservation.getAccount().getPerson().getName() + ",\nYou have Picked your Vehicle: " + vehicleReservation.getVehicle().getMake() + " " + vehicleReservation.getVehicle().getModel() + " with the Reservation Id: " + vehicleReservation.getReservationNumber() + "\nThanks and Regards\n" + vehicleReservation.getVehicle().getCarRentalLocation().getName());
            emailNotif.setCreatedOn(new Date());
            emailNotif.setEmail(vehicleReservation.getAccount().getPerson().getEmail());
            emailNotif.setPhoneNumber(vehicleReservation.getAccount().getPerson().getPhone());

            emailNotif.setVehiclereservation(vehicleReservation);

            vehicleReservation.setNotification(new ArrayList<>());    //idk

            vehicleReservation.getNotification().add(emailNotif);

            SimpleTryEmail emailsending = new SimpleTryEmail();

            emailsending.sending(emailNotif.getEmail(), "Vehicle Picked up Sucessfully", emailNotif.getContent());


            notificationRepo.save(emailNotif);

            return "Picked Up Vehicle";
        }
        return "Error: Either Vehicle is Already picked up or VehicleReservation is already Complete";
    }



    @GetMapping("/account/vehiclereservation/vehicle/return/{VRid}")
    public String returnVehicleByVRId(@PathVariable int VRid) {
        VehicleReservation vehicleReservation = vehicleReservationRepo.findById(VRid).get();
        Double billSum = vehicleReservation.getBill().getTotalAmount();
        if (vehicleReservation.getVehicle().getStatus().toString().equalsIgnoreCase("Loaned")) {

            Date returnDate = new Date();
            long diffrInMillies = Math.abs(returnDate.getTime() - vehicleReservation.getCreationDate().getTime());
            long diffr = TimeUnit.DAYS.convert(diffrInMillies, TimeUnit.MILLISECONDS);

            long diffnInMillies = Math.abs(vehicleReservation.getDueDate().getTime() - vehicleReservation.getCreationDate().getTime());
            long diffn = TimeUnit.DAYS.convert(diffnInMillies, TimeUnit.MILLISECONDS);

            int Nduration = (int) diffn;

            int Rduration = (int) diffr;

            vehicleReservation.setReturnDate(returnDate);

            int baseCharge = 1;

            List<BillItem> billItemLogs = new ArrayList<>();
            billItemLogs.addAll(vehicleReservation.getBill().getBillitem());

            long Charge = 1;

            for (BillItem billItem : billItemLogs) {
                if (billItem.getService().equals("BaseCharge")) {
                    baseCharge = (int) (billItem.getAmount() / diffn);
                    break;
                }
            }

            if (diffr > 0) {
                BillItem billItem = new BillItem();

                int sum = 0;
                sum += Rduration * baseCharge;
                sum += 500 * Rduration;

                billItem.setAmount(sum);
                billItem.setBill(vehicleReservation.getBill());
                billItem.setService(BillItemType.Fine.toString());


                vehicleReservation.getBill().getBillitem().add(billItem);

                billSum += billItem.getAmount();
                vehicleReservation.getBill().setTotalAmount(billSum);

                billRepo.save(vehicleReservation.getBill());
                billItemRepo.save(billItem);

            }

            List<VehicleLog> logs = new ArrayList<>();
            logs.addAll(vehicleReservation.getVehicle().getVehicle_log());

            Boolean accidentFlag = false;

            for (VehicleLog vehicleLog : logs) {
                if (vehicleLog.getType().equals(VehicleLogType.Accident)) {
                    accidentFlag = true;
                    break;
                }
            }

            if (accidentFlag) {
                BillItem billItem = new BillItem();
                int fine = (int) (baseCharge * 10);

                billItem.setAmount(fine);
                billItem.setBill(vehicleReservation.getBill());
                billItem.setService(BillItemType.Fine.toString());

                vehicleReservation.getBill().getBillitem().add(billItem);


                billSum += billItem.getAmount();
                vehicleReservation.getBill().setTotalAmount(billSum);

                billRepo.save(vehicleReservation.getBill());
                billItemRepo.save(billItem);

            }
            double fuelChance = Math.random();

            if (fuelChance < 0.5) {
			/*
			 	Check if the Fuel-Tank is full?
			 		if yes:
			 			Go to next step
			 		
			 		if No:
			 			Calculate fine
			 			
			 			add Fine to the Bill
			 			
			 			Go to next step
			 */
                BillItem billItem = new BillItem();
                int fuelCharge = (int) (2500);

                billItem.setAmount(fuelCharge);
                billItem.setBill(vehicleReservation.getBill());
                billItem.setService(BillItemType.Other.toString());

                vehicleReservation.getBill().getBillitem().add(billItem);


                billSum += billItem.getAmount();
                vehicleReservation.getBill().setTotalAmount(billSum);

                billRepo.save(vehicleReservation.getBill());

                billItemRepo.save(billItem);

            }
	
			
			
			
			
			 /*			
			 	Perform Billing Transaction	
			 	
			 	
			 */

            vehicleReservation.getVehicle().setStatus(VehicleStatus.Available);

            for (CarRentalLocation location : carRentalLocationRepo.findAll()) {
                if (location.getName().equalsIgnoreCase(vehicleReservation.getReturnLocationName())) {
                    vehicleReservation.getVehicle().setCarRentalLocation(location);
                    break;
                }
            }

            vehicleRepo.save(vehicleReservation.getVehicle());
            EmailNotification emailNotif = new EmailNotification();

            emailNotif.setBill(vehicleReservation.getBill());

            emailNotif.setContent("Your have Returned your Vehicle with the Id: " + vehicleReservation.getReservationNumber() + ", for Vehicle" + vehicleReservation.getVehicle().getMake() + vehicleReservation.getVehicle().getModel());
            emailNotif.setCreatedOn(new Date());

            emailNotif.setPhoneNumber(vehicleReservation.getAccount().getPerson().getPhone());

            emailNotif.setVehiclereservation(vehicleReservation);

            vehicleReservation.setNotification(new ArrayList<>());    //idk

            vehicleReservation.getNotification().add(emailNotif);

            SimpleTryEmail emailsending = new SimpleTryEmail();

            emailsending.sending(emailNotif.getEmail(), "Vehicle Returned up Sucessfully", emailNotif.getContent());


            return "Returned Vehicle";
        }
        return "Error: Either Vehicle has not been picked up yet or Vehicle has already been returned";
    }
	/*	
	  	Member ne gaadi thok di, receptionist ko call kra and then receptionist ne
	 	Vehicle log mein change kra accident ka enum
	*/
	
	
	
	
	/*
	 List<CarRentalLocation> crls=carRentalLocationRepo.findAll();
		
		int crlid;
		String returnlction=vehicleReservationRepo.getById(VRid).getReturnLocationName();
		
	 int crlid;
		String returnlction=vehicleReservationRepo.getById(VRid).getReturnLocationName();
		/*
		for (CarRentalLocation carRentalLocation : crls) {
			if(carRentalLocation.getName().equals(returnlction)) {
				crlid=carRentalLocation.getId();
				break;
			}
		} 
	 
	 */

    private EmailNotification createEmailNotification(VehicleReservation vehicleReservation, Bill bill, String crdata, String duedata) {
        EmailNotification emailNotif= new EmailNotification();
        emailNotif.setBill(bill);
        String content = "Your Reservation with Id: "+ vehicleReservation.getReservationNumber() + " has been created for Vehicle"
                + vehicleReservation.getVehicle().getMake() + vehicleReservation.getVehicle().getModel()
                + " for the dates between " + crdata +" and " + duedata +" with the total billing amount of "+ bill.getTotalAmount();
        emailNotif.setContent(content);
        emailNotif.setCreatedOn(new Date());
        emailNotif.setPhoneNumber(vehicleReservation.getAccount().getPerson().getPhone());
        emailNotif.setVehiclereservation(vehicleReservation);
        return emailNotif;
    }

    private void sendEmailNotification(EmailNotification emailNotif) {
        SimpleTryEmail emailsending = new SimpleTryEmail();
        emailsending.sending(emailNotif.getEmail(), "Reservation of Vehicle", emailNotif.getContent());
    }


}