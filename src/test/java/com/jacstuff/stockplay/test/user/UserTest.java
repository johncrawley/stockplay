package com.jacstuff.stockplay.test.user;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.jacstuff.stockplay.stock.StockPurchase;
import com.jacstuff.stockplay.user.UserAccount;

import money.Money;

public class UserTest {

	/*
	
	 *   userAccount.add(purchase);

	 *   userAccount.getValueChanged(name, currentPricePerShare);
	 *   userAccount.getPercentChanged(name, currentPricePerShare);
	 *   userAccount.listStocks();
	 *   userAccount.getCurrentValueOfStock(name);
	 *   userAccount.getPercentageChange(name,
	 *   userAccount.getTotalAmountSpentOnStock(name);
	 *   userAccount.getNumberOfShares(name);
	 *   userAccount.getTotalValueOfAllStock();
	 *   userAccount.sellStock(name, numberOfSharesToSell);
	 *   userAccount.sellAllShares(name);
	 *   
	 *   userAccount.getTotalNumberOfShares();
	 *   userAccount.getTotalNumberOfStock();
	*/
	
	
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
	public void balanceCanbeAssigned() {
		assertBalanceChange(10000);
		assertBalanceChange(0);
		assertBalanceChange(-5000);
		
	}
	
	private void assertBalanceChange(long balance) {

		userAccount.setBalance(new Money(balance));
		assertEquals(balance, userAccount.getBalance().value());

	}
	
	
	@Test
	public void balanceCanBeAdjusted() {
		
		
		
		
	}
	
	
	
	
	@Test
	public void userCanBuyStock() {
		Money startingBalance = new Money(5000);
	
		userAccount.setBalance(startingBalance);		
		assertEquals(startingBalance.value(), userAccount.getBalance().value());
		assertStockPurchase(userAccount, "companyOrg", 3, 1000, 3);
		assertStockPurchase(userAccount, "companyOrg", 2, 750, 5);
		assertStockPurchase(userAccount, "anotherOrg", 1, 500, 1);
		assertStockPurchase(userAccount, "companyOrg", 2, 750, 7);
		
	}
	

	private void assertStockPurchase(UserAccount userAccount, String companyName, int numberOfShares, long totalCost, int expectedNumberOfShares) {
		Money startingBalance = userAccount.getBalance();
		Money total = new Money(totalCost);
		StockPurchase stockPurchase = new StockPurchase(companyName, total, numberOfShares);
		userAccount.buy(stockPurchase);
		assertEquals(startingBalance.decrement(total).value(), userAccount.getBalance().value());
		assertEquals(expectedNumberOfShares, userAccount.getNumberOfShares(companyName));
				
	}
	
	
	@Test
	public void userCanSellStock() {
		
		int balance = 5000;
		
		
		
	}
	
}
