package com.agile.demo.demo2.advance1;

public class CurrencyESCUDO implements Currency{

	final public int ESCUDO = 2;

	@Override
	public String formate(int amount) {
		return String.valueOf(amount + amount * ESCUDO);
	}
	
}
