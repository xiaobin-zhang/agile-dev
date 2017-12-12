package com.agile.demo.demo2.chapter1.advance1;

import org.springframework.stereotype.Service;

@Service
public class CurrencyRMB implements Currency{

	final public int RMB = 1;
	
	@Override
	public String formate(int amount) {
		return String.valueOf(amount + amount * RMB);
	}

}
