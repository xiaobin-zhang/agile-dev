package com.agile.demo.demo2.chapter1.advance2;

import lombok.Data;

/**
 * 货币
 * @author zhangxiaobin
 *
 */
@Data
public class Currency {

	final static public int USD = 0;
	
	final static public int RMB = 1;
	
	final static public int ESCUDO = 2;
	
	private int currencyCode;
	
	public Currency(int codeType){
		this.currencyCode = codeType;
	}
	
	public String formate(int amount) {
		return String.valueOf(amount + amount * currencyCode); 
	}
	
	static Currency currencyUSD = new Currency(USD);
	static Currency currencyRMB = new Currency(RMB);
	static Currency currencyESCUDO = new Currency(ESCUDO);
	
}
