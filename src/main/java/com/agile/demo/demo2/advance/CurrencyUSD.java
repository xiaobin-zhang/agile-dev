package com.agile.demo.demo2.advance;

public class CurrencyUSD implements Currency{

	final public int USD = 0;

	@Override
	public String formate(int amount) {
		return String.valueOf(amount + amount * USD);
	}
	
	
}
