package com.agile.demo.demo4;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang.SerializationUtils;
import org.junit.Test;

import lombok.Data;

public class MainTest {
	
	@Test
	public void test() {
		BeanB beanB = new BeanB("B", new BigDecimal("1000"));
		BeanA beanA = new BeanA(beanB);
		BeanA beanA2 = beanA;
		beanA2.beanB.a = "A";
		beanA2.beanB.b = new BigDecimal("2000");
		System.out.println(beanA);
		System.out.println(beanA2);
		System.out.println("===============================");
		BeanA beanA3 = new BeanA();
		beanA3 = beanA;
		beanA3.beanB.a = "C";
		beanA3.beanB.b = new BigDecimal("3000");
		System.out.println(beanA);
		System.out.println(beanA2);
		System.out.println(beanA3);
		System.out.println("================================");
		BeanA beanA4 = (BeanA) SerializationUtils.clone(beanA);
		beanA4.beanB.a = "D";
		beanA4.beanB.b = new BigDecimal("4000");
		System.out.println(beanA);
		System.out.println(beanA4);
	}
	
}

@Data
class BeanA implements Serializable {
	private static final long serialVersionUID = 1L;
	BeanB beanB;
	
	BeanA() {}
	BeanA (BeanB beanB) {
		this.beanB = beanB;
	}
}

@Data
class BeanB implements Serializable {
	private static final long serialVersionUID = 1L;
	String a;
	BigDecimal b;
	
	BeanB() {}
	BeanB(String a, BigDecimal b) {
		this.a = a;
		this.b = b;
	}
}



