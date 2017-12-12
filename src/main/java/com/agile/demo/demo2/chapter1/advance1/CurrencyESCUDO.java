package com.agile.demo.demo2.chapter1.advance1;

import org.springframework.stereotype.Service;

@Service
public class CurrencyESCUDO implements Currency{

	final public int ESCUDO = 2;

	@Override
	public String formate(int amount) {
		return String.valueOf(amount + amount * ESCUDO);
	}
	
}
