package com.intern;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
class CarRentalApplicationTests {

	@Test
	public void contextLoads() {
	}

//
////these can be removed but they are here just for the sake of simplicity.
//	//Global Declarations:
//	CarRentalSystem carrentalsystem1;
//	CarRentalLocation carRentallocation1;
//	ParkingStall parkingstall1;
//	Car vehicle1;
//	Barcode barcode1;
//	Person person1;
//	Member member1;
//	BarcodeReader barcodereader1;
//	AdditionalDriver additionaldriver1;
//	VehicleReservation vehiclereservation1;
//	BillItem billItem1;
//	BillItem billItem2;
//	Bill bill1;
//	CheckTransaction payment1;
//	SMSNotification mobilenotification;
//	EmailNotification webnotification;
//
//	//Global Data Declarations
//	Location address1;
//	String sDate1;
//	Date date1;
//	String sDate2;
//	Date date2;
//	Location address2;
//	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
//
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
//	private BarcodeRepository barcodeRepo;
//
//	@Autowired
//	private BarcodeReaderRepository barcodeReaderRepo;
//
//	@Autowired
//	private MemberRepository memberRepo;
//
//	@Autowired
//	private AdditionalDriverRepository additionalDriverRepo;
//
//	@Autowired
//	private VehicleReservationRepository vehicleReservationRepo;
//
//	@Autowired
//	private BillItemRepository billItemRepo;
//
//	@Autowired
//	private BillRepository billRepo;
//
//	@Autowired
//	private PaymentRepository paymentRepo;
//
//	@Autowired
//	private NotificationRepository notificationRepo;
//
//
//	@Test
// 	void carRentalSystem() {
//		// CarRentalSystem test
//		carrentalsystem1 = new CarRentalSystem();
//		carrentalsystem1.setCarRentalLocation(null);
//		carrentalsystem1.setName("mohit");
//		carRentalSystemRepo.save(carrentalsystem1);
//
//	}
//
//	@Test
//	void carRentalLocation() {
//		carRentalSystem();
//
//		carRentallocation1 = new CarRentalLocation();
//		address1 = new Location();
//		address1.setCity("Chandigarh");
//		address1.setCountry("India");
//		address1.setState("Chandigarh UT");
//		address1.setStreetAddress("#164 vahan vihar, Sector 8");
//		address1.setZipcode("4165");
//		carRentallocation1.setAddress(address1);
//		carRentallocation1.setName("Random123");
//		carRentallocation1.setVehicle(new ArrayList<>());
//		carRentallocation1.setCarRentalSystem(carrentalsystem1);
//		carRentalLocationRepo.save(carRentallocation1);
//	}
//
//	//@Test
//	void parkingStall() {
//		parkingstall1 = new ParkingStall();
//		parkingstall1.setLocationIdentifier("A17");
//		parkingstall1.setStallNumber("42");
//		parkingStallRepo.save(parkingstall1);
//
//	}
//
//	@Test
//	void vehicle() {
//		//carRentalSystem();
//		//carRentalLocation();
//
//		vehicle1 = new Car();
//		vehicle1.setNumberPlate("rf120");
//		vehicle1.setStockNumber("an11");
//		vehicle1.setPassengerCapacity(4);
//		vehicle1.setHasSunroof(true);
//		vehicle1.setModel("Car truckk");
//		vehicle1.setMake("2001");
//		vehicle1.setManufacturingYear(2021);
//		vehicle1.setMileage(10);
//		vehicle1.setBarcode("77r77");
//		vehicle1.setStatus(VehicleStatus.Lost);
//		vehicle1.setType(CarType.Economy);
//
//
//		carRentalLocation();
//
//		vehicle1.setCarRentalLocation(carRentallocation1);
//
//		parkingStall();
//
//		vehicle1.setParkingstall(parkingstall1);
//		vehicleRepo.save(vehicle1);
//	}
//
//	@Test
//	void barcode() throws Exception {
//		String sDate1 = "31/12/1998";
//		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
//
//		//barcode created
//		barcode1 = new Barcode();
//		barcode1.setBarcode("1a1b1");
//		barcode1.setIssuedAt(date1);
//		barcode1.setActive(true);
//
//		vehicle();
//
//		barcode1.setVehicle(vehicle1);
//		barcodeRepo.save(barcode1);
//
//	}
//
//
//	@Test
//	void barcodeReader() throws Exception {
//
//		String sDate2 = "19/01/1999";
//		Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);
//
//		barcodereader1 = new BarcodeReader();
//
//		barcode();
//
//		barcodereader1.setBarcode(barcode1);
//		barcodereader1.setRegisteredAt(date2);
//		barcodereader1.setActive(true);
//		barcodeReaderRepo.save(barcodereader1);
//	}
//
//
//	@Test
//	void member() throws Exception {
//		//Address Creation
//				address2 = new Location();
//				address2.setCity("faridabad");
//				address2.setCountry("India");
//				address2.setState("Haryana");
//				address2.setStreetAddress("#198 bharat vihar, Sector 45, Rohini");
//				address2.setZipcode("160032");
//
//
//				//person Creation
//				person1=new Person();
//				person1.setName("Thor Odinson");
//				person1.setPhone("9845621781");
//				person1.setEmail("thor123@kries.com");
//				person1.setAddress(address2);
//
//				member1=new Member();
//				member1.setPerson(person1);
//				member1.setASstatus(AccountStatus.Active);
//				member1.setDriverLicenseNumber("485Ad51c");
//
//				String sDate3 = "12/01/2029";
//				Date date3 = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(sDate3);
//
//				member1.setDriverLicenseExpiry(date3);
//				member1.setPassword("Password@123");
//
//				barcodeReader();
//
//				member1.setVehicle(vehicle1);
//				member1.setVehiclereservation(null);
//				memberRepo.save(member1);
//	}
//
//
//
//	void additionalDriver() throws Exception {
//		additionaldriver1 = new AdditionalDriver();
//		additionaldriver1.setDriverID("A2B5C6");
//		additionaldriver1.setPerson(person1);
//		additionaldriver1.setVehicleReservation(vehiclereservation1);
//
//	}
//
//
//
//	void billItem() {
//
//		billItem1=new BillItem();
//			billItem1.setService("wipers");
//			billItem1.setAmount(420);
//
//		billItem2=new BillItem();
//			billItem2.setService("Tote bag");
//			billItem2.setAmount(69);
//
//		bill();
//		billItem1.setBill(bill1);
//		billItem2.setBill(bill1);
//	}
//
//
//	void bill() {
//		bill1 = new Bill();
//		bill1.setBillitem(new ArrayList<>());
//		bill1.getBillitem().add(billItem1);
//		bill1.getBillitem().add(billItem2);
//		bill1.setTotalAmount(billItem1.getAmount()+billItem2.getAmount());
//
//	}
//
//
//	void Payment() throws Exception{
//		String sDate7 = "11/04/2022 13:00";
//		Date date7 =  dateFormat.parse(sDate7);
//
//		payment1 = new CheckTransaction();
//		payment1.setBankName("State Bank of India");
//		payment1.setCheckNumber("AZ42F12S854GSD2");
//		payment1.setBill(bill1);
//		payment1.setAmount(bill1.getTotalAmount());
//		payment1.setCreationDate(date7);
//		payment1.setStatus(PaymentStatus.Completed);
//	}
//
//
//
//	void notification() throws Exception{
//
//		String sDate8 = "11/04/2022 15:00";
//		Date date8 =  dateFormat.parse(sDate8);
//
//		//Creating Notification
//			mobilenotification=new SMSNotification();
//			    mobilenotification.setAddress(address2);
//			    mobilenotification.setPhoneNumber(person1.getPhone());
//
//				mobilenotification.setVehiclereservation(vehiclereservation1);
//				mobilenotification.setBill(bill1);
//				mobilenotification.setContent("This is a mobile Notification: Your rental has been Confirmed.");
//				mobilenotification.setCreatedOn(date8);
//
//			webnotification=new EmailNotification();
//				webnotification.setEmail(person1.getEmail());
//				webnotification.setVehiclereservation(vehiclereservation1);
//				webnotification.setBill(bill1);
//				webnotification.setContent("This is an Email Notification: Your rental has been Confirmed.");
//				webnotification.setCreatedOn(date8);
//				webnotification.setPhoneNumber(person1.getPhone());
//		}
//
//
//	@Test
//	void vehiclereservation() throws Exception{
//		vehiclereservation1 = new VehicleReservation();
//
//		member();
//
//		vehiclereservation1.setAccount(member1);
//
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
//
//		String sDate4 = "11/04/2022 12:00";
//		Date date4 =  dateFormat.parse(sDate4);
//
//		String sDate5 = "15/05/2022 12:00";
//		Date date5 =  dateFormat.parse(sDate5);
//
//		String sDate6 = "17/05/2022 14:00";
//		Date date6 =  dateFormat.parse(sDate6);
//
//
//		//dates to check inventory of vehicles
//		vehiclereservation1.setCreationDate(date4);
//		vehiclereservation1.setDueDate(date5);
//		vehiclereservation1.setReturnDate(date6);
//
//		//vehicle set
//		vehiclereservation1.setVehicle(vehicle1);
//
//		//location data+status
//		vehiclereservation1.setPickupLocationName("Panchkula");
//		vehiclereservation1.setReturnLocationName("Patiala");
//
//		additionalDriver();
//
//		vehiclereservation1.setAdditionaldriver(new ArrayList<>());
//		vehiclereservation1.getAdditionaldriver().add(additionaldriver1);
//
//		//TODO 3rd party stuff
//		vehiclereservation1.setService(null);
//		vehiclereservation1.setRentalinsurance(null);
//		vehiclereservation1.setEquipment(null);
//
//		vehiclereservation1.setReservationNumber("grlv98");
//
//		billItem();
//
//		vehiclereservation1.setBill(bill1);
//
//		Payment();
//
//		if(payment1.getStatus().equals(PaymentStatus.Completed)){
//			vehiclereservation1.setRSstatus(ReservationStatus.Confirmed);
//		}
//
//		notification();
//
//		vehiclereservation1.setNotification(new ArrayList<>());
//		vehiclereservation1.getNotification().add(webnotification);
//		vehiclereservation1.getNotification().add(mobilenotification);
//
//
//		billRepo.save(bill1);
//
//		billItemRepo.save(billItem1);
//		billItemRepo.save(billItem2);
//
//		paymentRepo.save(payment1);
//
//		vehicleReservationRepo.save(vehiclereservation1);
//
//		additionalDriverRepo.save(additionaldriver1);
//
//		notificationRepo.save(mobilenotification);
//		notificationRepo.save(webnotification);
//	}
//
//	//gg @all
	
}