package com.intern.controllers;

import com.intern.DAO.AccountRepository;
import com.intern.carRental.primary.Member;
import com.intern.carRental.primary.Receptionist;
import com.intern.carRental.primary.abstrct.Account;
import com.intern.carRental.primary.abstrct.Vehicle;
import com.intern.notification.email.SimpleTryEmail;
import com.intern.primary.enums.AccountStatus;
import com.intern.primary.simplePOJO.Location;
import com.intern.primary.simplePOJO.Person;
import com.intern.services.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class AccountController {
    @Autowired
    AccountRepository accountRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AccountServiceImpl accountService;


    @PostMapping("/account/register/admin")
    public Account registerAccountReceptionist(@RequestBody Map<String, Object> payload) throws ParseException {    //account.setPerson(person);
        if(payload.get("email") == null){
            throw new IllegalArgumentException("email not provided");
        }
        if (accountRepo.findByPersonEmail((String) payload.get("email")) != null) {
            return null;
        }

        Location address = new Location();

        address.setStreetAddress((String) payload.get("streetAddress"));
        address.setCity((String) payload.get("city"));
        address.setZipcode((String) payload.get("zipcode"));
        address.setState((String) payload.get("state"));
        address.setCountry((String) payload.get("country"));

        Person person = new Person();
        person.setAddress(address);
        person.setEmail((String) payload.get("email"));
        person.setName((String) payload.get("name"));
        person.setPhone((String) payload.get("phone"));

        Receptionist account = new Receptionist();
        account.setPerson(person);
        account.setAccActive(true);
        account.setASstatus(AccountStatus.Active);
        account.setPassword((String) payload.get("password"));
        account.setSecurityRoles((String) payload.get("securityRoles"));
        account.setVehicle((Vehicle) payload.get("vehicle"));

        account.setPassword(passwordEncoder.encode(account.getPassword()));
        account.setVehiclereservation(new ArrayList<>());
        //account.setDriverLicenseNumber((String)payload.get("driverLicenseNumber"));
        String data = (String) payload.get("dateJoined");

        Date sdate = new SimpleDateFormat("yyyy-MM-dd").parse(data.substring(0, 10));

        account.setDateJoined(sdate);
        accountRepo.save(account);


        //notification: Email
        SimpleTryEmail emailsend = new SimpleTryEmail();
        emailsend.sending(account.getPerson().getEmail(), "TravelXperience: Account Creation", ("Hi " + account.getPerson().getName() + ",\n\nWelcome to our Car Rental Service.\n\nRegards\nTravelXperience Team"));

        return account;
    }

    @PostMapping("/account/register/member")
    public Account registerAccountMember(@RequestBody Map<String, Object> payload) throws ParseException {

        if (accountRepo.findByPersonEmail((String) payload.get("email")) != null) {
            return null;
        }

        Location address = new Location();

        address.setStreetAddress((String) payload.get("streetAddress"));
        address.setCity((String) payload.get("city"));
        address.setZipcode((String) payload.get("zipcode"));
        address.setState((String) payload.get("state"));
        address.setCountry((String) payload.get("country"));

        Person person = new Person();
        person.setAddress(address);
        person.setEmail((String) payload.get("email"));
        person.setName((String) payload.get("name"));
        person.setPhone((String) payload.get("phone"));

        Member account = new Member();
        account.setPerson(person);

        account.setAccActive(true);
        account.setASstatus(AccountStatus.Active);
        account.setPassword((String) payload.get("password"));
        account.setSecurityRoles((String) payload.get("securityRoles"));
        account.setVehicle((Vehicle) payload.get("vehicle"));

        account.setPassword(passwordEncoder.encode(account.getPassword()));
        account.setVehiclereservation(new ArrayList<>());
        account.setDriverLicenseNumber((String) payload.get("driverLicenseNumber"));
        String data = (String) payload.get("driverLicenseExpiry");

        Date sdate = new SimpleDateFormat("yyyy-MM-dd").parse(data.substring(0, 10));

        account.setDriverLicenseExpiry(sdate);
        accountRepo.save(account);


        //notification: Email
        SimpleTryEmail emailsend = new SimpleTryEmail();
        emailsend.sending(account.getPerson().getEmail(), "TravelXperience: Account Creation", ("Hi " + account.getPerson().getName() + ",\n\nWelcome to our Car Rental Service.\n\nRegards\nTravelXperience Team"));

        return account;

    }


    @GetMapping("/admin/account/view/all")
    public List<Account> getAllAccounts() {
        return accountRepo.findAll();
    }

    @GetMapping("/account/view/pinfo/{id}")
    public List<Object> getPersonalInfo(@PathVariable int id) {
        Account account = accountRepo.findById(id).orElseThrow(() -> new NoSuchElementException("No Account found with id " + id));
        List<Object> list = new ArrayList<Object>();
        list.add(account);
        return list;
    }

    @GetMapping("/account/user/view/{id}")
    public List<Object> getUserAccount(@PathVariable int id) {
		/*
		Account account = accountRepo.findById(id).get();
		List<Object> list= new ArrayList<Object>();
			list.add(account);
		return list;
		*/
        return null;
    }

    @PostMapping("/forgotPassword")
    public Account forgotPassword(@RequestBody Map<String, Object> payload) throws Exception {
        Account account = accountRepo.findByPersonEmail((String) payload.get("email"));
        if(account != null && account instanceof Member) {
            Member member = (Member) account;
            if (member.getDriverLicenseNumber().equals((String) payload.get("driverLicense"))) {
                member.setPassword(passwordEncoder.encode((String) payload.get("password")));
                accountService.updateAccount(member);
                return member;
            }
        }
        return null;
    }

}