package com.agile.demo.demo2.advance1;

public class CurrencyRMB implements Currency{

	final public int RMB = 1;
	
	@Override
	public String formate(int amount) {
		return String.valueOf(amount + amount * RMB);
	}

}
