package com.intern.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.intern.DAO.AccountRepository;
import com.intern.carRental.primary.abstrct.Account;
import com.intern.security.jpaModels.MyUserDetails;



@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    AccountRepository accountRepo;

    @Override
    public UserDetails loadUserByUsername(String emailId) {
        Account user = accountRepo.findByPersonEmail(emailId);
//        Account user = accountRepo.findByPersonEmail("admin007@gmail.com");

        System.out.println("loadbyusername in myuserdetailsService user: "+user);

        if(user==null){

        	new UsernameNotFoundException("Not found : " + emailId);
        }
        
		MyUserDetails userDetails=new MyUserDetails(user);
        return userDetails;
		

       // return user.map(MyUserDetails::new).get();       
        
        
    }
}
