package com.intern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
public class ComplexTesting {

	@Test
	public void contextLoads() {
	}

//
//	@Autowired
//	VehicleServiceImpl vehicleServiceImpl;
//
//	@Autowired
//	AccountServiceImpl accountServiceImpl;
//
//	@Autowired
//	VehicleReservationImpl vehicleReservationImpl;
//
//	//Autowiring Repo:
//
//	@Autowired
//	private BarcodeReaderRepository barcodeReaderRepo;
//
//	@Autowired
//	private CarRentalSystemRepository carRentalSystemRepo;
//
//	@Autowired
//	private CarRentalLocationRepository carRentalLocationRepo;
//
//	@Autowired
//	private ParkingStallRepository parkingStallRepo;
//
//	@Autowired
//	private VehicleRepository vehicleRepo;
//
//	@Autowired
//	private CarRepository carRepo;
//
//	@Autowired
//	private BarcodeRepository barcodeRepo;
//
//	@Autowired
//	private AccountRepository accountRepo;
//
//	@Autowired
//	private MemberRepository memberRepo;
//
//	@Autowired
//	private ReceptionistRepository receptionistRepo;
//
//	@Autowired
//	private BillRepository billRepo;
//
//	@Autowired
//	private BillItemRepository billItemRepo;
//
//	@Autowired
//	private PaymentRepository paymentRepo;
//
//	@Autowired
//	private AdditionalDriverRepository additionalDriverRepo;
//
//	@Autowired
//	private NotificationRepository notificationRepo;
//
//	@Autowired
//	private VehicleReservationRepository vehicleReservationRepo;
//
//	@Autowired
//	private PasswordEncoder passwordEncoder;
////______________________________________________
//
//	//All variables will be globally Declared
//	Car carVehicle1;
//	Barcode barCarVehicle1;
//	CarRentalSystem carRentalSystem1;
//	CarRentalLocation carRentalLocation1;
//	Member memCarVehicle1;
//	Date date1;
//	Date date2;
//	Location address1;
//	Person person1;
//	VehicleReservation carVehicle1Reservation;
//	BarcodeReader barCodeReaderVehicle1;
//	ParkingStall carParkingStallV1;
//	Notification webNotification;
//	Notification mobNotification;
//
//
////________________________________________________
//
//	Car carVehicle2;
//	Barcode barCarVehicle2;
//	CarRentalSystem carRentalSystem2;
//	CarRentalLocation carRentalLocation2;
//	Member memCarVehicle2;
//	Date carDate1;
//	Date carDate2;
//	Location address2;
//	Person person2;
//	VehicleReservation carVehicle2Reservation;
//	BarcodeReader barCodeReaderVehicle2;
//	ParkingStall carParkingStallV2;
//
//
//
//	Car carVehicle3;
//	Barcode barCarVehicle3;
//	CarRentalSystem carRentalSystem3;
//	CarRentalLocation carRentalLocation3;
//	Member memCarVehicle3;
//	Date car3Date1;
//	Date car3Date2;
//	Location address3;
//	Person person3;
//	VehicleReservation carVehicle3Reservation;
//	BarcodeReader barCodeReaderVehicle3;
//	ParkingStall carParkingStallV3;
//
//
//
//
//	Van vanVehicle1;
//	Barcode barVanVehicle1;
//	CarRentalSystem vanRentalSystem4;
//	CarRentalLocation vanRentalLocation4;
//	Member memVanVehicle1;
//	Date vanDate1;
//	Date vanDate2;
//	Location address4;
//	Person person4;
//	VehicleReservation vanVehicle1Reservation;
//	BarcodeReader barCodeReaderVan1;
//	ParkingStall vanParkingStallV1;
//
//
//
//	Van vanVehicle2;
//	Barcode barVanVehicle2;
//	CarRentalSystem vanRentalSystem5;
//	CarRentalLocation vanRentalLocation5;
//	Member memVanVehicle2;
//	Date van2Date1;
//	Date van2date2;
//	Location address5;
//	Person person5;
//	VehicleReservation vanVehicle2Reservation;
//	BarcodeReader barCodeReaderVan2;
//	ParkingStall vanParkingStallV2;
//
//
//	Truck truckVehicle1;
//	Member memTruckVehicle1;
//	Barcode barTruckVehicle1;
//	BarcodeReader barCodeReaderTruckVehicle1;
//	CarRentalSystem truckRentalSystem6;
//	CarRentalLocation truckRentalLocation6;
//
//
//	SUV suvVehicle1;
//	Barcode barSuvVehicle1;
//	CarRentalSystem suvRentalSystem7;
//	CarRentalLocation suvRentalLocation7;
//
//
//	Motorcycle motorcycleVehicle1;
//	Barcode barMotorCycleVehicle1;
//	CarRentalSystem motorCycleSystem8;
//	CarRentalLocation motorCycleLocation8;
//
//
//
////____________________________________________________________
//
//
//	//Create 10-20 Dates use from other files
//	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
//
//	String sDate1 = "11/04/2022 12:00";
//
//
//	String sDate2 = "15/05/2022 12:00";
//
//
//	String sDate3 = "17/05/2022 14:00";
//
//
//	String sDate4 = "17/05/2022 14:00";
//
//
//
////________________________________________________________________________________
//
//	@Test
//	void basicFramework() throws Exception{
//
//		/*
//		 * fully populated system of the table with
//		 * multiple Vehicles,
//		 * Barcodes and
//		 * their carRentalSystem, CarRentalLocations, ParkingStall
//		 * multiple Members
//		 * and Receptionists
//		 * Vehicle Reservations
//		*/
//
//
//		/*
//		 * if a Vehicle status is available:
//		 * parking stall
//		 * vehicle
//		 * carREntal location and system
//		 * no vehicle log	//later
//		 * no reservation
//		 * no account linkage
//		 *
//		 */
//
//		/*
//		 * if a Vehicle status is reserved:
//		 * parking stall null
//		 * vehicle
//		 * carREntal location and system
//		 * vehicle log	//later
//		 * vehicle reservation
//		 * account linkage
//		 */
//
//		/*
//		 * if a vehicle status is lost:
//		 * almost everything null except necessary stuff
//		 */
//
//	 //________________________________________
//
//		Date date1 =  dateFormat.parse(sDate1);
//
//		Date date2 =  dateFormat.parse(sDate2);
//
//		Date date3 =  dateFormat.parse(sDate3);
//
//		address1 = new Location();
//		address1.setCity("NOIDA");
//		address1.setCountry("INDIA");
//		address1.setState("UP");
//		address1.setStreetAddress("CHI-2");
//		address1.setZipcode("110076");
//
//
//		person1 = new Person();
//		person1.setEmail("hihi@gmail.com");
//		person1.setAddress(address1);
//		person1.setName("Sherlock");
//		person1.setPhone("976689779");
//
//
//		carVehicle1 = new Car();
//
//		carVehicle1.setType(CarType.Premium);
//			carVehicle1.setNumberPlate("ABCD12345");
//			carVehicle1.setStockNumber("XXXO09");
//			carVehicle1.setPassengerCapacity(4);
//			carVehicle1.setBarcode("1111152");
//			carVehicle1.setHasSunroof(true);
//			carVehicle1.setStatus(VehicleStatus.Available);
//			carVehicle1.setModel("Mustang");
//			carVehicle1.setMake("Ford");
//			carVehicle1.setManufacturingYear(2015);
//			carVehicle1.setMileage(12);
//			carRentalLocation1=new CarRentalLocation();
//			carVehicle1.setCarRentalLocation(carRentalLocation1);
//				carRentalSystem1=new CarRentalSystem();
//				carRentalSystem1.setName("vehicle1");
//				carRentalSystem1.setCarRentalLocation(new ArrayList());
//
//					carRentalSystem1.getCarRentalLocation().add(carRentalLocation1);
//
//					carRentalSystemRepo.save(carRentalSystem1);
//
//				carRentalLocation1.setCarRentalSystem(carRentalSystem1);
//				carRentalLocation1.setVehicle(new ArrayList<>());
//				carRentalLocation1.getVehicle().add(carVehicle1);
//				carRentalLocation1.setName("Pickup Location");
//				carRentalLocation1.setAddress(address1);
//					carRentalLocationRepo.save(carRentalLocation1);
//
//					//carVehicle1.getCarRentalLocation().setCarRentalSystem(carRentalSystem1);
//
//				carParkingStallV1 = new ParkingStall();
//				carParkingStallV1.setLocationIdentifier("12AS");
//				carParkingStallV1.setStallNumber("22");
//			parkingStallRepo.save(carParkingStallV1);
//
//			carVehicle1.setParkingstall(carParkingStallV1);
//			carVehicle1.setVehicle_log(null);
//
//			carVehicle1.setVehiclereservation(new ArrayList<>());
//
//
//		vehicleServiceImpl.addVehicle(carVehicle1);
//
//		barCarVehicle1=new Barcode();
//
//			barCarVehicle1.setVehicle(carVehicle1);
//			barCarVehicle1.setBarcode(carVehicle1.getBarcode());
//			barCarVehicle1.setIssuedAt(null);
//			barCarVehicle1.setActive(false);
//
//		barcodeRepo.save(barCarVehicle1);
//
//	//vaibhav and lokendra ka raita
//			memCarVehicle1=new Member();
//			memCarVehicle1.setASstatus(AccountStatus.Active);
//			memCarVehicle1.setDriverLicenseExpiry(date1);
//			memCarVehicle1.setDriverLicenseNumber("123456789");
//				memCarVehicle1.setPassword(passwordEncoder.encode("qwerty"));	//Password encoding
//			memCarVehicle1.setVehicle(carVehicle1);
//			memCarVehicle1.setVehiclereservation(new ArrayList<>());
//			memCarVehicle1.setPerson(person1);
//			memCarVehicle1.setAccActive(true);
////memCarVehicle1.setSecurityRoles("ROLE_ADMIN");
//			memCarVehicle1.setSecurityRoles("ROLE_USER");
//
//			//id hasnt been set
//		accountServiceImpl.createAccount(memCarVehicle1);
//			barCodeReaderVehicle1=new BarcodeReader();
//			barCodeReaderVehicle1.setBarcode(barCarVehicle1);
//			barCodeReaderVehicle1.setRegisteredAt(date2);
//
//			barCodeReaderVehicle1.setActive(null);
//		  	//id hasnt been set
//		barcodeReaderRepo.save(barCodeReaderVehicle1);
//
//		carVehicle1Reservation = new VehicleReservation();
//			carVehicle1Reservation.setAccount(memCarVehicle1);
//
//
//			//dates to check inventory of vehicles
//			carVehicle1Reservation.setCreationDate(date1);
//			carVehicle1Reservation.setDueDate(date2);
//			carVehicle1Reservation.setReturnDate(date3);
//
//			//vehicle set
//			carVehicle1Reservation.setVehicle(carVehicle1);
//
//			//location data+status
//			carVehicle1Reservation.setPickupLocationName("Panchkula");
//			carVehicle1Reservation.setReturnLocationName("Patiala");
//
//			//vehiclereservation1.setAdditionaldriver(new ArrayList<>());
//			//vehiclereservation1.getAdditionaldriver().add(additionaldriver1);
//
//			//TODO 3rd party stuff
//			carVehicle1Reservation.setService(null);
//			carVehicle1Reservation.setRentalinsurance(null);
//			carVehicle1Reservation.setEquipment(null);
//
//			carVehicle1Reservation.setReservationNumber("grlv98");
//
//			//billItem();
//
//			carVehicle1Reservation.setBill(null);
//
//			//Payment();
//
//			/*
//			if(payment1.getStatus().equals(PaymentStatus.Completed)){
//				vehiclereservation1.setRSstatus(ReservationStatus.Confirmed);
//			}*/
//
//			//notification();
//
//			carVehicle1Reservation.setNotification(null);
//			carVehicle1Reservation.setRSstatus(ReservationStatus.Pending);
//			//vehiclereservation1.setNotification(new ArrayList<>());
//
//			//vehiclereservation1.getNotification().add(webnotification);
//			//vehiclereservation1.getNotification().add(mobilenotification);
//
//
//			//billRepo.save(bill1);
//
//			//billItemRepo.save(billItem1);
//			//billItemRepo.save(billItem2);
//
//			//paymentRepo.save(payment1);
//
//			vehicleReservationImpl.makeReservation(carVehicle1Reservation);
//
//			//additionalDriverRepo.save(additionaldriver1);
//
//			//notificationRepo.save(mobilenotification);
//			//notificationRepo.save(webnotification);
//
//			carVehicle1.getVehiclereservation().add(carVehicle1Reservation);
//			vehicleServiceImpl.updateVehicle(carVehicle1);
///*
//	//________________________________________________________________________________________________________________________
//		//CarVehicle2
//
//		Date carDate1 =  dateFormat.parse(sDate1);
//
//		Date carDate2 =  dateFormat.parse(sDate2);
//
//		Date carDate3 =  dateFormat.parse(sDate3);
//
//		address2 = new Location();
//		address2.setCity("LUCKNOW");
//		address2.setCountry("INDIA");
//		address2.setState("UP");
//		address2.setStreetAddress("LUK-77");
//		address2.setZipcode("226004");
//
//
//		person2 = new Person();
//		person2.setEmail("who@gmail.com");
//		person2.setAddress(address2);
//		person2.setName("Katherine");
//		person2.setPhone("9658935514");
//
//
//		carVehicle2 = new Car();
//
//		carVehicle2.setType(CarType.Economy);
//			carVehicle1.setNumberPlate("XYZA99674");
//			carVehicle1.setStockNumber("YYQP87");
//			carVehicle1.setPassengerCapacity(4);
//			carVehicle1.setBarcode("98UDSSS");
//			carVehicle1.setHasSunroof(false);
//			carVehicle1.setStatus(VehicleStatus.Available);
//			carVehicle1.setModel("VERNA");
//			carVehicle1.setMake("HYUNDAI");
//			carVehicle1.setManufacturingYear(2018);
//			carVehicle1.setMileage(14);
//			carRentalLocation2=new CarRentalLocation();
//			carVehicle2.setCarRentalLocation(carRentalLocation2);
//				carRentalSystem2=new CarRentalSystem();
//				carRentalSystem2.setName("vehicle2");
//				carRentalSystem2.setCarRentalLocation(new ArrayList());
//
//					carRentalSystem2.getCarRentalLocation().add(carRentalLocation2);
//
//					carRentalSystemRepo.save(carRentalSystem2);
//
//				carRentalLocation2.setCarRentalSystem(carRentalSystem2);
//				carRentalLocation2.setVehicle(new ArrayList<>());
//				carRentalLocation2.getVehicle().add(carVehicle2);
//				carRentalLocation2.setName("Pickup Location");
//				carRentalLocation2.setAddress(address2);
//					carRentalLocationRepo.save(carRentalLocation2);
//
//					carVehicle2.getCarRentalLocation().setCarRentalSystem(carRentalSystem2);
//
//				carParkingStallV2 = new ParkingStall();
//				carParkingStallV2.setLocationIdentifier("12GS");
//				carParkingStallV2.setStallNumber("25");
//			parkingStallRepo.save(carParkingStallV2);
//
//			carVehicle1.setParkingstall(carParkingStallV2);
//			carVehicle1.setVehicle_log(null);
//
//			carVehicle1.setVehiclereservation(new ArrayList<>());
//
//
//		vehicleServiceImpl.addVehicle(carVehicle2);
//
//		barCarVehicle2=new Barcode();
//
//			barCarVehicle2.setVehicle(carVehicle2);
//			barCarVehicle2.setBarcode(carVehicle2.getBarcode());
//			barCarVehicle2.setIssuedAt(null);
//			barCarVehicle2.setActive(false);
//
//		barcodeRepo.save(barCarVehicle2);
//
//	//vaibhav and lokendra ka raita
//			memCarVehicle2=new Member();
//			memCarVehicle2.setASstatus(AccountStatus.Active);
//			memCarVehicle2.setDriverLicenseExpiry(carDate1);
//			memCarVehicle2.setDriverLicenseNumber("9844FTRS1");
//				memCarVehicle2.setPassword(passwordEncoder.encode("castle"));	//Password encoding
//			memCarVehicle2.setVehicle(carVehicle2);
//			memCarVehicle2.setVehiclereservation(new ArrayList<>());
//			memCarVehicle2.setPerson(person2);
//			memCarVehicle2.setAccActive(true);
////memCarVehicle1.setSecurityRoles("ROLE_ADMIN");
//			memCarVehicle2.setSecurityRoles("ROLE_USER");
//
//			//id hasnt been set
//		accountServiceImpl.createAccount(memCarVehicle2);
//			barCodeReaderVehicle2=new BarcodeReader();
//			barCodeReaderVehicle2.setBarcode(barCarVehicle2);
//			barCodeReaderVehicle2.setRegisteredAt(carDate2);
//
//			barCodeReaderVehicle2.setActive(null);
//		  	//id hasnt been set
//		barcodeReaderRepo.save(barCodeReaderVehicle2);
//
//		carVehicle2Reservation = new VehicleReservation();
//			carVehicle2Reservation.setAccount(memCarVehicle2);
//
//
//			//dates to check inventory of vehicles
//			carVehicle2Reservation.setCreationDate(carDate1);
//			carVehicle2Reservation.setDueDate(carDate2);
//			carVehicle2Reservation.setReturnDate(carDate3);
//
//			//vehicle set
//			carVehicle2Reservation.setVehicle(carVehicle2);
//
//			//location data+status
//			carVehicle2Reservation.setPickupLocationName("Delhi");
//			carVehicle2Reservation.setReturnLocationName("Gurugram");
//
//			//vehiclereservation1.setAdditionaldriver(new ArrayList<>());
//			//vehiclereservation1.getAdditionaldriver().add(additionaldriver1);
//
//			//TODO 3rd party stuff
//			carVehicle2Reservation.setService(null);
//			carVehicle2Reservation.setRentalinsurance(null);
//			carVehicle2Reservation.setEquipment(null);
//
//			carVehicle2Reservation.setReservationNumber("lkck45");
//
//			//billItem();
//
//			carVehicle2Reservation.setBill(null);
//
//			//Payment();
//
//			/*
//			if(payment1.getStatus().equals(PaymentStatus.Completed)){
//				vehiclereservation1.setRSstatus(ReservationStatus.Confirmed);
//			}*-/
//
//			//notification();
//
//			carVehicle2Reservation.setNotification(null);
//			carVehicle2Reservation.setRSstatus(ReservationStatus.Pending);
//			//vehiclereservation1.setNotification(new ArrayList<>());
//
//			//vehiclereservation1.getNotification().add(webnotification);
//			//vehiclereservation1.getNotification().add(mobilenotification);
//
//
//			//billRepo.save(bill1);
//
//			//billItemRepo.save(billItem1);
//			//billItemRepo.save(billItem2);
//
//			//paymentRepo.save(payment1);
//
//			vehicleReservationImpl.makeReservation(carVehicle2Reservation);
//
//			//additionalDriverRepo.save(additionaldriver1);
//
//			//notificationRepo.save(mobilenotification);
//			//notificationRepo.save(webnotification);
//
//			carVehicle2.getVehiclereservation().add(carVehicle2Reservation);
//			vehicleServiceImpl.updateVehicle(carVehicle2);
//
//
//
//
//		//_____________________________________________________________________
//
//		//CarVehicle3
//
//		address3 = new Location();
//		address3.setCity("DELHI");
//		address3.setCountry("INDIA");
//		address3.setState("DELHI-NCR");
//		address3.setStreetAddress("Sector-4");
//		address3.setZipcode("110076");
//
//
//		person3 = new Person();
//		person3.setEmail("lkapoor@gmail.com");
//		person3.setAddress(address3);
//		person3.setName("Vaibhav");
//		person3.setPhone("976689779");
//
//
//		carVehicle3 = new Car();
//
//		carVehicle1.setType(CarType.FullSize);
//			carVehicle3.setNumberPlate("ABCXF534");
//			carVehicle3.setStockNumber("XXXO89");
//			carVehicle3.setPassengerCapacity(2);
//			carVehicle3.setBarcode("1100052");
//			carVehicle3.setHasSunroof(true);
//			carVehicle3.setStatus(VehicleStatus.Available);
//			carVehicle3.setModel("Mustang");
//			carVehicle3.setMake("Ford");
//			carVehicle3.setManufacturingYear(2005);
//			carVehicle3.setMileage(20);
//			carRentalLocation3=new CarRentalLocation();
//			carVehicle3.setCarRentalLocation(carRentalLocation3);
//				carRentalSystem3=new CarRentalSystem();
//				carRentalSystem3.setName("vehicle3");
//				carRentalSystem3.setCarRentalLocation(new ArrayList());
//
//					carRentalSystem3.getCarRentalLocation().add(carRentalLocation3);
//
//					carRentalSystemRepo.save(carRentalSystem3);
//
//				carRentalLocation3.setCarRentalSystem(carRentalSystem3);
//				carRentalLocation3.setVehicle(new ArrayList<>());
//				carRentalLocation3.getVehicle().add(carVehicle3);
//				carRentalLocation3.setName("Pickup Location");
//				carRentalLocation3.setAddress(address3);
//					carRentalLocationRepo.save(carRentalLocation3);
//
//					carVehicle3.getCarRentalLocation().setCarRentalSystem(carRentalSystem3);
//
//				carParkingStallV3 = new ParkingStall();
//				carParkingStallV3.setLocationIdentifier("12ASS");
//				carParkingStallV3.setStallNumber("11");
//			parkingStallRepo.save(carParkingStallV3);
//
//			carVehicle3.setParkingstall(carParkingStallV3);
//			carVehicle3.setVehicle_log(null);
//
//			carVehicle3.setVehiclereservation(new ArrayList<>());
//
//
//		vehicleServiceImpl.addVehicle(carVehicle3);
//
//		barCarVehicle3=new Barcode();
//
//			barCarVehicle3.setVehicle(carVehicle3);
//			barCarVehicle3.setBarcode(carVehicle3.getBarcode());
//			barCarVehicle3.setIssuedAt(null);
//			barCarVehicle3.setActive(true);
//
//		barcodeRepo.save(barCarVehicle3);
//
//	//vaibhav and lokendra ka raita
//			memCarVehicle3=new Member();
//			memCarVehicle3.setASstatus(AccountStatus.Active);
//			memCarVehicle3.setDriverLicenseExpiry(date3);
//			memCarVehicle3.setDriverLicenseNumber("124567899");
//				memCarVehicle3.setPassword(passwordEncoder.encode("Lokiarun"));	//Password encoding
//			memCarVehicle3.setVehicle(carVehicle3);
//			memCarVehicle3.setVehiclereservation(new ArrayList<>());
//			memCarVehicle3.setPerson(person3);
//			memCarVehicle3.setAccActive(true);
////memCarVehicle1.setSecurityRoles("ROLE_ADMIN");
//			memCarVehicle3.setSecurityRoles("ROLE_USER");
//
//			//id hasnt been set
//		accountServiceImpl.createAccount(memCarVehicle3);
//			barCodeReaderVehicle3=new BarcodeReader();
//			barCodeReaderVehicle3.setBarcode(barCarVehicle3);
//			barCodeReaderVehicle3.setRegisteredAt(date1);
//
//			barCodeReaderVehicle3.setActive(null);
//		  	//id hasnt been set
//		barcodeReaderRepo.save(barCodeReaderVehicle3);
//
//		carVehicle3Reservation = new VehicleReservation();
//			carVehicle3Reservation.setAccount(memCarVehicle3);
//
//
//			//dates to check inventory of vehicles
//			carVehicle3Reservation.setCreationDate(date1);
//			carVehicle3Reservation.setDueDate(date2);
//			carVehicle3Reservation.setReturnDate(date3);
//
//			//vehicle set
//			carVehicle3Reservation.setVehicle(carVehicle3);
//
//			//location data+status
//			carVehicle3Reservation.setPickupLocationName("Nainatal");
//			carVehicle3Reservation.setReturnLocationName("NOIDA");
//
//			//vehiclereservation1.setAdditionaldriver(new ArrayList<>());
//			//vehiclereservation1.getAdditionaldriver().add(additionaldriver1);
//
//			//TODO 3rd party stuff
//			carVehicle3Reservation.setService(null);
//			carVehicle3Reservation.setRentalinsurance(null);
//			carVehicle3Reservation.setEquipment(null);
//
//			carVehicle3Reservation.setReservationNumber("jgy4567");
//
//			//billItem();
//
//			carVehicle3Reservation.setBill(null);
//
//			//Payment();
//
//			/*
//			if(payment1.getStatus().equals(PaymentStatus.Completed)){
//				vehiclereservation1.setRSstatus(ReservationStatus.Confirmed);
//			}*-/
//
//			//notification();
//
//			carVehicle3Reservation.setNotification(null);
//			carVehicle3Reservation.setRSstatus(ReservationStatus.Pending);
//			//vehiclereservation1.setNotification(new ArrayList<>());
//
//			//vehiclereservation1.getNotification().add(webnotification);
//			//vehiclereservation1.getNotification().add(mobilenotification);
//
//
//			//billRepo.save(bill1);
//
//			//billItemRepo.save(billItem1);
//			//billItemRepo.save(billItem2);
//
//			//paymentRepo.save(payment1);
//
//			vehicleReservationImpl.makeReservation(carVehicle3Reservation);
//
//			//additionalDriverRepo.save(additionaldriver1);
//
//			//notificationRepo.save(mobilenotification);
//			//notificationRepo.save(webnotification);
//
//			carVehicle3.getVehiclereservation().add(carVehicle3Reservation);
//			vehicleServiceImpl.updateVehicle(carVehicle3);
//
//
//
//
//
//
//	//______________________________________
//	//vanVehicle1
//
//		Date vanDate1 =  dateFormat.parse(sDate1);
//
//		Date vanDate2 =  dateFormat.parse(sDate2);
//
//		Date vanDate3 =  dateFormat.parse(sDate3);
//
//
//		address4 = new Location();
//		address4.setCity("UDAIPUR");
//		address4.setCountry("INDIA");
//		address4.setState("RAJASTHAN");
//		address4.setStreetAddress("RJ-2");
//		address4.setZipcode("313001");
//
//
//		person4 = new Person();
//		person4.setEmail("vibhuti@gmail.com");
//		person4.setAddress(address4);
//		person4.setName("ArunMurugan");
//		person4.setPhone("916678969");
//
//		vanVehicle1 = new Van();
//
//		vanVehicle1.setType(VanType.Passenger);
//			vanVehicle1.setNumberPlate("LMNOPKQ55");
//			vanVehicle1.setStockNumber("QLP447");
//			vanVehicle1.setPassengerCapacity(5);
//			vanVehicle1.setBarcode("693665");
//			vanVehicle1.setHasSunroof(false);
//			vanVehicle1.setStatus(VehicleStatus.Available);
//			vanVehicle1.setModel("Omni");
//			vanVehicle1.setMake("Maruti Suzuki");
//			vanVehicle1.setManufacturingYear(2012);
//			vanVehicle1.setMileage(17);
//			vanRentalLocation4=new CarRentalLocation();
//			vanVehicle1.setCarRentalLocation(vanRentalLocation4);
//				vanRentalSystem4=new CarRentalSystem();
//				vanRentalSystem4.setName("vehicle4");
//				vanRentalSystem4.setCarRentalLocation(new ArrayList());
//
//					vanRentalSystem4.getCarRentalLocation().add(vanRentalLocation4);
//
//					carRentalSystemRepo.save(vanRentalSystem4);
//
//				vanRentalLocation4.setCarRentalSystem(vanRentalSystem4);
//				vanRentalLocation4.setVehicle(new ArrayList<>());
//				vanRentalLocation4.getVehicle().add(vanVehicle1);
//				vanRentalLocation4.setName("Pickup Location");
//				vanRentalLocation4.setAddress(address4);
//					carRentalLocationRepo.save(vanRentalLocation4);
//
//					vanVehicle1.getCarRentalLocation().setCarRentalSystem(vanRentalSystem4);
//
//				vanParkingStallV1 = new ParkingStall();
//				vanParkingStallV1.setLocationIdentifier("12AAKS");
//				vanParkingStallV1.setStallNumber("24");
//			parkingStallRepo.save(carParkingStallV1);
//
//			vanVehicle1.setParkingstall(vanParkingStallV1);
//			vanVehicle1.setVehicle_log(null);
//
//			vanVehicle1.setVehiclereservation(new ArrayList<>());
//
//
//		vehicleServiceImpl.addVehicle(vanVehicle1);
//
//		barVanVehicle1=new Barcode();
//
//			barVanVehicle1.setVehicle(vanVehicle1);
//			barVanVehicle1.setBarcode(vanVehicle1.getBarcode());
//			barVanVehicle1.setIssuedAt(null);
//			barVanVehicle1.setActive(false);
//
//		barcodeRepo.save(barVanVehicle1);
//
//	//vaibhav and lokendra ka raita
//			memVanVehicle1=new Member();
//			memVanVehicle1.setASstatus(AccountStatus.Active);
//			memVanVehicle1.setDriverLicenseExpiry(date1);
//			memVanVehicle1.setDriverLicenseNumber("1230009");
//				memVanVehicle1.setPassword(passwordEncoder.encode("broski"));	//Password encoding
//			memVanVehicle1.setVehicle(vanVehicle1);
//			memVanVehicle1.setVehiclereservation(new ArrayList<>());
//			memVanVehicle1.setPerson(person4);
//			memVanVehicle1.setAccActive(true);
////memCarVehicle1.setSecurityRoles("ROLE_ADMIN");
//			memVanVehicle1.setSecurityRoles("ROLE_USER");
//
//			//id hasnt been set
//		accountServiceImpl.createAccount(memVanVehicle1);
//			barCodeReaderVan1=new BarcodeReader();
//			barCodeReaderVan1.setBarcode(barVanVehicle1);
//			barCodeReaderVan1.setRegisteredAt(vanDate2);
//
//			barCodeReaderVan1.setActive(null);
//		  	//id hasnt been set
//		barcodeReaderRepo.save(barCodeReaderVan1);
//
//		vanVehicle1Reservation = new VehicleReservation();
//			vanVehicle1Reservation.setAccount(memVanVehicle1);
//
//
//			//dates to check inventory of vehicles
//			vanVehicle1Reservation.setCreationDate(vanDate1);
//			vanVehicle1Reservation.setDueDate(vanDate2);
//			vanVehicle1Reservation.setReturnDate(vanDate3);
//
//			//vehicle set
//			vanVehicle1Reservation.setVehicle(vanVehicle1);
//
//			//location data+status
//			vanVehicle1Reservation.setPickupLocationName("Manipal");
//			vanVehicle1Reservation.setReturnLocationName("Udupi");
//
//			//vehiclereservation1.setAdditionaldriver(new ArrayList<>());
//			//vehiclereservation1.getAdditionaldriver().add(additionaldriver1);
//
//			//TODO 3rd party stuff
//			vanVehicle1Reservation.setService(null);
//			vanVehicle1Reservation.setRentalinsurance(null);
//			vanVehicle1Reservation.setEquipment(null);
//
//			vanVehicle1Reservation.setReservationNumber("jhj98b");
//
//			//billItem();
//
//			vanVehicle1Reservation.setBill(null);
//
//			//Payment();
//
//			/*
//			if(payment1.getStatus().equals(PaymentStatus.Completed)){
//				vehiclereservation1.setRSstatus(ReservationStatus.Confirmed);
//			}*-/
//
//			//notification();
//
//			vanVehicle1Reservation.setNotification(null);
//			vanVehicle1Reservation.setRSstatus(ReservationStatus.Pending);
//			//vehiclereservation1.setNotification(new ArrayList<>());
//
//			//vehiclereservation1.getNotification().add(webnotification);
//			//vehiclereservation1.getNotification().add(mobilenotification);
//
//
//			//billRepo.save(bill1);
//
//			//billItemRepo.save(billItem1);
//			//billItemRepo.save(billItem2);
//
//			//paymentRepo.save(payment1);
//
//			vehicleReservationImpl.makeReservation(vanVehicle1Reservation);
//
//			//additionalDriverRepo.save(additionaldriver1);
//
//			//notificationRepo.save(mobilenotification);
//			//notificationRepo.save(webnotification);
//
//			vanVehicle1.getVehiclereservation().add(vanVehicle1Reservation);
//			vehicleServiceImpl.updateVehicle(vanVehicle1);
//
//	//________________________________________
//		address5 = new Location();
//		address5.setCity("BATHINDA");
//		address5.setCountry("INDIA");
//		address4.setState("PUNJAB");
//		address4.setStreetAddress("PB02-2");
//		address4.setZipcode("151001");
//
//
//		person5 = new Person();
//		person5.setEmail("tiwari@gmail.com");
//		person5.setAddress(address5);
//		person5.setName("Abhitesh");
//		person5.setPhone("9999636969");
//
//		vanVehicle2 = new Van();
//
//		vanVehicle2.setType(VanType.Cargo);
//			vanVehicle2.setNumberPlate("WBXY4747F");
//			vanVehicle2.setStockNumber("YUTP77D");
//			vanVehicle2.setPassengerCapacity(5);
//			vanVehicle2.setBarcode("989876");
//			vanVehicle2.setHasSunroof(false);
//			vanVehicle2.setStatus(VehicleStatus.Available);
//			vanVehicle2.setModel("Eco");
//			vanVehicle2.setMake("Maruti Suzuki");
//			vanVehicle2.setManufacturingYear(2012);
//			vanVehicle2.setMileage(07);
//			vanRentalLocation4=new CarRentalLocation();
//			vanVehicle2.setCarRentalLocation(vanRentalLocation5);
//				vanRentalSystem5=new CarRentalSystem();
//				vanRentalSystem5.setName("vehicle5");
//				vanRentalSystem5.setCarRentalLocation(new ArrayList());
//
//					vanRentalSystem5.getCarRentalLocation().add(vanRentalLocation5);
//
//					carRentalSystemRepo.save(vanRentalSystem5);
//
//				vanRentalLocation5.setCarRentalSystem(vanRentalSystem5);
//				vanRentalLocation5.setVehicle(new ArrayList<>());
//				vanRentalLocation5.getVehicle().add(vanVehicle2);
//				vanRentalLocation5.setName("Pickup Location");
//				vanRentalLocation5.setAddress(address5);
//					carRentalLocationRepo.save(vanRentalLocation5);
//
//					vanVehicle2.getCarRentalLocation().setCarRentalSystem(vanRentalSystem5);
//
//				vanParkingStallV2 = new ParkingStall();
//				vanParkingStallV2.setLocationIdentifier("78NNKS");
//				vanParkingStallV2.setStallNumber("66");
//			parkingStallRepo.save(carParkingStallV2);
//
//			vanVehicle2.setParkingstall(vanParkingStallV2);
//			vanVehicle2.setVehicle_log(null);
//
//			vanVehicle2.setVehiclereservation(new ArrayList<>());
//
//
//		vehicleServiceImpl.addVehicle(vanVehicle2);
//
//		barVanVehicle2=new Barcode();
//
//			barVanVehicle2.setVehicle(vanVehicle2);
//			barVanVehicle2.setBarcode(vanVehicle2.getBarcode());
//			barVanVehicle2.setIssuedAt(null);
//			barVanVehicle2.setActive(false);
//
//		barcodeRepo.save(barVanVehicle2);
//
//	//vaibhav and lokendra ka raita
//			memVanVehicle2=new Member();
//			memVanVehicle2.setASstatus(AccountStatus.Active);
//			memVanVehicle2.setDriverLicenseExpiry(date1);
//			memVanVehicle2.setDriverLicenseNumber("17979799");
//				memVanVehicle2.setPassword(passwordEncoder.encode("lmapito"));	//Password encoding
//			memVanVehicle2.setVehicle(vanVehicle2);
//			memVanVehicle2.setVehiclereservation(new ArrayList<>());
//			memVanVehicle2.setPerson(person5);
//			memVanVehicle2.setAccActive(true);
////memCarVehicle1.setSecurityRoles("ROLE_ADMIN");
//			memVanVehicle2.setSecurityRoles("ROLE_USER");
//
//			//id hasnt been set
//		accountServiceImpl.createAccount(memVanVehicle2);
//			barCodeReaderVan2=new BarcodeReader();
//			barCodeReaderVan2.setBarcode(barVanVehicle2);
//			barCodeReaderVan2.setRegisteredAt(vanDate2);
//
//			barCodeReaderVan2.setActive(null);
//		  	//id hasnt been set
//		barcodeReaderRepo.save(barCodeReaderVan2);
//
//		vanVehicle2Reservation = new VehicleReservation();
//			vanVehicle2Reservation.setAccount(memVanVehicle2);
//
//
//			//dates to check inventory of vehicles
//			vanVehicle2Reservation.setCreationDate(vanDate1);
//			vanVehicle2Reservation.setDueDate(vanDate2);
//			vanVehicle2Reservation.setReturnDate(vanDate3);
//
//			//vehicle set
//			vanVehicle2Reservation.setVehicle(vanVehicle2);
//
//			//location data+status
//			vanVehicle2Reservation.setPickupLocationName("Tottu");
//			vanVehicle2Reservation.setReturnLocationName("TOtta");
//
//			//vehiclereservation1.setAdditionaldriver(new ArrayList<>());
//			//vehiclereservation1.getAdditionaldriver().add(additionaldriver1);
//
//			//TODO 3rd party stuff
//			vanVehicle2Reservation.setService(null);
//			vanVehicle2Reservation.setRentalinsurance(null);
//			vanVehicle2Reservation.setEquipment(null);
//
//			vanVehicle2Reservation.setReservationNumber("zzzz333");
//
//			//billItem();
//
//			vanVehicle1Reservation.setBill(null);
//
//			//Payment();
//
//			/*
//			if(payment1.getStatus().equals(PaymentStatus.Completed)){
//				vehiclereservation1.setRSstatus(ReservationStatus.Confirmed);
//			}*-/
//
//			//notification();
//
//			vanVehicle2Reservation.setNotification(null);
//			vanVehicle2Reservation.setRSstatus(ReservationStatus.Pending);
//			//vehiclereservation1.setNotification(new ArrayList<>());
//
//			//vehiclereservation1.getNotification().add(webnotification);
//			//vehiclereservation1.getNotification().add(mobilenotification);
//
//
//			//billRepo.save(bill1);
//
//			//billItemRepo.save(billItem1);
//			//billItemRepo.save(billItem2);
//
//			//paymentRepo.save(payment1);
//
//			vehicleReservationImpl.makeReservation(vanVehicle2Reservation);
//
//			//additionalDriverRepo.save(additionaldriver1);
//
//			//notificationRepo.save(mobilenotification);
//			//notificationRepo.save(webnotification);
//
//			vanVehicle2.getVehiclereservation().add(vanVehicle2Reservation);
//			vehicleServiceImpl.updateVehicle(vanVehicle2);
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//	//________________________________________
//
//		truckVehicle1 =  new Truck();
//
//		truckVehicle1.setType("Special");
//			truckVehicle1.setNumberPlate("DL3CAA7820");
//			truckVehicle1.setStockNumber("ZZ12RT1");
//			truckVehicle1.setPassengerCapacity(10);
//			truckVehicle1.setBarcode("123456ASDT");
//			truckVehicle1.setHasSunroof(false);
//			truckVehicle1.setStatus(VehicleStatus.Available);
//			truckVehicle1.setModel("BHEN KI LORRY");
//			truckVehicle1.setMake("EICHER");
//			truckVehicle1.setManufacturingYear(2018);
//			truckVehicle1.setMileage(7);
//			truckVehicle1.setCarRentalLocation(truckRentalLocation6);
//				truckVehicle1.getCarRentalLocation().setCarRentalSystem(truckRentalSystem6);
//				truckRentalLocation6.setVehicle(new ArrayList<>());
//					truckRentalLocation6.getVehicle().add(truckVehicle1);
//
//					truckRentalLocation6.setName(null);
//					truckRentalLocation6.setAddress(null);
//					truckVehicle1.getCarRentalLocation().setCarRentalSystem(truckRentalSystem6);
//			truckVehicle1.setParkingstall(null);
//			truckVehicle1.setVehicle_log(null);
//			truckVehicle1.setVehiclereservation(null);
//			//To check   carRentalsystem1
//
//			vehicleServiceImpl.addVehicle(truckVehicle1);
//
//
//
//
//		barTruckVehicle1=new Barcode();
//
//			barTruckVehicle1.setVehicle(truckVehicle1);
//			barTruckVehicle1.setBarcode(barTruckVehicle1.getBarcode());
//			barTruckVehicle1.setIssuedAt(null);
//			barTruckVehicle1.setActive(false);
//
//		barcodeRepo.save(barTruckVehicle1);
//
//		memTruckVehicle1 =new Member();
//			memTruckVehicle1.setASstatus(AccountStatus.Active);
//			memTruckVehicle1.setDriverLicenseExpiry(date1);
//			memTruckVehicle1.setDriverLicenseNumber("123456789");
//			memTruckVehicle1.setPassword("qwerty");
//			memTruckVehicle1.setVehicle(truckVehicle1);
//			memTruckVehicle1.setVehiclereservation(new ArrayList<>());
//			//id hasnt been set
//		memberRepo.save(memTruckVehicle1);
//
//
//			barCodeReaderTruckVehicle1=new BarcodeReader();
//		  	barCodeReaderTruckVehicle1.setActive(null);
//		  	barCodeReaderTruckVehicle1.setBarcode(barCarVehicle1);
//			barCodeReaderTruckVehicle1.setRegisteredAt(date2);
//			//id hasnt been set
//		barcodeReaderRepo.save(barCodeReaderTruckVehicle1);
//
//
//
//
//
//	//________________________________________
//
//		suvVehicle1 =  new SUV();
//
//		suvVehicle1.setType("Special");
//			suvVehicle1.setNumberPlate("CH03TP5328");
//			suvVehicle1.setStockNumber("ZXSA9887");
//			suvVehicle1.setPassengerCapacity(8);
//			suvVehicle1.setBarcode("9WR643ASFT");
//			suvVehicle1.setHasSunroof(false);
//			suvVehicle1.setStatus(VehicleStatus.BeingServiced);
//			suvVehicle1.setModel("Harrier");
//			suvVehicle1.setMake("TATA");
//			suvVehicle1.setManufacturingYear(2018);
//			suvVehicle1.setMileage(4);
//			suvVehicle1.setCarRentalLocation(null);
//				suvVehicle1.getCarRentalLocation().setCarRentalSystem(null);
//			suvVehicle1.setParkingstall(null);
//			suvVehicle1.setVehicle_log(null);
//			suvVehicle1.setVehiclereservation(null);
//
//		vehicleServiceImpl.addVehicle(motorcycleVehicle1);
//
//		barSuvVehicle1=new Barcode();
//
//			barSuvVehicle1.setVehicle(suvVehicle1);
//			barSuvVehicle1.setBarcode(barMotorCycleVehicle1.getBarcode());
//			barSuvVehicle1.setIssuedAt(null);
//			barSuvVehicle1.setActive(false);
//
//		barcodeRepo.save(barMotorCycleVehicle1);
//
//	//________________________________________
//
//		motorcycleVehicle1 = new Motorcycle();
//
//		motorcycleVehicle1.setType("Premium");
//			motorcycleVehicle1.setNumberPlate("HR49G4228");
//			motorcycleVehicle1.setStockNumber("ASDF0987");
//			motorcycleVehicle1.setPassengerCapacity(2);
//			motorcycleVehicle1.setBarcode("923QWRASFT");
//			motorcycleVehicle1.setHasSunroof(false);
//			motorcycleVehicle1.setStatus(VehicleStatus.BeingServiced);
//			motorcycleVehicle1.setModel("Fat Bob");
//			motorcycleVehicle1.setMake("Harley Davidson");
//			motorcycleVehicle1.setManufacturingYear(2018);
//			motorcycleVehicle1.setMileage(18);
//			motorcycleVehicle1.setCarRentalLocation(null);
//				motorcycleVehicle1.getCarRentalLocation().setCarRentalSystem(null);
//			motorcycleVehicle1.setParkingstall(null);
//			motorcycleVehicle1.setVehicle_log(null);
//			motorcycleVehicle1.setVehiclereservation(null);
//
//		vehicleServiceImpl.addVehicle(motorcycleVehicle1);
//
//		barMotorCycleVehicle1=new Barcode();
//
//			barCarVehicle2.setVehicle(motorcycleVehicle1);
//			barCarVehicle2.setBarcode(barMotorCycleVehicle1.getBarcode());
//			barCarVehicle2.setIssuedAt(null);
//			barCarVehicle2.setActive(false);
//
//		barcodeRepo.save(barMotorCycleVehicle1)
//		*/
//	}
//
//	@Test
//	void pickingupVehicle() throws Exception{
//
////___________________________________________________________________________________________________
//			//real: vehicleReservation id
//	//		 se vehicle chakki then usse account nikala, fir vehicle status update kra loaned pe and reservation krdi completed and notification
//
//
//			/*
//			if(payment1.getStatus().equals(PaymentStatus.Completed)){
//				vehiclereservation1.setRSstatus(ReservationStatus.Confirmed);
//			}*/
//
//			//Logic to be Done:
//			/*
//			 * any member can perform this activity
//
//				 Barcode Reader Scans barcode of the Vehicle
//
//				 Customer is searched via their licence number
//
//				 check if the customer has a valid reservation for the vehicle?
//				 	if Yes:
//				 		Update Status of vehicle to "Loaned"
//
//				 		Mark any reservation status to "Completed" that the customer has made against the vehicle
//
//				 		Send a "Vehicle picked-up" Notification
//
//				 	if No:
//				 		Show Error Message
//			 */
//
//		//vehicle reservation and account connect with vehicle
//	    //Payment vehicle log
//
////___________________________________________________________________________________________________
//		basicFramework();
//
//			barCodeReaderVehicle1=new BarcodeReader();
//			barCodeReaderVehicle1.setBarcode(barCarVehicle1);
//			barCodeReaderVehicle1.setRegisteredAt(date2);
//
//			barCodeReaderVehicle1.setActive(null);
//
//		barcodeReaderRepo.save(barCodeReaderVehicle1);
//
//		Member member2;
//		//member2=memberRepo.findBydriverLicenseNumber(memCarVehicle1.getDriverLicenseNumber());
//		member2=memberRepo.findBydriverLicenseNumber("123456789");
//
//		System.out.println(member2.getVehiclereservation().toString());
//
//
//		for(VehicleReservation vehRes:member2.getVehiclereservation()) {
//			if(member2.getVehicle().equals(vehRes.getVehicle())){
//
//				member2.getVehicle().setStatus(VehicleStatus.Loaned);
//				carVehicle1Reservation.setRSstatus(ReservationStatus.Completed);
//
//				vehicleServiceImpl.updateVehicle(carVehicle1);
//				vehicleReservationImpl.updateReservation(carVehicle1Reservation);
//				member2.getVehicle().setParkingstall(null);
//				accountServiceImpl.updateAccount(member2);
//				//TODO CREATE NOTIFICATION HERE
//
//			}
//			else {
//				System.out.println("Error: No Vehicle Reservation found for this Member");
//			}
//		}
//
//}
//
//	@Test
//	void emailTesting() {
//		String Email;
//		SimpleTryEmail trial1=new SimpleTryEmail();
//		//trial1.sending();
//	}
//
//
//
//
//	@Test
//	void accident() throws Exception{
//
//		/*
//		 * 	Member ne gaadi thok di, receptionist ko call kra and then receptionist ne
//		 *	Vehicle log mein change kra accident ka enum
//		 */
//
//	}
//
//	@Test
//	void returningVehicle() throws Exception{
//
//		//Logic to be Done:
//		/*
//		 * Any Worker can perform this activity.
//		 * when Returning a Vehicle, the system must collect a late fee from the
//		 * member if the return date is after the due date
//
//		 	Barcode Reader scans the barcode from the Vehicle
//
//
//		 	Fetch Vehicle Details
//
//		 	check if the Vehicle has been returned within the due date?
//		 		if Yes:
//		 			Go to next Check
//
//		 		if No:
//		 			Calculate Fines and add to the bill
//
//		 			go to next Check
//
//
//		 	Check if there is any damage to vehicle?
//		 		if Yes:
//		 			Calculate Fine
//
//		 			Add Fine to the Bill
//
//		 			Update Car log
//
//		 			Go to next check
//
//		 		if No:
//		 			Goto next check
//
//
//		 	Check if the Fuel-Tank is full?
//		 		if yes:
//		 			Go to next step
//
//		 		if No:
//		 			Calculate fine
//
//		 			add Fine to the Bill
//
//		 			Go to next step
//
//		 	Perform Billing Transaction
//
//		 	Create Vehicle return Transaction
//
//		 	Update Vehicle Status
//
//		 	Send a Vehicle return Notification
//		 */
//		//TODO
//		pickingupVehicle();
//
//		VehicleLogType vehicleLogType;
//		VehicleLog vehicleLog = new VehicleLog();
//		Bill billPuv = new Bill();
//		billPuv.setBillitem(new ArrayList());
//
//		int lateFine = 400;
//
//		barCodeReaderVehicle1=new BarcodeReader();
//		barCodeReaderVehicle1.setBarcode(barCarVehicle1);
//		barCodeReaderVehicle1.setRegisteredAt(date2);
//
//		barCodeReaderVehicle1.setActive(null);
//
//		barcodeReaderRepo.save(barCodeReaderVehicle1);
//
//		barCodeReaderVehicle1.getBarcode();
//		barCarVehicle1.getVehicle();
//
//		if(carVehicle1Reservation.getReturnDate().after(carVehicle1Reservation.getDueDate())){
//
//			long diffInMillies = Math.abs(carVehicle1Reservation.getReturnDate().getTime() - carVehicle1Reservation.getDueDate().getTime());
//		    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
//
//
//
//			//int dayPassed = carVehicle1Reservation.getDueDate().b - carVehicle1Reservation.getReturnDate().getDay();
//
//			BillItem billItemLate = new BillItem();
//			billItemLate.setAmount(lateFine* (int)diff);
//			billItemLate.setBill(billPuv);
//			billPuv.getBillitem().add(billItemLate);
//
//
//		}
//
//		if(vehicleLog.getType().equals(VehicleLogType.Accident)){
//
//			BillItem billItemAccident = new BillItem();
//			billItemAccident.setAmount(1500);
//			billItemAccident.setBill(billPuv);
//			billPuv.getBillitem().add(billItemAccident);
//		}
//
//		/*
//		 * if(TODO FUEL TANK){ }
//		 */
//
//		BillItem billItemBasic = new BillItem();
//		billItemBasic.setAmount(25000);
//		billItemBasic.setBill(billPuv);
//
//		carVehicle1Reservation.setBill(billPuv);
//
//		double totalPayment = 0;
//
//		for (BillItem x : billPuv.getBillitem()) {
//
//			totalPayment+= x.getAmount();
//
//		}
//
//		billPuv.setTotalAmount(totalPayment);
//		String Date = "11/04/2022 13:00";
//		Date billCreationDate =  dateFormat.parse(Date);
//
//		CheckTransaction payment1 = new CheckTransaction();
//		payment1.setBankName("State Bank of India");
//		payment1.setCheckNumber("AZ42F12S854GSD2");
//		payment1.setBill(billPuv);
//		payment1.setAmount(billPuv.getTotalAmount());
//		payment1.setCreationDate(billCreationDate);
//		payment1.setStatus(PaymentStatus.Completed);
//
//		if(payment1.getStatus().equals(PaymentStatus.Completed)){
//			carVehicle1Reservation.setRSstatus(ReservationStatus.Confirmed);
//		}
//
//
//
//
//		//TODO create vehicle return transaction
//
//		carVehicle1.setStatus(VehicleStatus.Available);
//
//		SMSNotification mobilenotification =new SMSNotification();
//		mobilenotification.setAddress(address1);
//	    mobilenotification.setPhoneNumber(person1.getPhone());
//
//		mobilenotification.setVehiclereservation(carVehicle1Reservation);
//		mobilenotification.setBill(billPuv);
//		mobilenotification.setContent("This is a mobile Notification: Your return has been Confirmed.");
//		mobilenotification.setCreatedOn(carVehicle1Reservation.getReturnDate());
//
//		EmailNotification webnotification=new EmailNotification();
//		webnotification.setEmail(person1.getEmail());
//		webnotification.setVehiclereservation(carVehicle1Reservation);
//		webnotification.setBill(billPuv);
//		webnotification.setContent("This is an Email Notification: Your rental has been Confirmed.");
//		webnotification.setCreatedOn(carVehicle1Reservation.getReturnDate());
//		webnotification.setPhoneNumber(person1.getPhone());
//
//		carVehicle1Reservation.setNotification(new ArrayList<>());
//		carVehicle1Reservation.getNotification().add(webNotification);
//		carVehicle1Reservation.getNotification().add(mobNotification);
//
//
//
//	}
//
//	@Test
//	void addvehicleviapostman(){
//
//		carVehicle1 = new Car();
//
//		carVehicle1.setType(CarType.Premium);
//			carVehicle1.setNumberPlate("ABCD12345");
//			carVehicle1.setStockNumber("XXXO09");
//			carVehicle1.setPassengerCapacity(4);
//			carVehicle1.setBarcode("1111152");
//			carVehicle1.setHasSunroof(true);
//			carVehicle1.setStatus(VehicleStatus.Available);
//			carVehicle1.setModel("Mustang");
//			carVehicle1.setMake("Ford");
//			carVehicle1.setManufacturingYear(2015);
//			carVehicle1.setMileage(12);
//			//carRentalLocation1=new CarRentalLocation();
//			//carVehicle1.setCarRentalLocation(carRentalLocation1);
//			//	carRentalSystem1=new CarRentalSystem();
//			//	carRentalSystem1.setName("vehicle1");
//			//	carRentalSystem1.setCarRentalLocation(new ArrayList());
//
//			//		carRentalSystem1.getCarRentalLocation().add(carRentalLocation1);
//
//			//		carRentalSystemRepo.save(carRentalSystem1);
//
//			//	carRentalLocation1.setCarRentalSystem(carRentalSystem1);
//			//	carRentalLocation1.setVehicle(new ArrayList<>());
//			//	carRentalLocation1.getVehicle().add(carVehicle1);
//			//	carRentalLocation1.setName("Pickup Location");
//			//	carRentalLocation1.setAddress(address1);
//			//		carRentalLocationRepo.save(carRentalLocation1);
//
//			//		carVehicle1.getCarRentalLocation().setCarRentalSystem(carRentalSystem1);
//
//			//	carParkingStallV1 = new ParkingStall();
//			//	carParkingStallV1.setLocationIdentifier("12AS");
//			//	carParkingStallV1.setStallNumber("22");
//			//parkingStallRepo.save(carParkingStallV1);
//
//			//carVehicle1.setParkingstall(carParkingStallV1);
//			carVehicle1.setVehicle_log(null);
//
//			carVehicle1.setVehiclereservation(new ArrayList<>());
//			vehicleServiceImpl.addVehicle(carVehicle1);
//	}
}