package com.jacstuff.stockplay.test.stock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jacstuff.stockplay.stock.StockHolding;

public class StockHoldingTest {

	public StockHoldingTest() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Test
	public void canGetNameOfStockHolding(){
		assertCompanyName("companyCorp");
		assertCompanyName("anotherOrg");
	}
	
	private void assertCompanyName(String expectedName) {
		StockHolding stockHolding = new StockHolding(expectedName);
		assertEquals(expectedName, stockHolding.getName());
	}
	
	

}
