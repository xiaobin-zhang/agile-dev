package com.agile.demo.demo2.chapter1.advance1;

public class CurrencyService {

	public String getAmt(Integer amount, Currency currency) {
		String amt = currency.formate(amount);
		return amt;
	}
}
