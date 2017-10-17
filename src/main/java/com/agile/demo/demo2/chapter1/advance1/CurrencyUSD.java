package com.agile.demo.demo2.chapter1.advance1;

public class CurrencyUSD implements Currency{

	final public int USD = 0;

	@Override
	public String formate(int amount) {
		return String.valueOf(amount + amount * USD);
	}
	
	
}
