package com.jacstuff.stockplay.user;


import java.util.HashMap;
import java.util.Map;

import com.jacstuff.stockplay.stock.StockPurchase;

import money.Money;

public class UserAccount {


	private Map<String, Integer> sharesMap;
	private Money balance;
	
	public UserAccount() {
		sharesMap = new HashMap<String, Integer>();
		
	}
	
	
	public void setBalance(Money balance) {
		this.balance = balance;
	}
	
	public Money getBalance() {
		return balance;
	}
	
	public void buy(StockPurchase stockPurchase) {
		balance = balance.decrement(stockPurchase.getTotalCost());
		String name = stockPurchase.getName();
		int currentShares = sharesMap.getOrDefault(name, 0);
		currentShares += stockPurchase.getNumberOfShares();
		sharesMap.put(name, currentShares);		
	}
	
	public int getNumberOfShares(String companyName) {
		return sharesMap.get(companyName);
	}

}
