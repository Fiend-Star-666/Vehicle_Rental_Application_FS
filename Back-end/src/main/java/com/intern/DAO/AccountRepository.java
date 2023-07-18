package com.intern.DAO;
import org.springframework.data.jpa.repository.JpaRepository;
import com.intern.carRental.primary.abstrct.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{
	
	Account findByPersonEmail(String Email);
	
}