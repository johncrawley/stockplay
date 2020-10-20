package com.jacstuff.stockplay.stock;

import money.Money;

public class StockPurchase {

	private Money totalCost; 
	private int numberOfShares;
	private String name;
	
	public StockPurchase(String name, Money price, int numberOfShares) {
		this.totalCost = price;
		this.numberOfShares = numberOfShares;
		this.name = name;
	}
	
	public Money getTotalCost() {
		return totalCost;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}
	
	public String getName() {
		return this.name;
	}
}
