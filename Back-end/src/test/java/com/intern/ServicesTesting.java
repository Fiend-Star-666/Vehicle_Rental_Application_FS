package com.intern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
public class ServicesTesting {

	@Test
	public void contextLoads() {
	}


//	//global
//	CarRentalSystem carrentalsystem1;
//	CarRentalLocation carRentallocation1;
//	ParkingStall parkingstall1;
//	Car vehicle1;
//	Car vehicle2;
//	Car vehicle3;
//	Barcode barcode1;
//	Location address1;
//	VehicleLog vehicleLog;
//
//	@Autowired
//	VehicleServiceImpl vehicleServiceImpl ;//new VehicleServiceImpl(carRentalLocationRepo,carRentalSystemRepo,parkingStallRepo,vehicleRepo);
//
//	@Autowired
//	AccountServiceImpl accountServiceImpl;
//
//	@Autowired
//	VehicleReservationImpl vehicleReservationImpl;
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
//	private AccountRepository accountRepo;
//
//	@Autowired
//	private MemberRepository memberRepo;
//
//	@Autowired
//	private ReceptionistRepository receptionistRepo;
//
//	@Autowired
//	private CarRepository carRepo;
//
//	@Autowired
//	private BillRepository billRepo;
//
//	@Autowired
//	private BillItemRepository billItemRepo;
//
//	@Autowired
//	private PaymentRepository paymentRepo;
//	/*
//	@Autowired
//	private AdditionalDriver additionalDriverRepo;
//	*/
//	@Autowired
//	private NotificationRepository notificationRepo;
//
//	@Autowired
//	private VehicleReservationRepository vehicleReservationRepo;
//
//	@Autowired
//	private VehicleLogRepository vehicleLogRepo;
//
//	//24may2022
//	@Test
//	void removeacc() {
//		//accountRepo.delete(accountRepo.getById(4));
//		Account account=accountRepo.getById(5);
//		account.setId(4);
//		accountRepo.save(account);
//	}
//
//	@Test
// 	void carRentalSystem() {
//		// CarRentalSystem test
//		carrentalsystem1 = new CarRentalSystem();
//		carrentalsystem1.setCarRentalLocation(new ArrayList<>());
//		carrentalsystem1.setName("BOOM CARS");
//		carRentalSystemRepo.save(carrentalsystem1);
//
//	}
//
//
//
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
//	@Test
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
//	void addingvehicle() {
//		//vehicle();
//
//		vehicle2 = new Car();
//		vehicle2.setNumberPlate("woofrf120");
//		vehicle2.setStockNumber("cat an11");
//		vehicle2.setPassengerCapacity(10000000);
//		vehicle2.setHasSunroof(true);
//		vehicle2.setModel("CarRRRRRR");
//		vehicle2.setMake("2001");
//		vehicle2.setManufacturingYear(2021);
//		vehicle2.setMileage(10);
//		vehicle2.setBarcode("7157r77");
//		vehicle2.setStatus(VehicleStatus.Lost);
//		vehicle2.setType(CarType.Economy);
//
//
//		//carRentalLocation();
//			//carRentalSystem();
//
//		CarRentalSystem carrentalsystem2 = new CarRentalSystem();
//		carrentalsystem2.setCarRentalLocation(null);
//		carrentalsystem2.setName("kohit");
//		carRentalSystemRepo.save(carrentalsystem2);
//
//		CarRentalLocation carRentallocation2 = new CarRentalLocation();
//		Location address2 = new Location();
//		address2.setCity("Chandigarh");
//		address2.setCountry("India");
//		address2.setState("Chandigarh UT");
//		address2.setStreetAddress("#164 vahan vihar, Sector 8");
//		address2.setZipcode("4165");
//		carRentallocation2.setAddress(address2);
//		carRentallocation2.setName("Random123");
//		carRentallocation2.setVehicle(new ArrayList<>());
//		carRentallocation2.setCarRentalSystem(carrentalsystem2);
//		carRentalLocationRepo.save(carRentallocation2);
//
//
//
//		vehicle2.setCarRentalLocation(carRentallocation2);
//
//	    ParkingStall parkingstall2 = new ParkingStall();
//
//		parkingstall2.setLocationIdentifier("A17");
//		parkingstall2.setStallNumber("42");
//
//		parkingStallRepo.save(parkingstall2);
//
//		vehicle2.setParkingstall(parkingstall2);
//
//
//		vehicleServiceImpl.addVehicle(vehicle2);
//
//		System.out.println("added");
//	}
//
//	@Test
//	void updatingVehicle(){
//
//		//addingvehicle();
//
//		vehicle2 = new Car();
//		vehicle2.setNumberPlate("woofrf120");
//		vehicle2.setStockNumber("cat an11");
//		vehicle2.setPassengerCapacity(10000000);
//		vehicle2.setHasSunroof(true);
//		vehicle2.setModel("CarRRRRRR");
//		vehicle2.setMake("2001");
//		vehicle2.setManufacturingYear(2021);
//		vehicle2.setMileage(10);
//		vehicle2.setBarcode("7157r77");
//		vehicle2.setStatus(VehicleStatus.Lost);
//		vehicle2.setType(CarType.Economy);
//
//		//carRentalLocation();
//			//carRentalSystem();
//
//			CarRentalSystem carrentalsystem2 = new CarRentalSystem();
//			carrentalsystem2.setCarRentalLocation(null);
//			carrentalsystem2.setName("kohit");
//			carRentalSystemRepo.save(carrentalsystem2);
//
//		CarRentalLocation carRentallocation2 = new CarRentalLocation();
//		Location address2 = new Location();
//		address2.setCity("Chandigarh");
//		address2.setCountry("India");
//		address2.setState("Chandigarh UT");
//		address2.setStreetAddress("#164 vahan vihar, Sector 8");
//		address2.setZipcode("4165");
//		carRentallocation2.setAddress(address2);
//		carRentallocation2.setName("Random123");
//		carRentallocation2.setVehicle(new ArrayList<>());
//		carRentallocation2.setCarRentalSystem(carrentalsystem2);
//		carRentalLocationRepo.save(carRentallocation2);
//
//
//
//		vehicle2.setCarRentalLocation(carRentallocation2);
//
//	    ParkingStall parkingstall2 = new ParkingStall();
//
//		parkingstall2.setLocationIdentifier("A17");
//		parkingstall2.setStallNumber("42");
//
//
//		parkingStallRepo.save(parkingstall2);
//
//		vehicle2.setParkingstall(parkingstall2);
//
//		//----VehicleServiceImpl vehicleServiceImpl = new VehicleServiceImpl();//new VehicleServiceImpl(carRentalLocationRepo,carRentalSystemRepo,parkingStallRepo,vehicleRepo);
//
//		vehicleServiceImpl.addVehicle(vehicle2);
//
//		System.out.println("added");
//
//
//		//____________________________________________________
//
//		vehicle3 = new Car();
//		vehicle3.setNumberPlate("woofrf120");
//		vehicle3.setStockNumber("cat an11");
//		vehicle3.setPassengerCapacity(5);
//		vehicle3.setHasSunroof(true);
//		vehicle3.setModel("CarRRRRRR");
//		vehicle3.setMake("2001");
//		vehicle3.setManufacturingYear(2021);
//		vehicle3.setMileage(10);
//		vehicle3.setBarcode("7157r77");
//		vehicle3.setStatus(VehicleStatus.Lost);
//		vehicle3.setType(CarType.Economy);
//		System.out.println(vehicle2.getId()+":vehicle to be updated");
//
//		vehicle3.setId(vehicle2.getId());
//
//
//		//carRentalLocation();
//
//		vehicle3.setCarRentalLocation(carRentallocation2);
//
//		//parkingStall();
//
//		 ParkingStall parkingstall3 = new ParkingStall();
//
//			parkingstall3.setLocationIdentifier("B17");
//			parkingstall3.setStallNumber("424");
//			parkingStallRepo.save(parkingstall2);
//
//		vehicle3.setParkingstall(parkingstall2);
//
//		//----VehicleServiceImpl vehicleServiceImpl2 = new VehicleServiceImpl();//new VehicleServiceImpl(carRentalLocationRepo,carRentalSystemRepo,parkingStallRepo,vehicleRepo);
//		vehicleServiceImpl.updateVehicle(vehicle3);
//		System.out.println(vehicle3.getId()+":new2");
//		System.out.println(vehicle3.getId()+":new3");
//
//	}
//
//
//	@Test
//	void removingVehicle() {
//		addingvehicle();
//
//		//vehicleServiceImpl1 = new VehicleServiceImpl();//new VehicleServiceImpl(carRentalLocationRepo,carRentalSystemRepo,parkingStallRepo,vehicleRepo);
//		vehicleServiceImpl.removeVehicle("7157r77");
//		System.out.println("Removed");
//	}
//
//	@Test
//	void addingTwoVehicle(){
//		addingvehicle();
//
//		Car vehicle4 = new Car();
//		vehicle4.setNumberPlate("lksh199899");
//		vehicle4.setStockNumber("11ss11jj");
//		vehicle4.setPassengerCapacity(4);
//		vehicle4.setHasSunroof(false);
//		vehicle4.setModel("vista");
//		vehicle4.setMake("2015");
//		vehicle4.setManufacturingYear(2019);
//		vehicle4.setMileage(15);
//		vehicle4.setBarcode("369llos");
//		vehicle4.setStatus(VehicleStatus.Available);
//		vehicle4.setType(CarType.Luxury);
//
//			//carRentalLocation();
//			//carRentalSystem();
//
//			CarRentalSystem carrentalsystem3 = new CarRentalSystem();
//			carrentalsystem3.setCarRentalLocation(null);
//			carrentalsystem3.setName("vohit");
//			carRentalSystemRepo.save(carrentalsystem3);
//
//		CarRentalLocation carRentallocation3 = new CarRentalLocation();
//		Location address3 = new Location();
//		address3.setCity("Shimla");
//		address3.setCountry("India");
//		address3.setState("Himachal Pradesh");
//		address3.setStreetAddress("Mall Road");
//		address3.setZipcode("696969");
//		carRentallocation3.setAddress(address3);
//		carRentallocation3.setName("Random58");
//		carRentallocation3.setVehicle(new ArrayList<>());
//		carRentallocation3.setCarRentalSystem(carrentalsystem3);
//		carRentalLocationRepo.save(carRentallocation3);
//
//
//
//		vehicle4.setCarRentalLocation(carRentallocation3);
//
//	    ParkingStall parkingstall3 = new ParkingStall();
//
//		parkingstall3.setLocationIdentifier("AK47");
//		parkingstall3.setStallNumber("44");
//		//parkingstall2.setVehicle(vehicle2);
//
//		parkingStallRepo.save(parkingstall3);
//
//		vehicle4.setParkingstall(parkingstall3);
//
//		/// vehicleServiceImpl = new VehicleServiceImpl();//new VehicleServiceImpl(carRentalLocationRepo,carRentalSystemRepo,parkingStallRepo,vehicleRepo);
//
//		vehicleServiceImpl.addVehicle(vehicle4);
//
//		System.out.println("added");
//
//	}
//
//
//	@Test
//	void addingThreeVehicle(){
//		addingTwoVehicle();
//
//		Car vehicle5 = new Car();
//		vehicle5.setNumberPlate("DL3CAA1123");
//		vehicle5.setStockNumber("11ss11jk");
//		vehicle5.setPassengerCapacity(5);
//		vehicle5.setHasSunroof(false);
//		vehicle5.setModel("vista");
//		vehicle5.setMake("2016");
//		vehicle5.setManufacturingYear(2012);
//		vehicle5.setMileage(18);
//		vehicle5.setBarcode("123eloh");
//		vehicle5.setStatus(VehicleStatus.Available);
//		vehicle5.setType(CarType.Economy);
//
//			//carRentalLocation();
//			//carRentalSystem();
//
//			CarRentalSystem carrentalsystem4 = new CarRentalSystem();
//			carrentalsystem4.setCarRentalLocation(null);
//			carrentalsystem4.setName("vaibhav");
//			carRentalSystemRepo.save(carrentalsystem4);
//
//		CarRentalLocation carRentallocation4 = new CarRentalLocation();
//		Location address4 = new Location();
//		address4.setCity("New Delhi");
//		address4.setCountry("India");
//		address4.setState("Delhi");
//		address4.setStreetAddress("Mall Road");
//		address4.setZipcode("110076");
//		carRentallocation4.setAddress(address4);
//		carRentallocation4.setName("Random59");
//		carRentallocation4.setVehicle(new ArrayList<>());
//		carRentallocation4.setCarRentalSystem(carrentalsystem4);
//		carRentalLocationRepo.save(carRentallocation4);
//
//
//
//		vehicle5.setCarRentalLocation(carRentallocation4);
//
//	    ParkingStall parkingstall4 = new ParkingStall();
//
//		parkingstall4.setLocationIdentifier("AG34");
//		parkingstall4.setStallNumber("49");
//		//parkingstall2.setVehicle(vehicle2);
//
//		parkingStallRepo.save(parkingstall4);
//
//		vehicle5.setParkingstall(parkingstall4);
//
//		//new VehicleServiceImpl(carRentalLocationRepo,carRentalSystemRepo,parkingStallRepo,vehicleRepo);
//
//		vehicleServiceImpl.addVehicle(vehicle5);
//
//		System.out.println("added");
//
//	}
//
//	@Test
//	void searchingbymodel() {
//		vehicle2 = new Car();
//		vehicle2.setNumberPlate("woofrf120");
//		vehicle2.setStockNumber("cat an11");
//		vehicle2.setPassengerCapacity(10000000);
//		vehicle2.setHasSunroof(true);
//		vehicle2.setModel("CarRRRRRR");
//		vehicle2.setMake("2001");
//		vehicle2.setManufacturingYear(2021);
//		vehicle2.setMileage(10);
//		vehicle2.setBarcode("7157r77");
//		vehicle2.setStatus(VehicleStatus.Lost);
//		vehicle2.setType(CarType.Economy);
//
//
//		//carRentalLocation();
//			//carRentalSystem();
//
//			CarRentalSystem carrentalsystem2 = new CarRentalSystem();
//			carrentalsystem2.setCarRentalLocation(null);
//			carrentalsystem2.setName("kohit");
//			carRentalSystemRepo.save(carrentalsystem2);
//
//		CarRentalLocation carRentallocation2 = new CarRentalLocation();
//		Location address2 = new Location();
//		address2.setCity("Chandigarh");
//		address2.setCountry("India");
//		address2.setState("Chandigarh UT");
//		address2.setStreetAddress("#164 vahan vihar, Sector 8");
//		address2.setZipcode("4165");
//		carRentallocation2.setAddress(address2);
//		carRentallocation2.setName("Random123");
//		carRentallocation2.setVehicle(new ArrayList<>());
//		carRentallocation2.setCarRentalSystem(carrentalsystem2);
//		carRentalLocationRepo.save(carRentallocation2);
//
//
//
//		vehicle2.setCarRentalLocation(carRentallocation2);
//
//	    ParkingStall parkingstall2 = new ParkingStall();
//
//		parkingstall2.setLocationIdentifier("A17");
//		parkingstall2.setStallNumber("42");
//
//		parkingStallRepo.save(parkingstall2);
//
//		vehicle2.setParkingstall(parkingstall2);
//
//		//VehicleServiceImpl vehicleServiceImpl =new VehicleServiceImpl();//new VehicleServiceImpl(carRentalLocationRepo,carRentalSystemRepo,parkingStallRepo,vehicleRepo);
//
//		vehicleServiceImpl.addVehicle(vehicle2);
//
//
//
//
//
//
//
//
//		//_____________________________________________________
//		////
//		Car vehicle4 = new Car();
//		vehicle4.setNumberPlate("lksh199899");
//		vehicle4.setStockNumber("11ss11jj");
//		vehicle4.setPassengerCapacity(4);
//		vehicle4.setHasSunroof(false);
//		vehicle4.setModel("vista");
//		vehicle4.setMake("2015");
//		vehicle4.setManufacturingYear(2019);
//		vehicle4.setMileage(15);
//		vehicle4.setBarcode("369llos");
//		vehicle4.setStatus(VehicleStatus.Available);
//		vehicle4.setType(CarType.Luxury);
//
//			//carRentalLocation();
//			//carRentalSystem();
//
//			CarRentalSystem carrentalsystem3 = new CarRentalSystem();
//			carrentalsystem3.setCarRentalLocation(null);
//			carrentalsystem3.setName("vohit");
//			carRentalSystemRepo.save(carrentalsystem3);
//
//		CarRentalLocation carRentallocation3 = new CarRentalLocation();
//		Location address3 = new Location();
//		address3.setCity("Shimla");
//		address3.setCountry("India");
//		address3.setState("Himachal Pradesh");
//		address3.setStreetAddress("Mall Road");
//		address3.setZipcode("696969");
//		carRentallocation3.setAddress(address3);
//		carRentallocation3.setName("Random58");
//		carRentallocation3.setVehicle(new ArrayList<>());
//		carRentallocation3.setCarRentalSystem(carrentalsystem3);
//		carRentalLocationRepo.save(carRentallocation3);
//
//
//
//		vehicle4.setCarRentalLocation(carRentallocation3);
//
//	    ParkingStall parkingstall3 = new ParkingStall();
//
//		parkingstall3.setLocationIdentifier("AK47");
//		parkingstall3.setStallNumber("44");
//
//
//		parkingStallRepo.save(parkingstall3);
//
//		vehicle4.setParkingstall(parkingstall3);
//
//
//		vehicleServiceImpl.addVehicle(vehicle4);
//
//		System.out.println("added");					//hey hii guys //meet pe ajo//yoo coming
//		//______________________________________________________________
//		Car vehicle5 = new Car();
//		vehicle5.setNumberPlate("DL3CAA1123");
//		vehicle5.setStockNumber("11ss11jk");
//		vehicle5.setPassengerCapacity(5);
//		vehicle5.setHasSunroof(false);
//		vehicle5.setModel("vista");
//		vehicle5.setMake("2016");
//		vehicle5.setManufacturingYear(2012);
//		vehicle5.setMileage(18);
//		vehicle5.setBarcode("123eloh");
//		vehicle5.setStatus(VehicleStatus.Available);
//		vehicle5.setType(CarType.Economy);
//
//			//carRentalLocation();
//			//carRentalSystem();
//
//			CarRentalSystem carrentalsystem4 = new CarRentalSystem();
//			carrentalsystem4.setCarRentalLocation(null);
//			carrentalsystem4.setName("vaibhav");
//			carRentalSystemRepo.save(carrentalsystem4);
//
//		CarRentalLocation carRentallocation4 = new CarRentalLocation();
//		Location address4 = new Location();
//		address4.setCity("New Delhi");
//		address4.setCountry("India");
//		address4.setState("Delhi");
//		address4.setStreetAddress("Mall Road");
//		address4.setZipcode("110076");
//		carRentallocation4.setAddress(address4);
//		carRentallocation4.setName("Random59");
//		carRentallocation4.setVehicle(new ArrayList<>());
//		carRentallocation4.setCarRentalSystem(carrentalsystem4);
//		carRentalLocationRepo.save(carRentallocation4);
//
//
//
//		vehicle5.setCarRentalLocation(carRentallocation4);
//
//	    ParkingStall parkingstall4 = new ParkingStall();
//
//		parkingstall4.setLocationIdentifier("AG34");
//		parkingstall4.setStallNumber("49");
//
//		parkingStallRepo.save(parkingstall4);
//
//		vehicle5.setParkingstall(parkingstall4);
//
//
//		vehicleServiceImpl.addVehicle(vehicle5);
//
//		System.out.println("added");
//
//
//		List<Car> trialVehicle = carRepo.findByType(CarType.Economy);
//		//System.out.println(trialVehicle.toString());
//
//		/*
//		for(Car var:trialVehicle) {
//			System.out.println(var.toString());
//		}*/
//		System.out.println("____________________________________________________");
//		ArrayList<Vehicle> arr= vehicleServiceImpl.searchByModel("vista");
//
//		for(Vehicle var:arr) {
//			//var.get
//			//System.out.println(var.toString());
//		}
//	}
//
//	@Test
//	void searchingbytype() {
//		//addingThreeVehicle();
//		/*
//		ArrayList<Vehicle> trialVehicle= vehicleRepo.findAllByType(CarType.Luxury.toString());
//		System.out.println(trialVehicle.toString());
//		*/
//	}
//
//	@Test
//	void addingAccount() throws Exception {
//		Location address2 = new Location();
//		address2.setCity("faridabad");
//		address2.setCountry("India");
//		address2.setState("Haryana");
//		address2.setStreetAddress("#198 bharat vihar, Sector 45, Rohini");
//		address2.setZipcode("160032");
//
//
//		//person Creation
//		Person person1=new Person();
//		person1.setName("Thor Odinson");
//		person1.setPhone("9845621781");
//		person1.setEmail("thor123@kries.com");
//		person1.setAddress(address2);
//
//		Member member1=new Member();
//		member1.setPerson(person1);
//		member1.setASstatus(AccountStatus.Active);
//		member1.setDriverLicenseNumber("485Ad51c");
//
//		String sDate3 = "12/01/2029";
//		Date date3 = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(sDate3);
//
//		member1.setDriverLicenseExpiry(date3);
//		member1.setPassword("Password@123");
//
//			//barcodeReader();
//
//		member1.setVehicle(null);
//		member1.setVehiclereservation(null);
//		//memberRepo.save(member1);
//		accountServiceImpl.createAccount(member1);
//	}
//
//
//	@Test
//	void updatingAccount() throws Exception {
//		addingAccount();
//		System.out.println("Added");
//
//		Location address3 = new Location();
//		address3.setCity("faridabad");
//		address3.setCountry("India");
//		address3.setState("Haryana");
//		address3.setStreetAddress("#198 bharat vihar, Sector 45, Rohini");
//		address3.setZipcode("160032");
//
//
//		//person Creation
//		Person person2=new Person();
//		person2.setName("Thor Odinson");
//		person2.setPhone("9845621781");
//		person2.setEmail("thor123@kries.com");
//		person2.setAddress(address3);
//
//		Member member2=new Member();
//		member2.setPerson(person2);
//		member2.setASstatus(AccountStatus.Active);
//		member2.setDriverLicenseNumber("485Ad51c");
//
//		String sDate3 = "12/01/2029";
//		Date date3 = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(sDate3);
//
//		member2.setDriverLicenseExpiry(date3);
//		member2.setPassword("Psword@123");
//
//			//barcodeReader();
//
//		member2.setVehicle(null);
//		member2.setVehiclereservation(null);
//		//memberRepo.save(member1);
//		accountServiceImpl.updateAccount(member2);
//		System.out.println("Editing");
//	}
//
//
//	@Test
//	void cancellingAccount() throws Exception {
//		addingAccount();
//		System.out.println("Added");
//		accountServiceImpl.cancelAccount("thor123@kries.com");
//		System.out.println("Removed");
//	}
//
//	@Test
//	void makingReservation() throws Exception{
//
//
//		VehicleReservation vehicleReservation1 = new VehicleReservation();
//
//		Location address2 = new Location();
//		address2.setCity("faridabad");
//		address2.setCountry("India");
//		address2.setState("Haryana");
//		address2.setStreetAddress("#198 bharat vihar, Sector 45, Rohini");
//		address2.setZipcode("160032");
//
//
//		//person Creation
//		Person person1=new Person();
//		person1.setName("Thor Odinson");
//		person1.setPhone("9845621781");
//		person1.setEmail("thor123@kries.com");
//		person1.setAddress(address2);
//
//		Member member1=new Member();
//		member1.setPerson(person1);
//		member1.setASstatus(AccountStatus.Active);
//		member1.setDriverLicenseNumber("485Ad51c");
//
//		String sDate3 = "12/01/2029";
//		Date date3 = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(sDate3);
//
//		member1.setDriverLicenseExpiry(date3);
//		member1.setPassword("Password@123");
//
//			//barcodeReader();
//
//		member1.setVehicle(null);
//		member1.setVehiclereservation(null);
//		memberRepo.save(member1);
//		accountServiceImpl.createAccount(member1);
//
//		vehicleReservation1.setAccount(member1);
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
//		vehicleReservation1.setCreationDate(date4);
//		vehicleReservation1.setDueDate(date5);
//		vehicleReservation1.setReturnDate(date6);
//
//		//vehicle set
//		vehicleReservation1.setVehicle(vehicle1);
//
//		//location data+status
//		vehicleReservation1.setPickupLocationName("Panchkula");
//		vehicleReservation1.setReturnLocationName("Patiala");
//
//	/*	AdditionalDriver additionaldriver1 = new AdditionalDriver();
//		additionaldriver1.setDriverID("A2B5C6");
//		additionaldriver1.setPerson(person1);
//		additionaldriver1.setVehicleReservation(vehicleReservation1);*/
//
//
//		vehicleReservation1.setAdditionaldriver(null);
//		//vehicleReservation1.getAdditionaldriver().add(additionaldriver1);
//
//		//TODO 3rd party stuff
//		vehicleReservation1.setService(null);
//		vehicleReservation1.setRentalinsurance(null);
//		vehicleReservation1.setEquipment(null);
//
//		vehicleReservation1.setReservationNumber("grlv98");
//
//
//		BillItem billItem1=new BillItem();
//		billItem1.setService("wipers");
//		billItem1.setAmount(420);
//
//		BillItem billItem2 = new BillItem();
//		billItem2.setService("Tote bag");
//		billItem2.setAmount(69);
//
//
//		Bill bill1 = new Bill();
//		bill1.setBillitem(new ArrayList<>());
//		bill1.getBillitem().add(billItem1);
//		bill1.getBillitem().add(billItem2);
//		bill1.setTotalAmount(billItem1.getAmount()+billItem2.getAmount());
//		billItem1.setBill(bill1);
//		billItem2.setBill(bill1);
//
//		vehicleReservation1.setBill(bill1);
//
//
//		String sDate7 = "11/04/2022 13:00";
//		Date date7 =  dateFormat.parse(sDate7);
//
//		CheckTransaction payment1 = new CheckTransaction();
//		payment1.setBankName("State Bank of India");
//		payment1.setCheckNumber("AZ42F12S854GSD2");
//		payment1.setBill(bill1);
//		payment1.setAmount(bill1.getTotalAmount());
//		payment1.setCreationDate(date7);
//		payment1.setStatus(PaymentStatus.Completed);
//
//		if(payment1.getStatus().equals(PaymentStatus.Completed)){
//			vehicleReservation1.setRSstatus(ReservationStatus.Confirmed);
//		}
//
//
//		String sDate8 = "11/04/2022 15:00";
//		Date date8 =  dateFormat.parse(sDate8);
//
//		//Creating Notification
//		SMSNotification mobilenotification =new SMSNotification();
//		mobilenotification.setAddress(address2);
//	    mobilenotification.setPhoneNumber(person1.getPhone());
//
//		mobilenotification.setVehiclereservation(vehicleReservation1);
//		mobilenotification.setBill(bill1);
//		mobilenotification.setContent("This is a mobile Notification: Your rental has been Confirmed.");
//		mobilenotification.setCreatedOn(date8);
//
//		EmailNotification webnotification=new EmailNotification();
//		webnotification.setEmail(person1.getEmail());
//		webnotification.setVehiclereservation(vehicleReservation1);
//		webnotification.setBill(bill1);
//		webnotification.setContent("This is an Email Notification: Your rental has been Confirmed.");
//		webnotification.setCreatedOn(date8);
//		webnotification.setPhoneNumber(person1.getPhone());
//
//		vehicleReservation1.setNotification(new ArrayList<>());
//		vehicleReservation1.getNotification().add(webnotification);
//		vehicleReservation1.getNotification().add(mobilenotification);
//
//
//		billRepo.save(bill1);
//
//		billItemRepo.save(billItem1);
//		billItemRepo.save(billItem2);
//
//		//paymentRepo.save(payment1);
//
//		vehicleReservationImpl.makeReservation(vehicleReservation1);
//
//		//additionalDriverRepo.save(additionaldriver1);
//
//		//notificationRepo.save(mobilenotification);
//		//notificationRepo.save(webnotification);
//
//
//	}
//
//	@Test
//	void cancellingReservation() throws Exception  {
//
//		makingReservation();
//		vehicleReservationImpl.cancelReservation("grlv98");
//
//	}
//
//	@Test
//	void vehicleLog() throws Exception {
//
//
//		vehicle();
//
//
//		String sDate9 = "06/05/2022";
//		Date date9 = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(sDate9);
//
//		vehicleLog = new VehicleLog();
//		vehicleLog.setVehicle(vehicle1);
//		vehicleLog.setType(VehicleLogType.Accident);
//		vehicleLog.setDescription("God's Plan");
//		vehicleLog.setCreationDate(date9);
//		vehicleLogRepo.save(vehicleLog);
//
//		VehicleLog vehicleLog2 = new VehicleLog();
//		vehicleLog2.setVehicle(vehicle1);
//		vehicleLog2.setType(VehicleLogType.Accident);
//		vehicleLog2.setDescription("God's Plan");
//		vehicleLog2.setCreationDate(date9);
//		vehicleLogRepo.save(vehicleLog2);
//
//
//	}
//
//
//	/*
//	@Test
//	void updatingReservation() {
//		VehicleReservation vehicleReservation1 = new VehicleReservation();
//
//		Location address2 = new Location();
//		address2.setCity("faridabad");
//		address2.setCountry("India");
//		address2.setState("Haryana");
//		address2.setStreetAddress("#198 bharat vihar, Sector 45, Rohini");
//		address2.setZipcode("160032");
//
//
//		//person Creation
//		Person person1=new Person();
//		person1.setName("Thor Odinson");
//		person1.setPhone("9845621781");
//		person1.setEmail("thor123@kries.com");
//		person1.setAddress(address2);
//
//		Member member1=new Member();
//		member1.setPerson(person1);
//		member1.setASstatus(AccountStatus.Active);
//		member1.setDriverLicenseNumber("485Ad51c");
//
//		String sDate3 = "12/01/2029";
//		Date date3 = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(sDate3);
//
//		member1.setDriverLicenseExpiry(date3);
//		member1.setPassword("Password@123");
//
//			//barcodeReader();
//
//		member1.setVehicle(null);
//		member1.setVehiclereservation(null);
//		//memberRepo.save(member1);
//		accountServiceImpl.createAccount(member1);
//
//		vehicleReservation1.setAccount(member1);
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
//		vehicleReservation1.setCreationDate(date4);
//		vehicleReservation1.setDueDate(date5);
//		vehicleReservation1.setReturnDate(date6);
//
//		//vehicle set
//		vehicleReservation1.setVehicle(vehicle1);
//
//		//location data+status
//		vehicleReservation1.setPickupLocationName("Panchkula");
//		vehicleReservation1.setReturnLocationName("Patiala");
//
//		AdditionalDriver additionaldriver1 = new AdditionalDriver();
//		additionaldriver1.setDriverID("A2B5C6");
//		additionaldriver1.setPerson(person1);
//		additionaldriver1.setVehicleReservation(vehicleReservation1);
//
//
//		vehicleReservation1.setAdditionaldriver(new ArrayList<>());
//		vehicleReservation1.getAdditionaldriver().add(additionaldriver1);
//
//		//TODO 3rd party stuff
//		vehicleReservation1.setService(null);
//		vehicleReservation1.setRentalinsurance(null);
//		vehicleReservation1.setEquipment(null);
//
//		vehicleReservation1.setReservationNumber("grlv98");
//
//
//		BillItem billItem1=new BillItem();
//		billItem1.setService("wipers");
//		billItem1.setAmount(420);
//
//		BillItem billItem2 = new BillItem();
//		billItem2.setService("Tote bag");
//		billItem2.setAmount(69);
//
//
//		Bill bill1 = new Bill();
//		bill1.setBillitem(new ArrayList<>());
//		bill1.getBillitem().add(billItem1);
//		bill1.getBillitem().add(billItem2);
//		bill1.setTotalAmount(billItem1.getAmount()+billItem2.getAmount());
//		billItem1.setBill(bill1);
//		billItem2.setBill(bill1);
//
//		vehicleReservation1.setBill(bill1);
//
//
//
//		if(payment1.getStatus().equals(PaymentStatus.Completed)){
//			vehicleReservation1.setRSstatus(ReservationStatus.Confirmed);
//		}
//
//		notification();
//
//		vehicleReservation1.setNotification(new ArrayList<>());
//		vehicleReservation1.getNotification().add(webnotification);
//		vehicleReservation1.getNotification().add(mobilenotification);
//
//
//		billRepo.save(bill1);
//
//		billItemRepo.save(billItem1);
//		billItemRepo.save(billItem2);
//
//		paymentRepo.save(payment1);
//
//		vehicleReservationRepo.save(vehicleReservation1);
//
//		additionalDriverRepo.save(additionaldriver1);
//
//		notificationRepo.save(mobilenotification);
//		notificationRepo.save(webnotification);
//
//
//	}*/
//

}