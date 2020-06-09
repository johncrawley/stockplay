package com.jacstuff.stockplay.test.user;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.jacstuff.stockplay.user.UserAccount;

public class UserTest {

	
	public UserTest() {
		// TODO Auto-generated constructor stub
	}
	
	private UserAccount userAccount;
	
	@Before
	public void setupUserAccount() {
		userAccount = new UserAccount();
	}
	
	
	@Test
	public void firstTest() {
		int x = 4;
		int y = 4;
		assertEquals(x,y);
	}
	
	
	@Test
	public void canAssignUserBalance() {
		assertBalanceChange(10000);
		assertBalanceChange(0);
		assertBalanceChange(-5000);
		
	}
	
	private void assertBalanceChange(int balance) {

		userAccount.setBalance(balance);
		assertEquals(balance, userAccount.getBalance());

	}
	
	
	
	@Test @Ignore
	public void canUserBuyStock() {
		int balance = 5000;
		
		userAccount.setBalance(balance);
			
	}
	

}
