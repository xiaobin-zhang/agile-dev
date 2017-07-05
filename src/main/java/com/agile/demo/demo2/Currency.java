package com.agile.demo.demo2;

/**
 * 货币
 * @author zhangxiaobin
 *
 */
public class Currency {

	final public int USD = 0;
	
	final public int RMB = 1;
	
	final public int ESCUDO = 2;
	
	private int currencyCode;
	
	public Currency(int currencyCode){
		this.currencyCode = currencyCode;
	}
	
	public String formate(int amount) {
		String amt ;
		switch(currencyCode){
			case USD : 
				{
					amt = String.valueOf(amount + amount * USD);
				}
				break;
			case RMB : 
				{
					amt = String.valueOf(amount + amount * RMB);
				}
				break;
			case ESCUDO : 
				{
					amt = String.valueOf(amount + amount * ESCUDO);
				}
				break;
			default :
					amt = String.valueOf(amount);
				break;
		}
		return amt;
	}
}
