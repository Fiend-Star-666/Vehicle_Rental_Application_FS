package com.intern.services;

import com.intern.carRental.primary.abstrct.Account;

public interface AccountServices {
	
	void createAccount(Account account);
	void updateAccount(Account account);
	void cancelAccount(String accountEmail);
	
}
