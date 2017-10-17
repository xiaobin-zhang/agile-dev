package com.agile.demo.demo2.chapter1;

public class CurrencyMain {

	public static void main(String[] args) {
		test1();
	}
	
	public static void test1(){
		Currency currency = new Currency(1);
		String formate = currency.formate(100);
		System.out.println(formate);
	}
}
